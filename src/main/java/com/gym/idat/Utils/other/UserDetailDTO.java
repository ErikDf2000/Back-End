package com.gym.idat.Utils.other;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.gym.idat.model.Admin;
import com.gym.idat.model.Cliente;
import com.gym.idat.model.Rol;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private Admin administrador;
    private Cliente cliente;
    private Rol rol;
    private String usuario;
}
