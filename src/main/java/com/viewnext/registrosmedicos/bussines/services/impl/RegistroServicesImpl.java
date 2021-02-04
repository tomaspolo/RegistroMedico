package com.viewnext.registrosmedicos.bussines.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;

import com.viewnext.registrosmedicos.bussines.model.Registro;
import com.viewnext.registrosmedicos.bussines.services.RegistroServices;
import com.viewnext.registrosmedicos.integration.model.RegistroPL;
import com.viewnext.registrosmedicos.integration.repositories.RegistroPLRepository;

public class RegistroServicesImpl implements RegistroServices{

	private RegistroPLRepository registroPLRepository;
	
	private DozerBeanMapper dozerBeanMapper;
	
	@Override
	public List<Registro> getAll() {
		
		List<RegistroPL> registrosPL = registroPLRepository.findAll();
		
		List<Registro> registros = new ArrayList<Registro>();
		
		for (RegistroPL registroPL : registrosPL) {
			
			registros.add(dozerBeanMapper.map(registroPL, Registro.class));
			
		}
		
		return registros;
	}

	@Override
	public Registro read(int codigo) {
		
		Optional<RegistroPL> registroOptional = registroPLRepository.findById(codigo);
		
		RegistroPL registroPL = registroOptional.orElse(null);
		
		Registro registro = dozerBeanMapper.map(registroPL, Registro.class);
		
		return registro;
	}

	@Override
	public Registro save(Registro registro) {
		
		RegistroPL registroPL = registroPLRepository.save(dozerBeanMapper.map(registro, RegistroPL.class));
		
		Registro createdRegistro = dozerBeanMapper.map(registroPL, Registro.class);
		
		return createdRegistro;
	}

}
