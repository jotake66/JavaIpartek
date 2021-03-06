package com.ipartek.tienda.alexanderbilbao.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecerasTienda/*")
public class CabecerasServletTienda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		// Enumeration<String> e = request.getHeaderNames();
		//
		// while (e.hasMoreElements()) {
		// }
		out.println(request.getHeader("accept-language"));
		out.println(request.getHeader("user-agent"));
		out.println(request.getRemoteAddr());
		out.println(Arrays.toString(request.getPathInfo().split("/")));
		out.println(request.getQueryString());
	}

}
