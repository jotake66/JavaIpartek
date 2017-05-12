package com.ipartek.tienda.alexanderbilbao.dal;

import com.ipartek.tienda.alexanderbilbao.tipos.Articulo;

public interface ArticuloDAL {

	public void alta(Articulo idarticulo);

	public void modificar(Articulo idarticulo);

	public void borrar(Articulo idarticulo);

	public Articulo buscarPorId(String id);

	public Articulo[] buscarTodosLosArticulos();

	public boolean validar(Articulo idarticulo);

	void alta();
}
