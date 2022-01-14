package com.gym.idat.controller;

import com.gym.idat.Utils.other.ReservaDTO;
import com.gym.idat.model.Reserva;
import com.gym.idat.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservaService service;


    @GetMapping
    public List<Reserva> listado() {
        return service.listado();

    }

    
    @PostMapping
    public ResponseEntity<?> Registrar(@RequestBody ReservaDTO reservaDTO) {
        return service.RegistrarReserva(reservaDTO);
    }

    @PutMapping
    public ResponseEntity<?> updateReserva(@RequestBody ReservaDTO reservaDTO) {
        return service.updateReserva(reservaDTO);
    }
    
    
    @Transactional(readOnly=true)
    @GetMapping("/filtroCliente")
    public ResponseEntity<?> FiltroCliente(@RequestParam String dato){
    	List<Reserva> find = service.FiltroReserva(dato, dato);
        return ResponseEntity.status(HttpStatus.OK).body(find);
    }
    
    @Transactional(readOnly=true)
    @GetMapping("/buscarReservaBy/{id}")
    public ResponseEntity<?> SearchReservaByClienteId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findReservaForIdCliente(id));
    }
}
