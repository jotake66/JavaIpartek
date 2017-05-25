<%@ include file="includesTienda/cabeceraTienda.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Mantenimiento de Articulos</h2>

<table border="1">
	<thead>
		<tr>
			<th>Código de Articulo: </th>
			<th>Nombre ...........: </th>
			<th>Descripción ......: </th>
			<th>Precio ...........: </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.articulo}" var="articulo">
			<tr>
				<td>
					<a href="?op=modificar&id=${idarticulo.nombre}">Modificar</a>
					<a href="?op=borrar&id=${idarticulo.nombre}">Borrar</a>
				</td>
				<td>${idarticulo.nombre}</td>
				<td>${idarticulo.pass}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="includesTienda/pieTienda.jsp"%>
