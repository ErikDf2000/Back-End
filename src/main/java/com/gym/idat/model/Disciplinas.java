package com.gym.idat.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Data
@Entity
@Table(name = "disciplina")
public class Disciplinas  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;
	
	

}
