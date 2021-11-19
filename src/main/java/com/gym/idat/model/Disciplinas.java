package com.gym.idat.model;

import lombok.Data;


import javax.persistence.*;
@Data
@Entity
public class Disciplinas  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String descripcion;
	private String imagen;
	
	/*@OneToMany(cascade = CascadeType.ALL,mappedBy = "disciplina")
	private List<Clase> clase;
	
	@OneToMany(mappedBy="clase")//referencia FK a nivel de entidades
	private Collection<Clase> clase=new ArrayList<>();*/


}
