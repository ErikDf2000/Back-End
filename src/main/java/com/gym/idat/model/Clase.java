package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;



import java.time.LocalDateTime;

@Data
@Entity

public class Clase  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long cuposmax;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//@JsonFormat(pattern = "HH:mm:ss.SSSZ",shape = JsonFormat.Shape.STRING)
//	@JsonFormat(pattern = "HH:mm")
	//@DateTimeFormat( iso = DateTimeFormat.ISO.TIME,pattern = "HH:mm")
	private LocalDateTime horaIni;

	//@Temporal(TemporalType.TIMESTAMP)
	//@JsonFormat(pattern = "HH:mm")
	//@DateTimeFormat( iso = DateTimeFormat.ISO.TIME,pattern = "HH:mm")
	private LocalDateTime horaFin;
	
	@ManyToOne(optional = false)
	private Disciplinas disciplina;
	
	
	@ManyToOne
	private Trainers trainers;
	
	@ManyToOne
	private Salon salon;
    


}
