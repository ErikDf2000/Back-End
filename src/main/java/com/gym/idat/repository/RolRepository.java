package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Rol;


public interface RolRepository extends JpaRepository<Rol, Long> {
    public Rol findByTipoRol(String TipoRol);
}
