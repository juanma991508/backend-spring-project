package com.bolsadeideas.springboot.backend.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Usuario;

public interface UsuarioDAO  extends JpaRepository<Usuario,Long>{
	
	public Usuario findByUsername(String username);

}
