package com.gym.idat.Utils.other;


import lombok.Data;



@Data 
public class TrainerDTO {
	
	    private Long id;
	   // private LocalDate fechaNac;
		private Long telefono;//
		private String descripcion;
		//private Long dni;
		private String genero;
		private String altura;
		private String peso;
		private String foto;
		
		private Long disciplinas;
}
