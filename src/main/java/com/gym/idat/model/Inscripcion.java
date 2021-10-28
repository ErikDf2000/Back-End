package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "inscripcion")
public class Inscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idinscriocion;
	
	private boolean estado;
	
	private int idcliente;
	
	private int id;
	 
	

}
