package com.viewnext.registrosmedicos.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viewnext.registrosmedicos.bussines.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
