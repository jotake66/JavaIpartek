<%@ include file="includesTienda/cabeceraTienda.jsp" %>

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
		<p class="errores">${usuario.errores}</p>           
		</fieldset>
	</form>
	
<%@ include file="includesTienda/pieTienda.jsp" %>