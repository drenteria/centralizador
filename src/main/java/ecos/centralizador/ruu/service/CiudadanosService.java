/*
 Copyright (c) 2010 - 2030 by ACI Worldwide Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package ecos.centralizador.ruu.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ecos.centralizador.ruu.model.Ciudadano;
import ecos.centralizador.ruu.persistence.GestorCiudadanos;

/**
 * Clase que administra los servicios REST
 * asociados a un ciudadano
 *
 */
@Path("/ciudadano")
public class CiudadanosService
{
	
	String id;
	
	private GestorCiudadanos gestor;
	
	public CiudadanosService() {
		gestor = new GestorCiudadanos();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,
		MediaType.APPLICATION_JSON})
	public Ciudadano getCiudadano() {
		return gestor.obtenerCiudadano(id);
	}
	
	@GET
	@Produces({MediaType.TEXT_XML})
	public Ciudadano getCiudadanoBrowser() {
		return gestor.obtenerCiudadano(id);
	}
}

