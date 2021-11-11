package com.gym.idat.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "planpago")
public class Planpago {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private boolean estado;
	
	private LocalDate inicio;
	private LocalDate finn ;
	
	@OneToMany//referencia FK a nivel de entidades
	private Collection<Cliente> cliente=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "planpago")//referencia FK a nivel de entidades
	private List<Pago> pago;
	
	
}
