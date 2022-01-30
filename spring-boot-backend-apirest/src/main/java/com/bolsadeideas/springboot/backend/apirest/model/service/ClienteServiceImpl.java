package com.bolsadeideas.springboot.backend.apirest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.model.dao.ClienteDAO;
import com.bolsadeideas.springboot.backend.apirest.model.dao.FacturaDAO;
import com.bolsadeideas.springboot.backend.apirest.model.dao.ProductoDAO;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Factura;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.model.entity.Region;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDAO clienteDAO;
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private ProductoDAO productoDAO;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return clienteDAO.findAll();
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteDAO.save(cliente);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		clienteDAO.deleteById(id);
	}
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		
		return clienteDAO.findById(id).orElse(null);
	}
	@Override
	@Transactional(readOnly=true)
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return clienteDAO.findAll(pageable);
	}
	@Override
	@Transactional(readOnly=true)
	public List<Region> findAllRegiones() {
		// TODO Auto-generated method stub
		return clienteDAO.findAllRegiones();
	}
	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {
		// TODO Auto-generated method stub
		return facturaDAO.findById(id).orElse(null);
	}
	@Override
	public Factura saveFactura(Factura factura) {
		// TODO Auto-generated method stub
		return facturaDAO.save(factura);
	}
	@Override
	public void deleteFacturaById(Long id) {
		facturaDAO.deleteById(id);
		
	}
	@Override
	@Transactional(readOnly=true)
	public List<Producto> findProductoByNombre(String term) {
		// TODO Auto-generated method stub
		return productoDAO.findByNombre(term);
	}

}
