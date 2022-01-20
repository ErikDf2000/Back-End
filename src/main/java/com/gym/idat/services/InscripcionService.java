package com.gym.idat.services;

import java.time.LocalDateTime;
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
import com.gym.idat.model.Reserva;
import com.gym.idat.repository.ClaseRepository;
import com.gym.idat.repository.InscripcionRepository;
import com.gym.idat.repository.ReservaRepository;

@Service
public class InscripcionService {
	
	 @Autowired
	    private InscripcionRepository repository;
	 @Autowired
	    private ReservaRepository repositoryres;
	 @Autowired
	    private ClaseRepository repositoryclas;
	
	 
	 	public List<Inscripcion> listado(){
	        return repository.findAll();
	    }
	
	   
	    public ResponseEntity<?> RealizarInscripcion(InscripcionDTO dto){
	        Clase clase = repositoryclas.findClaseById(dto.getClase());
	        Reserva reserva = repositoryres.findReservaById(dto.getReserva());
	        Map<String, Object> respon = new HashMap<>();

	        Inscripcion inscri = new Inscripcion();
	        inscri.setClase(clase);
	        inscri.setReserva(reserva);
	        inscri.setEstado(dto.getEstado());
	        repository.save(inscri);

	        respon.put("Message", "Inscrito correctamente");
	        return new ResponseEntity<>(respon ,HttpStatus.OK);
	    }
	    
	    public List<Inscripcion> listados(Long id, LocalDateTime day,Long ids){
	        return repository.findByReserva_Cliente_IdAndClase_HoraIniBeforeAndClase_Disciplina_Id(id,day,ids);
	    }
	    
}
