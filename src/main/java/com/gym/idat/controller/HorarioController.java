package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.model.Horario;
import com.gym.idat.services.HorarioService;

@RestController //indica que es un Servicio REST
@RequestMapping("/horario")
public class HorarioController {
	
	@Autowired
    private HorarioService service;

	@PostMapping
    public Horario addHorarios(@RequestBody Horario  disciplinas) {
        return service.save(disciplinas);
    }

    @GetMapping
    public List<Horario> findAllHorarios() {
        return service.getHorarios();
    }

}
