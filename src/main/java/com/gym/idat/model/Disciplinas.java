package com.gym.idat.model;

import lombok.Data;
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
