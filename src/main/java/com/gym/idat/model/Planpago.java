package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@Table(name = "planpago")
public class Planpago {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private boolean estado;
	
	private LocalDate inicio;
	private LocalDate finn ;
	
	@OneToMany//referencia FK a nivel de entidades
	private Collection<Cliente> cliente=new ArrayList<>();
	/*
	@OneToOne
	private Cliente cliente;
	*/
	/*@ManyToOne
	private Pago pago;
*/	
}
