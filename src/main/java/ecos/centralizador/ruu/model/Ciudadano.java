package ecos.centralizador.ruu.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que representa a un ciudadano en
 * el Registro Unico de Usuarios
 *
 */
@XmlRootElement
public class Ciudadano {
	
	private Integer idCiudadano;
	
	private String uniqueId;
	
	private TipoIdentificacion tipoIdCiudadano;
	
	private String numeroIdentificacion;
	
	//TODO: private Municipio municipioExpDoc;
	
	private Date fechaExpDocumento;
	
	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private Genero genero;
	
	private Date fechaNacimiento;	
	
	//TODO: private Municipio municipioNacimiento;
	
	//TODO: private Pais paisNacionalidad;
	
	private String telefonoFijo;
	
	private String telefonoCelular;
	
	private EstadoCivil estadoCivil;
	
	private List<Direccion> direcciones;

}