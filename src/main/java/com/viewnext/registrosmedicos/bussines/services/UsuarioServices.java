package com.viewnext.registrosmedicos.bussines.services;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.viewnext.registrosmedicos.bussines.model.Registro;
import com.viewnext.registrosmedicos.bussines.model.Usuario;


@Service
public interface UsuarioServices {

	public List<Usuario> getAll();
	
	public Usuario read(String DNI);
	
	public Usuario save (Usuario usuario);
	
	
	public List<Registro> getRegistros(String dni);
	
	public List<Registro> getRegistrosBetweenDate(String dni,Date fechaInicio, Date fechaFin);
	
}
