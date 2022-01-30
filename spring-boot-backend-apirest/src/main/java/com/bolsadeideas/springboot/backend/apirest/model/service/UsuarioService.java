package com.bolsadeideas.springboot.backend.apirest.model.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.model.dao.UsuarioDAO;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService,IUsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDAO.findByUsername(username);
		if (usuario==null) throw new UsernameNotFoundException("Error en el sistema no exite el usuario");
		List<GrantedAuthority> authorities=usuario.getRoles().stream().map(
				(rol)->	new SimpleGrantedAuthority(rol.getNombre())
				).collect(Collectors.toList());
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioDAO.findByUsername(username);
		if (usuario==null) throw new UsernameNotFoundException("Error en el sistema no exite el usuario");
		
		return usuario;
	}

}
