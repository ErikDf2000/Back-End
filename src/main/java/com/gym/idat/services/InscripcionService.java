package com.gym.idat.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gym.idat.Utils.other.InscripcionDTO;
import com.gym.idat.model.Clase;
import com.gym.idat.model.Inscripcion;
import com.gym.idat.model.Planpago;
import com.gym.idat.repository.ClaseRepository;
import com.gym.idat.repository.InscripcionRepository;
import com.gym.idat.repository.PlanpagoRepository;

@Service
public class InscripcionService {
	
	 @Autowired
	    private InscripcionRepository repository;
	 @Autowired
	    private PlanpagoRepository repositoryplan;
	 @Autowired
	    private ClaseRepository repositoryclas;
	
	 
	 public List<Inscripcion> listado(){
	        return repository.findAll();
	    }
	
	    /*public String  save(Inscripcion clase){
	        repository.save(clase);
	        return "Registro Exitoso";
	    }
	    
	    public Inscripcion save(Inscripcion inscripcion) {
	        return repository.save(inscripcion);
	    }*/
	    public ResponseEntity<?> RealizarInscripcion(InscripcionDTO dto){
	        Clase clase = repositoryclas.findClaseById(dto.getClase());
	        Planpago plan = repositoryplan.findPlanpagoById(dto.getPlanpago());
	        Map<String, Object> respon = new HashMap<>();

	        Inscripcion inscri = new Inscripcion();
	        inscri.setClase(clase);
	        inscri.setPlanpago(plan);
	        inscri.setEstado(dto.getEstado());
	        repository.save(inscri);

	        respon.put("Message", "Inscrito correctamente");
	        return new ResponseEntity<>(respon ,HttpStatus.OK);
	    }
}
