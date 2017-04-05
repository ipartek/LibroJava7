package com.ipartek.formacion.josurrutia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerroTest {

	@Test
	public void testConstructorVacio() {

		Perro p = new Perro();
		assertEquals("Lar", p.getNombre());
		assertEquals("mil razas", p.getRaza());
		assertFalse(p.isDuenio());
		assertFalse(p.isPulgas());
	}

	@Test
	public void testConstructorParametros() {

		Perro b = new Perro("Biskor", "labrador", true, true);
		assertEquals("Biskor", b.getNombre());
		assertEquals("labrador", b.getRaza());
		assertTrue(b.isDuenio());
		assertTrue(b.isPulgas());

	}

}
