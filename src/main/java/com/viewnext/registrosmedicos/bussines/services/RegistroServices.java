package com.viewnext.registrosmedicos.bussines.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viewnext.registrosmedicos.bussines.model.Registro;

@Service
public interface RegistroServices {

	public List<Registro> getAll();
	
	public Registro read(int codigo);
	
	public Registro save(Registro registro);
	
	
	
}
