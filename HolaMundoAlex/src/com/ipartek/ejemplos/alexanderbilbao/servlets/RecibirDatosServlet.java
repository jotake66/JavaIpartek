package com.ipartek.ejemplos.alexanderbilbao.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Recibir")
// para recibir utilizamos GET
public class RecibirDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// Consultamos el area las consultas

		ServletContext application = getServletContext();
		application.setAttribute("todos", "comun");

		String dato = (String) session.getAttribute("dato");

		ServletContext aplication = getServletContext();

		String todos = (String) application.getAttribute("todos");

		PrintWriter out = response.getWriter();
		out.println("Nombre de usuario " + id);

	}

}
