package com.gym.idat.model;

import lombok.Data;


import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Mensualidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private String mes;
    private String monto;
}
