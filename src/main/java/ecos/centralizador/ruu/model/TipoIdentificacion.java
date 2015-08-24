package ecos.centralizador.ruu.model;

public class TipoIdentificacion {
	
	private Integer id;
	
	private String nombre;
	
	private String abreviatura;
	
	public TipoIdentificacion(){
		this.id = 0;
		this.nombre = "Sin_Nombre";
		this.abreviatura = "N/A";
	}
	
	public TipoIdentificacion(Integer id, String nombre, 
			String abreviatura){
		super();
		this.id = id;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

}
