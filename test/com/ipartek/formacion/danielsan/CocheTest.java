package com.ipartek.formacion.danielsan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CocheTest {

	Coche ferrari;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		ferrari = new Coche();
	}

	@After
	public void tearDown() throws Exception {

		ferrari = null;
	}

	// Empiezan las comprobaciones del Test.

	@Test
	public void testConstructorVacio() {
		assertNotNull(ferrari);
		assertEquals("Ferrari", ferrari.getMarca());
	}

	@Test
	public void getPrecio() {

		final int PRECIO_INICIAL = 100;

		assertEquals(PRECIO_INICIAL * 5, ferrari.getPrecio());

		ferrari.setAntiguedad(0);
		assertEquals(PRECIO_INICIAL * 5, ferrari.getPrecio());

		ferrari.setAntiguedad(1);
		assertEquals(PRECIO_INICIAL * 3, ferrari.getPrecio());

		ferrari.setAntiguedad(2);
		assertEquals(PRECIO_INICIAL, ferrari.getPrecio());

		ferrari.setAntiguedad(12);
		assertEquals(PRECIO_INICIAL, ferrari.getPrecio());

		ferrari.setAntiguedad(-1);
		assertEquals(PRECIO_INICIAL * 5, ferrari.getPrecio());

		// Cambiamos precio inicial
		ferrari.setPrecio(PRECIO_INICIAL * 2);
		assertEquals(PRECIO_INICIAL * 5 * 2, ferrari.getPrecio());
	}

}
