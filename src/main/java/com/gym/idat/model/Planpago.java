package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

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

	
}
