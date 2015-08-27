package ecos.centralizador.ruu.model;

/**
 * Clase que modela la entidad Pais
 * @author drenteria
 *
 */
public class Pais {
	
	private Integer idPais;
	
	private String nombrePais;
	
	public Pais(Integer id, String nombre){
		this.idPais = id;
		this.nombrePais = nombre;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	

}
