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
 * Clase que encapsula la direccion de un ciudadano
 *
 */
public class Direccion
{
	private Integer idDireccion;
	
	private TipoDireccion tipoDireccion;
	
	private String direccion;
	
	private Boolean esCorrespondencia;

	public Integer getIdDireccion()
	{
		return idDireccion;
	}

	public void setIdDireccion(Integer idDireccion)
	{
		this.idDireccion = idDireccion;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public Boolean getEsCorrespondencia()
	{
		return esCorrespondencia;
	}

	public void setEsCorrespondencia(Boolean esCorrespondencia)
	{
		this.esCorrespondencia = esCorrespondencia;
	}

	public TipoDireccion getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(TipoDireccion tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
}

