package com.bolsadeideas.springboot.backend.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Factura;

public interface FacturaDAO  extends JpaRepository<Factura,Long> {

}
