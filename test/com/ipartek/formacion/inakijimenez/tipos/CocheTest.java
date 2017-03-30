package com.ipartek.formacion.inakijimenez.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		// assertTrue(true);
		// assertFalse("string",true); -> el string es el mensaje de error de la asercion
		// assertNull(object);
		// assertNotNull(object);
		// assertEquals(expected, actual);

		Coche c = new Coche();
		assertEquals("Nisu", c.getMarca());
		assertEquals(50, c.getPotencia());
		assertTrue(c.isNuevo());
		assertEquals(0, c.getAntiguedad());

		final int PRECIO_INICIAL = 100;

		c.setAntiguedad(-1);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

		c.setAntiguedad(0);
		assertEquals(PRECIO_INICIAL * 5, c.getPrecio());

		c.setAntiguedad(1);
		assertEquals(PRECIO_INICIAL * 3, c.getPrecio());

		c.setAntiguedad(2);
		assertEquals(PRECIO_INICIAL, c.getPrecio());

		c.setAntiguedad(15);
		assertEquals(PRECIO_INICIAL, c.getPrecio());

	}

	@Test
	public void testConstructorParametros() {

		// assertTrue(true);
		// assertFalse("string",true); -> el string es el mensaje de error de la asercion
		// assertNull(object);
		// assertNotNull(object);
		// assertEquals(expected, actual);

		Coche c = new Coche("Ferrari", 900, 1, 200);

		assertEquals("Ferrari", c.getMarca());
		assertEquals("la potencia no es correcta", 900, c.getPotencia());
		assertTrue(c.isNuevo());
		assertEquals(1, c.getAntiguedad());
		assertEquals(600, c.getPrecio());
	}

}
