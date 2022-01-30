package com.bolsadeideas.springboot.backend.apirest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto,Long> {
	
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
