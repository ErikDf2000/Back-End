package com.gym.idat.model;

import lombok.Data;
import javax.persistence.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate fechaPago;
    private String descripcion;

    @Column(columnDefinition = "boolean default false")
    private Boolean estado ;

    @ManyToOne
    private Mensualidad mensualidad;
    
    @OneToMany//referencia FK a nivel de entidades
	private Collection<Planpago> pagos=new ArrayList<>();
	

//    @PrePersist
//    void Prepersit() {
//        estado = false;
//    }
}
