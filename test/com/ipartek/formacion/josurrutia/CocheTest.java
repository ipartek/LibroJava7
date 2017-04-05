package com.ipartek.formacion.josurrutia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		Coche c = new Coche();
		assertEquals("marca no valida", "nisu", c.getMarca());
		assertEquals(50, c.getPotencia());
		assertEquals(0, c.getAntiguedad());
		assertEquals(500, c.getPrecio());
		assertTrue(c.isNuevo());
	}

	@Test
	public void testConstructorParametros() {

		Coche f = new Coche("ferrari", 900, 3, 100);
		assertEquals("ferrari", f.getMarca());
		assertEquals(900, f.getPotencia());
		assertEquals(3, f.getAntiguedad());
		assertEquals(100, f.getPrecio());
		assertTrue(f.isNuevo());

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

		// cambiamos precio inicial
		c.setPrecio(PRECIO_INICIAL * 2);
		assertEquals(PRECIO_INICIAL * 5 * 2, c.getPrecio());

	}

}
