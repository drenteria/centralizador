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
import java.util.Date;

import ecos.centralizador.ruu.model.Ciudadano;
import ecos.centralizador.ruu.model.EstadoCivil;
import ecos.centralizador.ruu.model.Genero;
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
		return testCiudadano();
	}

	@Override
	public Ciudadano obtenerCiudadano(String numDocumento)
	{
		// TODO Retornar un ciudadano
		return testCiudadano();
	}

	@Override
	public void guardarCiudadano(Ciudadano nuevoCiudadano)
	{
		// TODO Guardar un ciudadano nuevo o sus datos si ya existe
		
	}
	
	private Ciudadano testCiudadano() {
		Ciudadano test = new Ciudadano();
		test.setIdCiudadano(1);
		test.setUniqueId("001");
		test.setTipoIdCiudadano(TipoIdentificacion.CEDULA_CIUDADANIA);
		test.setNumeroIdentificacion("80852789");
		test.setPrimerNombre("Daniel");
		test.setSegundoNombre("Felipe");
		test.setPrimerApellido("Renteria");
		test.setSegundoApellido("Martinez");
		test.setGenero(Genero.HOMBRE);
		test.setEstadoCivil(EstadoCivil.CASADO);
		
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.set(Calendar.YEAR, 1985);
		fechaNac.set(Calendar.MONDAY, 5);
		fechaNac.set(Calendar.DAY_OF_MONTH, 7);
		test.setFechaNacimiento(fechaNac.getTime());
		
		Calendar fechaExpDoc = Calendar.getInstance();
		fechaExpDoc.set(Calendar.YEAR, 2003);
		fechaExpDoc.set(Calendar.MONDAY, 5);
		fechaExpDoc.set(Calendar.DAY_OF_MONTH, 13);
		test.setFechaExpDocumento(fechaExpDoc.getTime());
		
		test.setTelefonoFijo("4537964");
		test.setTelefonoCelular("3012649514");
		
		return test;
	}
	
}

