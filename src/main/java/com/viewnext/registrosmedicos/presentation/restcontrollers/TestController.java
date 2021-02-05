package com.viewnext.registrosmedicos.presentation.restcontrollers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.registrosmedicos.bussines.model.Usuario;
import com.viewnext.registrosmedicos.integration.model.PresionArterialPL;
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
	
	@GetMapping("/{dni}/peso-medio")
	public double getPesoMedio(@PathVariable String dni, @RequestParam int mes, @RequestParam int ano) {
		return usuarioPLRepository.getPesoMedio(dni, mes, ano);
	}
	
	@GetMapping("/{dni}/peso-medio-meses")
	public List<Double> getPesoMedioPorMeses(@PathVariable String dni, @RequestParam int ano) {
		return usuarioPLRepository.getPesoMedioPorMeses(dni, ano);
	}
	
	@GetMapping("/{dni}/tension-media")
	public PresionArterialPL getTensionMedia(@PathVariable String dni, @RequestParam int mes, @RequestParam int ano) {

		return usuarioPLRepository.getMediaPorAnyoMes(dni, mes, ano);
		
	}
	
	@GetMapping("/problema1")
	public Object getDiasDiferenciaPresion(/*String dni, Date fechaInicio, Date fechaFin*/ ) {
		String dni = "777777A";
		Date fecha1 = new Date(0);
		Date fecha2 = new Date();
	
		return usuarioPLRepository.getDiasDiferenciaPresion(dni, fecha1, fecha2);
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
