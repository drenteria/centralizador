package ecos.centralizador.ruu.service;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Clase de Pruebas para el Servicio Test de Ciudadanos del RUU
 *
 */
public class CiudadanosServiceTest extends TestCase
{
	public CiudadanosServiceTest(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite(CiudadanosServiceTest.class);
	}
	
	public void testGetCiudadano() {
		Assert.assertTrue(true);
	}
}

