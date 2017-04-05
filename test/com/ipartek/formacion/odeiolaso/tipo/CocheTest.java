package com.ipartek.formacion.odeiolaso.tipo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Coche;

public class CocheTest {

	@Test
	public void testConstructorVacio() {
		assertTrue(true);
		assertFalse(false);
		assertNull(null);
		assertNotNull(1);
		assertEquals(0, 0);

		Coche c = new Coche();
		assertEquals("Esperaba fuera un Nisu, Ni Su Puta Madre sabe lo ques , pero esque ni tu puta madre sabe lo que es", "Nisu", c.getMarca());
		assertEquals(50, c.getPotencia());
		assertTrue(c.isNuevo());

	}

	@Test
	public void testConstructorParametros() {
		String nombreTest = "Ferrari";
		int potenciatest = 900;
		final int PRECIO = 500;

		Coche ferrero = new Coche(nombreTest, potenciatest);
		ferrero.setPrecio(PRECIO);

		assertEquals("Esperaba fuera un " + nombreTest + ", pero es un  NISU, Ni Su Puta Madre sabe lo ques", nombreTest, ferrero.getMarca());
		assertEquals("Esperaba que tuvier" + potenciatest + " caballos, pero no chufla ni Ostia", potenciatest, ferrero.getPotencia());
		assertTrue(ferrero.isNuevo());
		// if (ferrero.getAntiguedad() == 0) {
		// assertEquals("", PRECIO * 5, ferrero.getPrecio());
		// } else if (ferrero.getAntiguedad() == 1) {
		// assertEquals("", PRECIO * 3, ferrero.getPrecio());
		// } else {
		// assertEquals("", PRECIO, ferrero.getPrecio());
		// }
	}

	@Test
	public void testGetPrecios() {

		final int PRECIO_INICIAL = 100;

		Coche cp = new Coche();

		assertEquals(PRECIO_INICIAL * 5, cp.getPrecio());

		cp.setAntiguedad(0);
		assertEquals(PRECIO_INICIAL * 5, cp.getPrecio());

		cp.setAntiguedad(1);
		assertEquals(PRECIO_INICIAL * 3, cp.getPrecio());

		cp.setAntiguedad(2);
		assertEquals(PRECIO_INICIAL, cp.getPrecio());

		cp.setAntiguedad(12);
		assertEquals(PRECIO_INICIAL, cp.getPrecio());

		cp.setAntiguedad(-1);
		assertEquals(PRECIO_INICIAL * 5, cp.getPrecio());

		// Caambiamos precio inicial
		cp.setPrecio(PRECIO_INICIAL * 2);
		assertEquals(PRECIO_INICIAL * 5 * 2, cp.getPrecio());

	}

}
