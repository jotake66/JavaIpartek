package com.ipartek.tienda.alexanderbilbao.controladores;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.tienda.alexanderbilbao.dal.ArticuloDAL;
import com.ipartek.tienda.alexanderbilbao.dal.ArticuloDALFactory;
import com.ipartek.tienda.alexanderbilbao.tipos.Articulo;

@WebServlet("/articulocrud")
public class ArticuloCRUDServlet extends HttpServlet {
	private static final String RUTA_FORMULARIO_TIENDA = "/WEB-INF/vistasTienda/articuloform.jsp";
	private static final String RUTA_LISTADO_TIENDA = "/WEB-INF/vistasTienda/articulocrud.jsp";
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		ArticuloDAL dal = (ArticuloDAL) application.getAttribute("dal");

		if (dal == null) {
			dal = ArticuloDALFactory.getArticuloDAL();

			dal.alta(new Articulo("idarticiulo()", "nombre", "descripcion", "precio()"));

			application.setAttribute("dal", dal);
		}

		String op = request.getParameter("op");

		if (op == null) {

			Articulo[] idarticulo = dal.buscarTodosLosArticulos();

			request.setAttribute("idarticulo", idarticulo);

			request.getRequestDispatcher(RUTA_LISTADO_TIENDA).forward(request, response);
		} else {
			String id = request.getParameter("id");

			Articulo idarticulodal;

			switch (op) {
			case "modificar":
			case "borrar":
				idarticulodal = dal.buscarPorId(id);
				request.setAttribute("articulo", idarticulodal);
			case "alta":
				request.getRequestDispatcher(RUTA_FORMULARIO_TIENDA).forward(request, response);
				break;
			default:
				request.getRequestDispatcher(RUTA_LISTADO_TIENDA).forward(request, response);
			}
		}
	}
}
