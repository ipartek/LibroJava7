package com.ipartek.formacion.mikelcuenca.ejemplopoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Coche;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		Coche c = new Coche();
		assertEquals("nisu", c.getMarca());
		assertEquals("potencia no correcta", 50, c.getPotencia());
		assertTrue(c.isNuevo());

		final int PRECIO_INICIAL = 100;

		c.setAntiguedad(0);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

		c.setAntiguedad(1);
		assertEquals(PRECIO_INICIAL * 3, c.getPrecio());

		c.setAntiguedad(2);
		assertEquals(PRECIO_INICIAL * 1, c.getPrecio());

		c.setAntiguedad(12);
		assertEquals(PRECIO_INICIAL * 1, c.getPrecio());

		c.setAntiguedad(-1);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

	}

	@Test
	public void testConstructorParametros() {

		// assertEquals
		// assertTrue
		// assertFalse
		// assertNull
		// assertNotNull

		Coche ferrari = new Coche("Ferrari", 900, 1);
		assertEquals("Ferrari", ferrari.getMarca());
		assertEquals(900, ferrari.getPotencia());
		assertTrue(ferrari.isNuevo());
		assertEquals(300, ferrari.getPrecio());

		Coche lamborghini = new Coche("Lamborghini", 900, 1);
		assertEquals(300, lamborghini.getPrecio());

		ferrari.setPrecio(1000);
		assertEquals(3000, ferrari.getPrecio());

		ferrari.setAntiguedad(5);
		assertEquals(1000, ferrari.getPrecio());
	}

}
