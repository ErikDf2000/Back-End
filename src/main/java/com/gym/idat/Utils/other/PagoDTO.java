package com.gym.idat.Utils.other;

import lombok.Data;

@Data
public class PagoDTO {
    private Long cliente;
    private Long planpago;
	private boolean estado;
}
