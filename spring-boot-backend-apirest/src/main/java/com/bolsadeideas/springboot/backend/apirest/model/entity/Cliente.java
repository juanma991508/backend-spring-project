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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Entity
@Table(name="clientes")
@Data
public class Cliente implements Serializable {
	public static final String NOT_EMPTY="No puede estar vacio";
	public static final String EMAIL="Debe tener formato de email";
	public static final String SIZE_BETWEEN_FOUR_AND_TWELVE="Debe tener formato de email";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = NOT_EMPTY)
	@Size(min=4,max=12,message=SIZE_BETWEEN_FOUR_AND_TWELVE)
	@Column(nullable=false)
	private String nombre;
	@NotEmpty(message = NOT_EMPTY)
	private String apellido;
	@NotEmpty(message = NOT_EMPTY)
	@Email(message=EMAIL)
	@Column(nullable=false)
	private String email;
	@NotNull(message="la fecha es erronea")
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private String foto;
	@NotNull(message = "la region no puede estar vacia")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Region region;
	
	@JsonIgnoreProperties({"cliente","hibernateLazyInitializer","handler"})
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente",cascade = CascadeType.ALL)
	private List<Factura> facturas;
	
	public Cliente() {
		this.facturas=new ArrayList<>();
	}
	
//	@PrePersist
//	public void prePersist() {
//		createAt=new Date();
//	}
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
