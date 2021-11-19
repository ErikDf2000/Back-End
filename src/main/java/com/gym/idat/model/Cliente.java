package com.gym.idat.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente  {
	  
	
	//private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String apellido;	
	
	private String sexo;	
	
	private Long celular;
	
    private String correo;
    
    
    /*@ManyToOne
	private Reserva reserva;
    @OneToOne
    @JoinColumn
    private Planpago planpago;
*/
    }
