package com.ipartek.ejemplos.alexanderbilbao.dal;

import com.ipartek.ejemplos.alexanderbilbao.tipos.Usuario;

public interface UsuariosDAL {
	public void alta(Usuario usuario);

	public boolean validar(Usuario usuario);
}
