package com.gym.idat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
