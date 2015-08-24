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

import ecos.centralizador.ruu.model.Ciudadano;

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
		return new Ciudadano();
	}

	@Override
	public Ciudadano obtenerCiudadano(String numDocumento)
	{
		// TODO Retornar un ciudadano
		return new Ciudadano();
	}

	@Override
	public void guardarCiudadano(Ciudadano nuevoCiudadano)
	{
		// TODO Guardar un ciudadano nuevo o sus datos si ya existe
		
	}
	
}

