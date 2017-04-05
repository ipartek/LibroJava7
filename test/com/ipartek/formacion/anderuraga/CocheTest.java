package com.ipartek.formacion.anderuraga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		Coche c = new Coche();
		assertEquals("nisu", c.getMarca());
		assertEquals("potencia no correcta", 50, c.getPotencia());
		assertTrue(c.isNuevo());
		assertEquals(0, c.getAntiguedad());
		assertEquals(500, c.getPrecio());

	}

	@Test
	public void testConstructorParametros() {

	}

	@Test
	public void testGetPrecio() {

		final int PRECIO_INICIAL = 100;

		Coche c = new Coche();
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());
 
		c.setAntiguedad(0);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

		c.setAntiguedad(1);
		assertEquals(PRECIO_INICIAL * 3, c.getPrecio());

		c.setAntiguedad(2);
		assertEquals(PRECIO_INICIAL, c.getPrecio());

		c.setAntiguedad(12);
		assertEquals(PRECIO_INICIAL, c.getPrecio());

		c.setAntiguedad(-1);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

		// Cambiamos precio inicial
		c.setPrecio(PRECIO_INICIAL * 2);
		assertEquals(PRECIO_INICIAL * 5 * 2, c.getPrecio());

	}

}
