/*
 Copyright (c) 2010 - 2030 by ACI Worldwide Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package ecos.centralizador.ruu.persistence;

import java.util.Calendar;

import ecos.centralizador.ruu.model.Ciudadano;
import ecos.centralizador.ruu.model.Direccion;
import ecos.centralizador.ruu.model.EstadoCivil;
import ecos.centralizador.ruu.model.Genero;
import ecos.centralizador.ruu.model.Pais;
import ecos.centralizador.ruu.model.TipoDireccion;
import ecos.centralizador.ruu.model.TipoIdentificacion;

/**
 * Clase que se encarga de manejar la persistencia
 * de la entidad Ciudadanos desde y hacia la base de datos
 *
 */
public class GestorCiudadanos implements IGestorCiudadanos
{

	@Override
	public Ciudadano obtenerCiudadano(Integer id)
	{
		// TODO Auto-generated method stub
		return obtenerMockCiudadano();
	}

	@Override
	public Ciudadano obtenerCiudadano(String numDocumento)
	{
		// TODO Retornar un ciudadano
		return obtenerMockCiudadano();
	}

	@Override
	public void guardarCiudadano(Ciudadano nuevoCiudadano)
	{
		// TODO Guardar un ciudadano nuevo o sus datos si ya existe
		
	}
	
	private Ciudadano obtenerMockCiudadano() {
		Ciudadano mock = new Ciudadano();
		
		//Identificacion
		TipoIdentificacion tipoIdMock = new TipoIdentificacion();
		tipoIdMock.setId(1);
		tipoIdMock.setAbreviatura("CC");
		tipoIdMock.setNombre("Cedula de Ciudadania");
		
		//Fecha Expedicion Doc
		Calendar fechaExpDoc = Calendar.getInstance();
		fechaExpDoc.set(Calendar.YEAR, 2003);
		fechaExpDoc.set(Calendar.MONTH, 05);
		fechaExpDoc.set(Calendar.DAY_OF_MONTH, 13);
		fechaExpDoc.set(Calendar.HOUR, 0);
		fechaExpDoc.set(Calendar.MINUTE, 0);
		fechaExpDoc.set(Calendar.SECOND, 0);
		
		//Fecha Nacimiento
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(Calendar.YEAR, 1985);
		fechaNac.set(Calendar.MONTH, 05);
		fechaNac.set(Calendar.DAY_OF_MONTH, 07);
		fechaNac.set(Calendar.HOUR, 0);
		fechaNac.set(Calendar.MINUTE, 0);
		fechaNac.set(Calendar.SECOND, 0);
		
		//Pais Nacionalidad
		Pais nacionalidad = new Pais(169, "Colombia");
		
		
		//Direccion
		TipoDireccion tipoDirCasa = new TipoDireccion();
		tipoDirCasa.setIdTipoDireccion(1);
		tipoDirCasa.setNombreTipoDireccion("Casa");
		Direccion dirCasa = new Direccion();
		dirCasa.setIdDireccion(1);
		dirCasa.setTipoDireccion(tipoDirCasa);
		dirCasa.setDireccion("KR 78K 40-93S In 15 Ap 203");
		dirCasa.setEsCorrespondencia(true);
		
		//Ciudadano
		mock.setIdCiudadano(1);
		mock.setUniqueId("ABCD001");
		mock.setTipoIdCiudadano(tipoIdMock);
		mock.setNumeroIdentificacion("80852789");
		mock.setFechaExpDocumento(fechaExpDoc.getTime());
		mock.setPrimerNombre("Daniel");
		mock.setSegundoNombre("Felipe");
		mock.setPrimerApellido("Renteria");
		mock.setSegundoApellido("Martinez");
		mock.setGenero(Genero.MASCULINO);
		mock.setFechaNacimiento(fechaNac.getTime());
		mock.setPaisNacionalidad(nacionalidad);
		mock.setTelefonoFijo("+5714537964");
		mock.setTelefonoCelular("+573012649514");
		mock.setEstadoCivil(EstadoCivil.CASADO);
		mock.getDirecciones().add(dirCasa);
		return mock;
	}
	
}

