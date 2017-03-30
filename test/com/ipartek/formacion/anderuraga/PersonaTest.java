package com.ipartek.formacion.anderuraga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	Persona p;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// se ejecuta al iniciar Clase de Test
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// se ejecuta al finalizar Clase de Test
	}

	@Before
	public void setUp() throws Exception {
		// Se ejecuta antes de acada @Test
		p = new Persona("ander");
	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta despues de acada @Test
		p = null;
	}

	@Test
	public void testPersona() {
		assertNotNull(p);
		assertEquals("ander", p.getNombre());
	}

	@Test
	public void testGetNombre() {

		assertEquals("ander", p.getNombre());

	}

	@Test
	public void testSetNombre() {

		p.setNombre("Andrea");
		assertEquals("Andrea", p.getNombre());
	}

	@Test
	public void testToString() {
		assertEquals("Persona [nombre=ander]", p.toString());
	}

}
