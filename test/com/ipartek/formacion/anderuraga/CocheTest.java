package com.ipartek.formacion.anderuraga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		Coche c = new Coche();
		assertEquals("nisu", c.getMarca());
		assertEquals("potencia no correcta", "50", c.getPotencia());
		assertTrue(c.isNuevo());

	}

	@Test
	public void testConstructorParametros() {

	}

}
