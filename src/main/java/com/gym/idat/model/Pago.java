package com.gym.idat.model;

import lombok.Data;
import javax.persistence.*;


import java.time.LocalDate;

@Data
@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaPago;
    private String descripcion;

    @Column
    private String estado ;

    @ManyToOne
    private Mensualidad mensualidad;
    
    
	

    @ManyToOne
	private Reserva reserva;
//    @PrePersist
//    void Prepersit() {
//        estado = false;
//    }
}
