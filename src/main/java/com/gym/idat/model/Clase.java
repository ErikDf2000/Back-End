package com.gym.idat.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Clase  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cuposmax;
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate inicio;
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fin;

	
	@ManyToOne(optional = false)
	private Disciplinas disciplina;
	
	//@JoinColumn(name = "trainers_id",referencedColumnName = "id")
	@ManyToOne
	private Trainers trainers;
	
	

   /* @OneToMany
	private List<Horario> horario;
	*/
	


}
