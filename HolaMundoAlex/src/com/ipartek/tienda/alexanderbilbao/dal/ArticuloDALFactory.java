package com.ipartek.tienda.alexanderbilbao.dal;


public class ArticuloDALFactory {
	public static ArticuloDAL getArticuloDAL() {
		// return new ArticuloDALArticuloUnico();
		return new ArticuloDALColeccion();

	}
}
