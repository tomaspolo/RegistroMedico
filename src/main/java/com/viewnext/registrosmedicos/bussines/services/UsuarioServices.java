package com.viewnext.registrosmedicos.bussines.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viewnext.registrosmedicos.bussines.model.Usuario;

@Service
public interface UsuarioServices {

	public List<Usuario> getAll();
	
	public Usuario read(String DNI);
	
	public Usuario save (Usuario usuario);
	
}
