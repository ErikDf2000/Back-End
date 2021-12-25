package com.gym.idat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gym.idat.Utils.other.UsuarioClienteDTO;
import com.gym.idat.Utils.other.UsuarioLoginDTO;
import com.gym.idat.model.Usuario;
import com.gym.idat.services.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService serviceUsuario;

    @GetMapping("/listar")
    public List<Usuario> ListarUsuario(){
        return serviceUsuario.ListarUsuario();
    }

    @PostMapping("/registrar/userCliente")
    public  ResponseEntity<?> RegistrarUsuarioCliente(@RequestBody UsuarioClienteDTO clientedto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceUsuario.RegistrarUsuarioCliente(clientedto));
    }

    
    @PostMapping("/login")
    public ResponseEntity<?> UsuarioLogin(@RequestBody UsuarioLoginDTO userlogin){
        return serviceUsuario.Login(userlogin);
    }
}
