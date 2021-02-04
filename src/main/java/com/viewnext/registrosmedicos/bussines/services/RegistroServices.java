package com.viewnext.registrosmedicos.bussines.services;

import java.util.List;

import com.viewnext.registrosmedicos.bussines.model.Registro;

public interface RegistroServices {

	public List<Registro> getAll();
	
	public Registro read(int codigo);
	
	public Registro save();
	
	
	
}
