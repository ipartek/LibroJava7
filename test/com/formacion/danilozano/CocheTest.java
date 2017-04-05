package com.formacion.danilozano;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.danilozano.Coche;

public class CocheTest {

	@Test
	public void testConstructorVacio() {
		Coche c = new Coche();
		assertEquals("Marca no correcta", "nisu", c.getMarca());
		assertEquals("potencia no correcta", 50, c.getPotencia());
		assertTrue(c.isNuevo());
		assertEquals(0, c.getAntiguedad());
		assertEquals(500, c.getPrecio());
	}

	@Test
	public void testConstructorParametros() {

		Coche ferrari = new Coche("Ferrari", 900);

		assertEquals("Marca no correcta", "Ferrari", ferrari.getMarca());
		assertEquals("potencia no correcta", 900, ferrari.getPotencia());
		assertTrue(ferrari.isNuevo());

	}

	@Test
	public void testConstrguctorParametros() {

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
