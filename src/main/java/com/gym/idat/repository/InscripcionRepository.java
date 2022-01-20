package com.gym.idat.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Inscripcion;



public interface InscripcionRepository extends JpaRepository<Inscripcion, Long>{

	
	List<Inscripcion> findByReserva_Cliente_IdAndClase_HoraIniBeforeAndClase_Disciplina_Id(Long id,LocalDateTime mes,Long ids);
}
