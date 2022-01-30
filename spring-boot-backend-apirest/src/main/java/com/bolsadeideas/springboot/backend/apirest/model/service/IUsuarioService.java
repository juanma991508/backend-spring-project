package com.bolsadeideas.springboot.backend.apirest.model.service;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);

}
