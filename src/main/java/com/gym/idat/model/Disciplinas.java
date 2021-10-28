package com.gym.idat.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "disciplina")
public class Disciplinas  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String modalidad;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate empieza;
	/*@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate acaba;
	*/
	private int idtrainer;

}
