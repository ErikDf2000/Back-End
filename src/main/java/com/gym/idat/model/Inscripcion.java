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
	
	private String estado;
	
	
	@ManyToOne
	private Reserva reserva;
	
	@ManyToOne
	private Clase clase;
	 
	

}
