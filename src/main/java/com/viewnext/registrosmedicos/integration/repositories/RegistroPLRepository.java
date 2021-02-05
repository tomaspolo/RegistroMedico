package com.viewnext.registrosmedicos.integration.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.registrosmedicos.integration.model.RegistroPL;

@Repository
public interface RegistroPLRepository extends JpaRepository<RegistroPL, Long>{
	
}
