package com.gym.idat.Utils.other;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.gym.idat.model.Cliente;
import com.gym.idat.model.Rol;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioClienteDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private String usuario;
    private String contrasena;
    private Cliente cliente;
    private Rol rol;
}
