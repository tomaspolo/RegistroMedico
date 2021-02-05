package com.viewnext.registrosmedicos.integration.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viewnext.registrosmedicos.integration.model.RegistroPL;
import com.viewnext.registrosmedicos.integration.model.UsuarioPL;

@Repository
public interface UsuarioPLRepository extends JpaRepository<UsuarioPL, String>{

	@Query("SELECT r FROM RegistroPL r WHERE r.usuario.dni=:dni")
	public List<RegistroPL> findRegistros(String dni);
	
	@Query("SELECT r FROM RegistroPL r WHERE r.usuario.dni=:dni "
			+ "AND r.fechaRegistro BETWEEN :fechaInicio AND :fechaFin ")
	public List<RegistroPL> findRegistrosDate(String dni, Date fechaInicio, Date fechaFin);
	
	
}
