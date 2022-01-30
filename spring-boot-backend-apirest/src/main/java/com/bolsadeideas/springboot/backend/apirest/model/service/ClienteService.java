package com.bolsadeideas.springboot.backend.apirest.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Factura;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Region;

public interface ClienteService {
 public List<Cliente> findAll();
 public Page<Cliente> findAll(Pageable pageable);
 public Cliente save(Cliente cliente);
 public void delete(Long id);
 public Cliente findById(Long id);
 public List<Region> findAllRegiones();
 
 public Factura findFacturaById(Long id);
 
 public Factura saveFactura(Factura factura);
 
 public void deleteFacturaById(Long id);
 
 public List<Producto> findProductoByNombre(String term);
 
}
