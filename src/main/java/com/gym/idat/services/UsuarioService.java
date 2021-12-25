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
        if(usuariodto.getUsuario() == null) throw new BadRequest("Ingrese un nombre.");
        if(usuariodto.getUsuario().isEmpty()) throw new BadRequest("Ingrese un nombre.");
        Usuario username = repoUsuario.findByUsuario(usuariodto.getUsuario());
        if(username!=null) throw new BadRequest("El nombre del Cliente ya existe.");
        usuariodto.setUsuario(usuariodto.getUsuario());

        if(usuariodto.getContrasena() == null) throw new BadRequest("Ingrese una contraseña.");
        if(usuariodto.getContrasena().isEmpty()) throw new BadRequest("Ingrese una contraseña.");
        else {
            if (usuariodto.getContrasena().length() < 8)
                throw new BadRequest("Ingrese correctamente la constraseña (8 digitos)");
            Usuario password = repoUsuario.findByContrasena(usuariodto.getContrasena());
            if (password != null) throw new BadRequest("Contraseña inválida.");
            usuariodto.setContrasena(usuariodto.getContrasena());
        }
        if(usuariodto.getCliente().getId() == 0) throw new BadRequest("Seleccione el valor.");
        if(usuariodto.getCliente() == null) throw new BadRequest("Seleccione el valor.");
        Usuario Cliente = repoUsuario.findByCliente_Id(usuariodto.getCliente().getId());
        if(Cliente!=null) throw new BadRequest("El Cliente ya tiene una cuenta.");
        usuariodto.setCliente(usuariodto.getCliente());

        if(usuariodto.getRol() == null || usuariodto.getRol().getId() == 0){
            Rol rolcliente = repoRol.findByTipoRol("CLIENTE");
            usuariodto.setRol(rolcliente);
        }

      //utils
        Usuario user = MHelpers.modelMapper().map(usuariodto, Usuario.class);
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
