package com.viewnext.registrosmedicos.bussines.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.registrosmedicos.bussines.model.Usuario;
import com.viewnext.registrosmedicos.bussines.services.UsuarioServices;
import com.viewnext.registrosmedicos.integration.model.UsuarioPL;
import com.viewnext.registrosmedicos.integration.repositories.UsuarioPLRepository;

@Service
public class UsuarioServicesImpl implements UsuarioServices{

	@Autowired
	private UsuarioPLRepository usuarioPLRepository;
	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Override
	public List<Usuario> getAll() {
		
		List<UsuarioPL> usuariosPL = usuarioPLRepository.findAll();
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		for (UsuarioPL usuarioPL : usuariosPL) {
			
			usuarios.add(dozerBeanMapper.map(usuarioPL, Usuario.class));
			
		}
		
		return usuarios;
	}
	
	@Override
	public Usuario read(String DNI) {
		
		Optional<UsuarioPL> usuarioOptional = usuarioPLRepository.findById(DNI);
		
		UsuarioPL usuarioPL = usuarioOptional.orElse(null);
		
		Usuario usuario = dozerBeanMapper.map(usuarioPL, Usuario.class);
		
		return usuario;
	}

	@Override
	public Usuario save(Usuario usuario) {
		
		UsuarioPL usuarioPL = usuarioPLRepository.save(dozerBeanMapper.map(usuario, UsuarioPL.class));
		
		Usuario createdUsuario = dozerBeanMapper.map(usuarioPL, Usuario.class);
		
		return createdUsuario;
	}
}
