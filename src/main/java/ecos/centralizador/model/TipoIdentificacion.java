package ecos.centralizador.model;

/**
 * Enumeración que define los tipos de identificación
 * que puede poseer un ciudadano colombiano para la carpeta ciudadana
 * Nota: Se consideran algunos que probablemente no se usen
 *
 */
public enum TipoIdentificacion {
	CEDULA_CIUDADANIA (1, "CC"),
	CEDULA_EXTRANJERIA (2, "CE"),
	PASAPORTE (3, "PS"),
	NUIP (4, "NUIP"),
	TARJETA_IDENTIDAD (5, "TI"),
	REGISTRO_CIVIL (6, "RC"),
	PERMISO_DIPLOMATICO (7, "PD");
	
	private Integer id;
	private String abreviatura;
	
	private TipoIdentificacion(Integer id, String abreviatura) {
		this.id = id;
		this.abreviatura = abreviatura;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getAbreviatura() {
		return this.abreviatura;
	}
}
