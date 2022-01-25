package com.gym.idat.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//utils
import com.gym.idat.Utils.BadRequest;
//utils
import com.gym.idat.Utils.MHelpers;
//utils.other
import com.gym.idat.Utils.other.UserDetailDTO;
//utils.other
import com.gym.idat.Utils.other.UsuarioClienteDTO;
//utils.other
import com.gym.idat.Utils.other.UsuarioLoginDTO;
import com.gym.idat.model.Rol;
import com.gym.idat.model.Usuario;
import com.gym.idat.repository.RolRepository;
import com.gym.idat.repository.UsuarioRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repoUsuario;

    @Autowired
    private RolRepository repoRol;
    


    public List<Usuario> ListarUsuario() {
        return repoUsuario.findAll();
    }

    public Usuario RegistrarUsuarioCliente(UsuarioClienteDTO usuariodto) {


        Usuario Cliente = repoUsuario.findByCliente_Id(usuariodto.getCliente().getId());
        if(Cliente!=null) throw new BadRequest("El Cliente ya tiene una cuenta.");
        usuariodto.setCliente(usuariodto.getCliente());




      //utils
        Usuario user = MHelpers.modelMapper().map(usuariodto, Usuario.class);
        Rol rolcliente = repoRol.findByTipoRol("CLIENTE");
        user.setRol(rolcliente);
        return repoUsuario.save(user);
    }


    public ResponseEntity<?> Login(UsuarioLoginDTO logindto){
        String username = logindto.getUsuario();
        String password = logindto.getContrasena();
        Map<String, Object> resp = new HashMap<>();
        if(username.isEmpty()) throw new BadRequest("Ingrese el nombre del usuario.");
        if(password.isEmpty()) throw new BadRequest("Ingrese la contraseña.");
        if(repoUsuario.existsUsuarioByUsuarioAndContrasena(username, password)){
            Usuario userlog = repoUsuario.findByUsuario(username);
            
            //utils
            UserDetailDTO userDetailDTO = MHelpers.modelMapper().map(userlog, UserDetailDTO.class);
            
            resp.put("message", "Credenciales válidas");
            resp.put("Usuario", userDetailDTO);
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }else {
            if(repoUsuario.existsUsuarioByUsuario(username)) throw new BadRequest("La contraseña es incorrecta.");
            if(repoUsuario.existsUsuarioByContrasena(password)) throw new BadRequest("El nombre de usuario es incorrecto.");
            if(!repoUsuario.existsUsuarioByUsuario(username) && !repoUsuario.existsUsuarioByContrasena(password)){
                resp.put("Error", "La contraseña y el nombre de usuario es incorrecto.");
                resp.put("message", "Credenciales no válidas");
            }
            return new ResponseEntity<>(resp, HttpStatus.UNAUTHORIZED);
        }
    }
}
