package com.gym.idat.Utils.other;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

//import org.springframework.format.annotation.DateTimeFormat;

//import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ClaseDTO {
	
	 private Long id;
		
	 private Long disciplina;
	 private Long trainer;
	 private Long salon;
	 private Long cuposmax;
	 
	// @JsonFormat(pattern = "HH:mm:ss.SSSZ",shape = JsonFormat.Shape.NUMBER_FLOAT)
	// @JsonFormat(pattern = "HH:mm")
	 //@DateTimeFormat( iso = DateTimeFormat.ISO.TIME,pattern = "HH:mm")

	 private LocalDateTime horaIni;
	 
	// @JsonFormat(pattern = "HH:mm:ss.SSSZ",shape = JsonFormat.Shape.NUMBER_FLOAT)
	// @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
//	 @JsonFormat(pattern = "HH:mm")
	// @DateTimeFormat( iso = DateTimeFormat.ISO.TIME,pattern = "HH:mm")
	 private LocalDateTime horaFin;
}
