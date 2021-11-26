package com.gym.idat.model;

import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planpago")
public class Planpago {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private LocalDate inicio;
	private LocalDate finn ;

	@JsonIgnore
	@OneToMany(mappedBy="planpago") //referencia FK a nivel de entidades
	private Collection<Reserva> reserva=new ArrayList<>();
	private boolean estado;

	}
	
	/* @OneToOne(mappedBy="planpago")
	   private Cliente cliente;*/
	//@OneToMany//(cascade = CascadeType.ALL,mappedBy = "planpago")
	//private List<Pago> pago;
	
	
