package com.gym.idat.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne//referencia FK a nivel de entidades
	//private Collection<Cliente> cliente=new ArrayList<>();
	private Cliente cliente;
	
	@ManyToOne
	private Planpago planpago;
	
	//@OneToMany//(mappedBy="reserva") 
//	private Collection<Cliente> cliente=new ArrayList<>();
	
	private Boolean Estado;

}
