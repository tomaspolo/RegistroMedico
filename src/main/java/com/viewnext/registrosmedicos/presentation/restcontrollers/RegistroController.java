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

import com.viewnext.registrosmedicos.bussines.model.Registro;
import com.viewnext.registrosmedicos.bussines.services.RegistroServices;

@RestController
@CrossOrigin
@RequestMapping("/registros")
public class RegistroController {
	
	@Autowired
	private RegistroServices registroServices;
	
	@GetMapping()
	public List<Registro> getAll(){
		return registroServices.getAll();
	}
		
	@GetMapping("/{codigo}")
	public Registro read(@PathVariable int codigo){
		return registroServices.read(codigo);
	}
	
	@PostMapping
	public Registro save(@RequestBody Registro registro) {
		return registroServices.save(registro);
	}
	
}
