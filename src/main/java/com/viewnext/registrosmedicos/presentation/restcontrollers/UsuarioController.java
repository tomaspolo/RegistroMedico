package com.viewnext.registrosmedicos.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.registrosmedicos.bussines.model.Usuario;
import com.viewnext.registrosmedicos.bussines.services.UsuarioServices;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioServices;
	
	@GetMapping()
	public List<Usuario> getAll(){
		return usuarioServices.getAll();
	}
		
	@GetMapping("/{dni}")
	public Usuario read(@PathVariable String dni){
		return usuarioServices.read(dni);
	}
	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioServices.save(usuario);
	}
	
}
