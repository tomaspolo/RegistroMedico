package com.viewnext.registrosmedicos.bussines.services;

import java.util.List;

import com.viewnext.registrosmedicos.bussines.model.Usuario;

public interface UsuarioServices {

	public List<Usuario> getAll();
	
	public Usuario read(String DNI);
	
	public Usuario save (Usuario usuario);
	
}
