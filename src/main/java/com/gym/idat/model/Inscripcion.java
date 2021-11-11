package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "inscripcion")
public class Inscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean estado;
	
	private Long idcliente;
	
	@ManyToOne
	private Planpago planpago;
	
	@ManyToOne
	private Clase clase;
	 
	

}
