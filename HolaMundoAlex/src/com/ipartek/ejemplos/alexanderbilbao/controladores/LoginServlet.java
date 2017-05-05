package com.ipartek.ejemplos.alexanderbilbao.controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.ejemplos.alexanderbilbao.dal.DALFactory;
import com.ipartek.ejemplos.alexanderbilbao.dal.UsuariosDAL;
import com.ipartek.ejemplos.alexanderbilbao.tipos.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static final String RUTA = "/WEB-INF/vistas/";
	private static final String RUTA_PRINCIPAL = RUTA + "principal.jsp";
	private static final String RUTA_LOGIN = RUTA + "login.jsp";

	private static final int TIEMPO_INACTIVIDAD = 30 * 60;

	static final int MINIMO_CARACTERES = 4;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recoger datos de vistas
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		String opcion = request.getParameter("opcion");

		// Crear modelos en base a los datos
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPass(pass);

		// Llamada a l�gica de negocio
		ServletContext application = request.getServletContext();

		UsuariosDAL usuariosDAL = (UsuariosDAL) application.getAttribute(AltaServlet.USUARIOS_DAL);

		if (usuariosDAL == null) {
			usuariosDAL = DALFactory.getUsuariosDAL();
		}

		// S�lo para crear una base de datos falsa con el
		// contenido de un usuario "javi", "lete"
		// usuarioDAL.alta(new Usuario("javi", "lete"));

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(TIEMPO_INACTIVIDAD);

		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(TIEMPO_INACTIVIDAD);
		response.addCookie(cookie);

		// for (Cookie cookie : request.getCookies()) {
		// if ("JSESSIONID".equals(cookie.getName())) {
		// cookie.setMaxAge(TIEMPO_INACTIVIDAD);
		// response.addCookie(cookie);
		// }
		// }

		// ESTADOS
		boolean esValido = usuariosDAL.validar(usuario);
		boolean sinParametros = usuario.getNombre() == null;
		boolean esUsuarioYaRegistrado = session.getAttribute("usuario") != null;
		boolean quiereSalir = "logout".equals(opcion);
		boolean nombreValido = usuario.getNombre() != null && usuario.getNombre().length() >= MINIMO_CARACTERES;
		boolean passValido = !(usuario.getPass() == null || usuario.getPass().length() < MINIMO_CARACTERES);

		// Redirigir a una nueva vista
		if (quiereSalir) {
			session.invalidate();
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		} else if (esUsuarioYaRegistrado) {
			request.getRequestDispatcher(RUTA_PRINCIPAL).forward(request, response);
		} else if (sinParametros) {
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		} else if (!nombreValido || !passValido) {
			usuario.setErrores("El nombre y la pass deben tener como m�nimo " + MINIMO_CARACTERES + " caracteres y son ambos requeridos");
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		} else if (esValido) {
			session.setAttribute("usuario", usuario);
			// response.sendRedirect("principal.jsp");
			request.getRequestDispatcher(RUTA_PRINCIPAL).forward(request, response);
		} else {
			usuario.setErrores("El usuario y contrase�a introducidos no son v�lidos");
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher(RUTA_LOGIN).forward(request, response);
		}
	}
}
