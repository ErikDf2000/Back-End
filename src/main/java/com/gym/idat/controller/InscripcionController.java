package com.gym.idat.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.Utils.other.InscripcionDTO;
import com.gym.idat.model.Inscripcion;
import com.gym.idat.services.InscripcionService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {
	
	 @Autowired
	    private InscripcionService service; 
	
	
	 	@GetMapping
	    public List<Inscripcion> lista(){
	 		
	        return service.listado();
	    }
/*	
	   
*/	    
	    @PostMapping("/realizar")
	    public ResponseEntity<?> RealizarInscripcion(@RequestBody InscripcionDTO inscripcionDTO){
	    	inscripcionDTO.setEstado("Em Curso");
	        return service.RealizarInscripcion(inscripcionDTO);
	    }

	    @GetMapping("/buscar/{idc}/{fecha}/{id}")
	    public List<Inscripcion> lista( @PathVariable Long  idc,@PathVariable String fecha,@PathVariable Long  id){
	    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    	LocalDate ld = LocalDate.parse(fecha, formatter);

	    	LocalDateTime day = LocalDateTime.of(ld,LocalTime.of(23,59));
	        return service.listados(idc,day,id);
	    }

}
