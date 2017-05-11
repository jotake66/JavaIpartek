package com.ipartek.tienda.alexanderbilbao.dal;


public interface ArticuloDAL {

	public void alta(Articulo idarticulo);

	public void modificar(Idarticulo idarticulo);

	public void borrar(Idarticulo idarticulo);

	public Idarticulo buscarPorId(String id);

	public Idarticulo[] buscarTodosLosArticulos();

	public boolean validar(Idarticulo idarticulo);
}
