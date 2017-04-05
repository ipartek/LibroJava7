package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches.Coche;

public class CocheTest {

	@Test
	public void testConstructorVacio() {
		// fail("Not yet implemented");
		// assertTrue(true);
		// assertTrue
		// assertFalse
		// assertNull
		// assertNotNull
		// assertEquals

		Coche c = new Coche();
		assertEquals("nisu", c.getMarca());
		assertEquals("potencia no correcta", 50, c.getPotencia());
		assertTrue(c.isNuevo());
		assertEquals(0, c.getAntiguedad());
		assertEquals(500, c.getPrecio());
	}

	@Test
	public void testConstructorParametros() {
		// Ejercicio testear un objeto con parametros
		// un ferrari, con potencia 900 y que sea nuevo.
		Coche ferrari = new Coche("ferrari", 900);
		assertEquals("ferrari", ferrari.getMarca());
		assertEquals("potencia no correcta", 900, ferrari.getPotencia());
		assertTrue(ferrari.isNuevo());
		ferrari.setAntiguedad(0);
		assertEquals(0, ferrari.getAntiguedad());
		assertEquals(500, ferrari.getPrecio());
		ferrari.setAntiguedad(1);
		assertEquals(300, ferrari.getPrecio());
		ferrari.setAntiguedad(2);
		assertEquals(100, ferrari.getPrecio());
		ferrari.setAntiguedad(2144);
		assertEquals(100, ferrari.getPrecio());
	}

}
