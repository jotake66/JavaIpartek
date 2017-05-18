package com.ipartek.tienda.alexanderbilbao.dal;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.tienda.alexanderbilbao.tipos.Articulo;

public class ArticuloDALColeccion implements ArticuloDAL {

	private Map<String, Articulo> idarticulo = new HashMap<String, Articulo>();

	@Override
	public void alta(Articulo idarticulodal) {
		if (idarticulo.containsKey(idarticulodal.getNombre()))
			throw new ArticuloYaExistenteDALException("Ya existe el usuario " + idarticulodal.getNombre());

		idarticulo.put(idarticulodal.getNombre(), idarticulodal);
	}

	@Override
	public boolean validar(Articulo idarticulodal) {
		return idarticulo.containsValue(idarticulodal);
	}

	@Override
	public void modificar(Articulo idarticulodal) {
		if (!idarticulo.containsKey(idarticulodal.getNombre()))
			throw new DALException("Intento de modificar articulo no existente " + idarticulodal);

		idarticulo.put(idarticulodal.getNombre(), idarticulodal);
	}

	@Override
	public void borrar(Articulo idarticulodal) {
		idarticulo.remove(idarticulodal.getNombre());
	}

	@Override
	public Articulo buscarPorId(String id) {
		return idarticulo.get(id);
	}

	@Override
	public Articulo[] buscarTodosLosArticulos() {
		// Usuario[] arr = new Usuario[usuarios.size()];
		//
		// int i = 0;
		//
		// for(Usuario usuario : usuarios.values())
		// arr[i++] = usuario;
		//
		// return arr;

		return idarticulo.values().toArray(new Articulo[idarticulo.size()]);
	}

	@Override
	public void alta() {
		// TODO Auto-generated method stub

	}

}
