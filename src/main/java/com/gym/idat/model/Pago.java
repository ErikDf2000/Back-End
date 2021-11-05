package com.gym.idat.model;

import lombok.Data;
import javax.persistence.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    
    
	

    @ManyToOne
	private Planpago planpago;
//    @PrePersist
//    void Prepersit() {
//        estado = false;
//    }
}
