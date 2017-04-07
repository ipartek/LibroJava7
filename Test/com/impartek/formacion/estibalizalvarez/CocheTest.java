package com.impartek.formacion.estibalizalvarez;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ipartek.formacion.estibalizalvarez.Coche;

public class CocheTest {

	@Test
	public void testConstructorVacio() {

		Coche c = new Coche();//
		assertEquals("nisu", c.getMarca());//
		assertEquals(50, c.getPotencia());//
		assertTrue(c.isNuevo());// es una conclusion.

	}

	@Test
	public void testConstructorParametros() {
		// hay que hacer ferrari, 900w, True.
		//

	}

}
