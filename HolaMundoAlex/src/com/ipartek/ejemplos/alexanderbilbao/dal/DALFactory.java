package com.ipartek.ejemplos.alexanderbilbao.dal;

public class DALFactory {

	public static UsuariosDAL getUsuariosDAL() {
		return new UsuariosDALColeccion();

	}
}
