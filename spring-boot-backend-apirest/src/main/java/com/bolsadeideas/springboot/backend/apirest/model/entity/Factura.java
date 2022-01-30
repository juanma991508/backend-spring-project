package com.bolsadeideas.springboot.backend.apirest.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="facturas")
@Data
public class Factura  implements Serializable {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String descripcion;
	
	private String observacion;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@NotNull(message = "el cliente no puede estar vacio")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cliente_id")
	@JsonIgnoreProperties({"facturas","hibernateLazyInitializer","handler"})
	private Cliente cliente;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "factura_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private List<ItemFactura> items;
	
	@PrePersist
	public void prePersistCreateAt() {
		this.createAt=new Date();
		
	}
	
	public Factura() {
		this.items=new ArrayList<ItemFactura>();
	}
	
	
	
	public Double getTotal() {
		Double total=0.00; 
		total=items.stream().mapToDouble(l -> l.getImporte()).sum();
		System.out.println(total);
		return total;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
