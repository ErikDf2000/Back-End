package com.gym.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByContrasena(String contraseña);
    public Usuario findByUsuario(String username);

    public Usuario findByCliente_Id(Long IdCliente);


    Boolean existsUsuarioByUsuarioAndContrasena(String username, String password);
    Boolean existsUsuarioByUsuario(String username);
    Boolean existsUsuarioByContrasena(String password);
}
