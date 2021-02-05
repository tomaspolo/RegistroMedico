package com.viewnext.registrosmedicos.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.registrosmedicos.bussines.model.Usuario;
import com.viewnext.registrosmedicos.integration.repositories.RegistroPLRepository;
import com.viewnext.registrosmedicos.integration.repositories.UsuarioPLRepository;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UsuarioPLRepository usuarioPLRepository;
	
	@Autowired
	private RegistroPLRepository registroPLRepository;
	
	
	public double getTensionMedia() {
		return 0;
	}
	
	public double getPesoMedio() {
		return 0;
	}
	
	public List<Double> getPesoMedioPorMeses() {
		return null;
	}
	
	public int getDiasDiferenciaPresion() {
		return 0;
	}
	
	public double getDiferenciaPesoEntre() {
		return 0;
	}
	
	public List<Object> getTensionMediaPorSexo() {
		return null;
	}
	
	public List<Object> getTensionMediaPorEdad() {
		return null;
	}
	
	public double getPorcentajeNoUsaGeolocalizacion() {
		return 0;
	}
	
	public List<Usuario> getUsuariosNoDatosDesde() {
		return null;
	}
	
}
