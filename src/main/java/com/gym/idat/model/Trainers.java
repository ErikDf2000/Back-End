package com.gym.idat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Trainers{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;//
	private String apellido;//
	private LocalDate fechaNac;
	private Long telefono;//
	private String descripcion;
	private Long dni;
	private String genero;
	private String altura;
	private String peso;
	private String foto;
	
	
	/*@OneToMany(cascade = CascadeType.ALL,mappedBy = "trainers")
	private List<Clase> clase;*/
	
	
	@JoinTable(name = "disciplinas_de_trainers",
			joinColumns = {  @JoinColumn(name = "id_trainer",referencedColumnName = "id")  },
			inverseJoinColumns = { @JoinColumn(name = "id_disciplina",referencedColumnName = "id")	}
			)	
	@ManyToOne
	private Disciplinas disciplinas;



	
}
