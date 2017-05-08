package com.ipartek.ejemplos.alexanderbilbao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.ejemplos.alexanderbilbao.dal.UsuariosDAL;
import com.ipartek.ejemplos.alexanderbilbao.dal.UsuariosDALUsuarioUnico;
import com.ipartek.ejemplos.alexanderbilbao.tipos.Usuario;

@WebServlet(name = "Saludo", urlPatterns = { "/hola" })
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosDAL usuariosDAL = new UsuariosDALUsuarioUnico();

		usuariosDAL.alta(new Usuario("javi", "Lete"));

		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		// http://localhost:8080/pruebas/hola?nombre=Javier+Lete
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		Usuario usuario = new Usuario(nombre, pass);

		if (usuariosDAL.validar(usuario))
			out.println("Bienvenido");
		else
			out.println("Usuario no v�lido");

		// if (nombre == null || nombre.trim().length() == 0)
		// out.println("Hola desconocido");
		// else if ("javierlete".equals(nombre) && "SuperS3creta".equals(pass))
		// out.println("Bienvenido " + nombre);
		// else
		// out.println("No ha colado el usuario y contrase�a");

		// out.println("Hola " + nombre);
		// out.println(new java.util.Date());
	}

}
