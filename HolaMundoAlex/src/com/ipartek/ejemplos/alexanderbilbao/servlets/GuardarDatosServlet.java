package com.ipartek.ejemplos.alexanderbilbao.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// si codigo no esta en blanco               
// si los dos codigos son iguales      
// si el nombre no esta en blanco                  si no esta en blenco y no esta repetido 
// generamos un usuario nuevo - ALTA               traemos su nombre y completamos con el nombre

@WebServlet("/Guardar & Recibir")
public class RecibirDatosServlet extends HttpServlet {
public class GuardarDatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String (id, nombre)
	
	public int hashCode() {
		bolean equal = true
				
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("codigo");
		
		// mirar si es alta o consulta
		
        // ********************
		// TRATAMIENTO DE ALTAS
		// ********************
		switch
		
    	HttpSession sesion = request.getSession();

		    if codigo || null {
		  
                    // Volvemos a pedir un segundo codigo en FormularioAlta
	                // y validamos que el segundo tampoco esta en blanco
		            case bolean equal String(id) = true;  
			        // bolean equal String(id) compara si dos cadenas alfanumerica son iguales
			        // si los dos codigos son iguales -> generamos un ALTA
  
		    
		            sesion.setAttribute("dato", dato);
	    	        ServletContext application = getServletContext();
		
		            application.setAttribute("todos", "Común");
        		    break 
        		    
		            case bolean equal String(id) = false;
		             // los codigos son diferentes
		             // generamos mensaje de CODIGOS DIFERENTES y lo sacamos del bucle
     	     	     break   
     	     	     
     	     	 break
     	    endcase
     	    
     	    // TRATAMIENTO DE CONSULTAS
     	    // recibe el nombre a partir del id

     		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   			HttpSession session = request.getSession();

   			// Creamos el area comun para todos para recibir la informacion
   			HttpSession sesion = request.getSession();
        	String dato = (String) session.getAttribute("dato");

	        ServletContext aplication = getServletContext();
            String todos = (String) application.getAttribute("todos");

}
