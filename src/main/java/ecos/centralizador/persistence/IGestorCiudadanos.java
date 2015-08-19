/*
 Copyright (c) 2010 - 2030 by ACI Worldwide Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package ecos.centralizador.persistence;

import ecos.centralizador.model.Ciudadano;

public interface IGestorCiudadanos
{
	public Ciudadano obtenerCiudadano(Integer id);
	
	public Ciudadano obtenerCiudadano(String numDocumento);
	
	public void guardarCiudadano(Ciudadano nuevoCiudadano);
}

