<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<h2>Alta de Articulos</h2>
	
	<jsp:useBean id="idarticulo" scope="request"
		class="com.ipartek.tienda.alexanderbilbao.tipos.Articulo" />

	<form action="alta" method="post">
 		<fieldset>
          	<label for="Id Articulo">Idarticulo</label> <input id="idarticulo" name="idarticulo"
			  required="required" minlength="4" value="${idarticulo.nombre}" />
		</fieldset>

		<fieldset>
			<input type="submit" value="Alta" />
		<p class="errores">${idarticulo.errores}</p>           
		</fieldset>
	</form>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>