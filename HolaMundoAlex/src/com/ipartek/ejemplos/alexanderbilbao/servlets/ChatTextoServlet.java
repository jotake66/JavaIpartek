package com.ipartek.ejemplos.alexanderbilbao.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChatTexto
 */
@WebServlet("/ChatTexto")
public class ChatTextoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");

		HttpSession session = request.getSession();

		session.setAttribute("nombre", nombre);
		
		PrintWriter out = response getWriter();
		
		out.print

	}
}
