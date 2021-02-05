package com.viewnext.registrosmedicos.integration.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.viewnext.registrosmedicos.integration.model.PresionArterialPL;
import com.viewnext.registrosmedicos.integration.model.RegistroPL;
import com.viewnext.registrosmedicos.integration.model.UsuarioPL;

@Repository
public interface UsuarioPLRepository extends JpaRepository<UsuarioPL, String>{

	@Query("SELECT new com.viewnext.registrosmedicos.integration.model.PresionArterialPL(AVG(r.presionArterial.presionMin), AVG(r.presionArterial.presionMax)) "
			+ "FROM RegistroPL r "
			+ "WHERE r.usuario.dni = :dni "
			+ "AND MONTH(r.fechaRegistro) = :mes "
			+ "AND YEAR(r.fechaRegistro) = :ano")
	public PresionArterialPL getMediaPorAnyoMes(String dni, int ano, int mes);
	
	@Query("SELECT AVG(r.peso) "
		       + "FROM RegistroPL r WHERE r.usuario.dni = :dni "
		       + "AND MONTH(r.fechaRegistro) = :mes AND YEAR(r.fechaRegistro) = :ano")
	public double getPesoMedio(String dni, int mes, int ano);
	
	@Query("SELECT AVG(r.peso) FROM RegistroPL r WHERE r.usuario.dni = :dni "
			   + "AND YEAR(r.fechaRegistro) = :ano GROUP BY MONTH(r.fechaRegistro)")
	public List<Double> getPesoMedioPorMeses(@PathVariable String dni, @RequestParam int ano);
	
	@Query("SELECT COUNT(r) FROM RegistroPL r "
			+ " WHERE r.fechaRegistro IS BETWEEN :fechaInicio AND :fechaFin "
			+ "GROUP BY r.usuario.dni")
	public List<Object[]> getDiasDiferenciaPresion(String dni, Date fechaInicio, Date fechaFin );
	
	
	
	
	
	/***********************************************************************************/
	
	
	@Query("SELECT r FROM RegistroPL r WHERE r.usuario.dni=:dni")
	public List<RegistroPL> findRegistros(String dni);
	
	@Query("SELECT r FROM RegistroPL r WHERE r.usuario.dni=:dni "
			+ "AND r.fechaRegistro BETWEEN :fechaInicio AND :fechaFin ")
	public List<RegistroPL> findRegistrosDate(String dni, Date fechaInicio, Date fechaFin);
	

	// Documentacion, otra posible solucion para PresionArterialPL getMediaPorAnyoMes
	//	@Query("SELECT AVG(r.presionArterial.presionMin),  AVG(r.presionArterial.presionMax)"
	//			+ "FROM RegistroPL r "
	//			+ "WHERE r.usuario.dni = :dni "
	//			+ "AND MONTH(r.fechaRegistro) = :mes "
	//			+ "AND YEAR(r.fechaRegistro) = :ano")
	//	public List<Object[]> getMediaPorAnyoMes2 (String dni, int ano, int mes);


//	@Query("SELECT COUNT (*) FROM RegistroPL r "
//				   + "WHERE r.usuario.dni = :dni "
//				   + "AND r.presionArterial.presionMax - r.presionArterial.presionMin >= 20 "
//				   + "AND r.fechaRegistro BETWEEN :fechaInicio AND :fechaFin")
	
	
}
