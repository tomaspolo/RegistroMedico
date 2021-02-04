package com.viewnext.registrosmedicos.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.registrosmedicos.bussines.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Integer>{

}
