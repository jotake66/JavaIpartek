
<%@ include file="includesTienda/cabeceraTienda.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<h2>Formulario de articulos</h2>
	
	<jsp:useBean id="idarticulo" scope="request"
		class="com.ipartek.tienda.alexanderbilbao.tipos.Articulo" />

	<form action="articulocrud" method="post">
		<fieldset>
			<label for="idarticulo">Articulo</label> <input id="idarticulo" name="nombre"
			  required="required" minlength="4" value="${idarticulo.nombre}" />
		</fieldset>
			<fieldset>
			<input type="submit" value="Alta" />
			<p class="errores">${idarticulo.errores}</p>
		</fieldset>
	</form>


</head>
<body>

</body>
</html>
<%@ include file="includesTienda/pieTienda.jsp" %>