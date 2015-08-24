package ecos.centralizador.ruu.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Genero {
	MASCULINO ("M"),
	FEMENINO ("F");
	
	private String letra;
	
	private Genero(String letra){
		this.letra = letra;
	}
	
	@JsonValue
	public String getLetra(){
		return this.letra;
	}

}
