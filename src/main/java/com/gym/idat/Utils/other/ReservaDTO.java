package com.gym.idat.Utils.other;

import com.gym.idat.model.Cliente;
import com.gym.idat.model.Planpago;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
@Data
public class ReservaDTO {

    private Long id;
    private Long cliente;
    private Long planpago;
    private Date fecha;
    private Boolean Estado;


}

