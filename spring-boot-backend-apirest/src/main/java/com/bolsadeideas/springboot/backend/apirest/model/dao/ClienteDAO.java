package com.bolsadeideas.springboot.backend.apirest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Region;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente,Long> {
	@Query("from Region")
	public List<Region> findAllRegiones();

}
