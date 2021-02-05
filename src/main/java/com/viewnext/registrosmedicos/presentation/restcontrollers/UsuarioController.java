package com.viewnext.registrosmedicos.presentation.restcontrollers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.registrosmedicos.bussines.model.Registro;
import com.viewnext.registrosmedicos.bussines.model.Usuario;
import com.viewnext.registrosmedicos.bussines.services.RegistroServices;
import com.viewnext.registrosmedicos.bussines.services.UsuarioServices;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioServices;
	
	@Autowired
	private RegistroServices registroServices;
	
	@GetMapping()
	public List<Usuario> getAll(){
		return usuarioServices.getAll();
	}
		
	@GetMapping("/{dni}")
	public Usuario read(@PathVariable String dni){
		return usuarioServices.read(dni);
	}
	
	@GetMapping("/{dni}/registros")
	public List<Registro> getRegistroUsuario(@PathVariable String dni, @RequestParam(name = "fechaInicio", required = false)
											 @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio, 
											 @RequestParam(name = "fechaFin", required = false) 
											 @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaFin){
		
		List<Registro> registros = null;
		
		if(fechaInicio == null || fechaFin == null) {
			registros =  usuarioServices.getRegistros(dni);
		}else {
			registros = usuarioServices.getRegistrosBetweenDate(dni, fechaInicio, fechaFin);
		}
		
		return registros;
	}

	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioServices.save(usuario);
	}
	
	@PostMapping("/{dni}/alta-registro")
	public Registro postRegistro(@PathVariable String dni, @RequestBody Registro registro) {
		Usuario usuario = new Usuario();
		Registro registroAGuardar = null;
		
		try{	
			usuario = usuarioServices.read(dni);
		}catch(Exception e) {
			
		}
		registro.setUsuario(usuario);
		registroAGuardar = registroServices.save(registro);
		return registroAGuardar;
	}
	
	
	
}
