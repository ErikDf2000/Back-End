package com.gym.idat.Utils.other;

import java.sql.Date;

import lombok.Data;



@Data
public class ReservaDTO {

    private Long id;
    private Long cliente;
    private Long planpago;
    private Date fecha;
    private Boolean Estado;

}
