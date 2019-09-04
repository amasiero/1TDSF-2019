package com.andreymasiero.servlets.bussiness;

import com.andreymasiero.servlets.dao.UsuarioDAO;
import com.andreymasiero.servlets.model.entities.Usuario;

public class UsuarioBO {

	public Usuario autenticar(Usuario u) {
		Usuario usuario = new UsuarioDAO().consultarPorLogin(u.getLogin());
		if(usuario == null) return null;
		if(!usuario.getSenha().equals(u.getSenha())) return null;
		return usuario;
	}
	
	public boolean validarUsuario(Usuario u) {
		return u.getNome() != null && 
				u.getLogin() != null && 
				u.getSenha() != null; 
	}
}
