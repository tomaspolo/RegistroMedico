package com.viewnext.registrosmedicos.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.registrosmedicos.bussines.model.Registro;
import com.viewnext.registrosmedicos.integration.model.RegistroPL;

@Repository
public interface RegistroPLRepository extends JpaRepository<RegistroPL, Long>{
	
}
