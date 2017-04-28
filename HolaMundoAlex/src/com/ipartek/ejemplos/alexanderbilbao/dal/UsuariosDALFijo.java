package com.ipartek.ejemplos.alexanderbilbao.dal;

import com.ipartek.ejemplos.alexanderbilbao.tipos.Usuario;

public class UsuariosDALFijo implements UsuariosDAL {

	private Usuario usuario;

	@Override
	public void alta(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean validar(Usuario usuario) {
		return this.usuario.equals(usuario);
	}

}
