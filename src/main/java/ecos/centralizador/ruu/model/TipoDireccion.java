/*
 Copyright (c) 2010 - 2030 by ACI Worldwide Inc.
 All rights reserved.
 
 This software is the confidential and proprietary information
 of ACI Worldwide Inc ("Confidential Information").  You shall
 not disclose such Confidential Information and shall use it
 only in accordance with the terms of the license agreement
 you entered with ACI Worldwide Inc.
 */

package ecos.centralizador.ruu.model;

/**
 * Enumeracion para los tipos de direcciones
 * posibles a registrar
 *
 */
public enum TipoDireccion
{
	CASA (1, "Casa"),
	TRABAJO (2, "Trabajo");
	
	private Integer id;
	private String nombreTipo;
	
	private TipoDireccion(Integer id, String nombreTipo){
		this.id = id;
		this.nombreTipo = nombreTipo;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getNombreTipoDireccion() {
		return this.nombreTipo;
	}
}

