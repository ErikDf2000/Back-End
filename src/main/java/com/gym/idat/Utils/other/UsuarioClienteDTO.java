package com.gym.idat.Utils.other;


import lombok.*;

import java.io.Serializable;

import com.gym.idat.model.Cliente;
import com.gym.idat.model.Rol;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioClienteDTO implements Serializable {
    /**
	 * 
	 */

    private String usuario;
    private String contrasena;
    private Cliente cliente;
}
