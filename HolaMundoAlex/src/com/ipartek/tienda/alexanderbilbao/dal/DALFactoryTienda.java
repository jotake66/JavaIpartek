package com.ipartek.tienda.alexanderbilbao.dal;

public class DALFactoryTienda {
	public static ArticuloDAL getUsuariosDAL() {
		// return new UsuariosDALUsuarioUnico();
		return new UsuariosDALColeccion();
	}
}
