package ecos.centralizador.ruu.model;

public enum EstadoCivil {
	
	SOLTERO (1, "Soltero(a)"),
	CASADO (1, "Casado(a)"),
	UNION_LIBRE (1, "Union Libre"),
	DIVORCIADO (1, "Divorciado(a)"),
	VIUDO (1, "Viudo(a)");
	
	private Integer id;
	
	private String estadoCivil;
	
	private EstadoCivil (Integer id, String estadoCivil){
		this.id = id;
		this.estadoCivil = estadoCivil;
	}

}
