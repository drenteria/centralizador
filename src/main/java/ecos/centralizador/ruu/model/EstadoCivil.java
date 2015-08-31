package ecos.centralizador.ruu.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EstadoCivil {
	
	SOLTERO (1, "Soltero(a)"),
	CASADO (2, "Casado(a)"),
	UNION_LIBRE (3, "Union Libre"),
	DIVORCIADO (4, "Divorciado(a)"),
	VIUDO (5, "Viudo(a)");
	
	private Integer id;
	
	private String estadoCivil;
	
	private EstadoCivil (Integer id, String estadoCivil){
		this.id = id;
		this.estadoCivil = estadoCivil;
	}

}
