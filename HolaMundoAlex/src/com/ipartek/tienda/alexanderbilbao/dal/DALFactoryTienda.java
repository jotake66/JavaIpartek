package com.ipartek.tienda.alexanderbilbao.dal;

public class DALFactoryTienda {
	public static ArticuloDAL getArticuloDAL() {
		// return new ArticuloDALArticuloUnico();
		return new ArticuloDALColeccion();
	}
}
