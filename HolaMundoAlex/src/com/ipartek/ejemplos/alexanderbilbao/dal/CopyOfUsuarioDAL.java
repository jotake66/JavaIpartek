package com.ipartek.ejemplos.alexanderbilbao.dal;

import com.ipartek.ejemplos.alexanderbilbao.tipos.Usuario;

public interface CopyOfUsuarioDAL {
	public void alta(Usuario usuario);

	public boolean validar(Usuario usuario);
}
