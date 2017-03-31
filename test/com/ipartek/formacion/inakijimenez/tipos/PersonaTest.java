package com.ipartek.formacion.inakijimenez.tipos;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	Persona p;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p = new Persona(2, "Juan");
	}

	@After
	public void tearDown() throws Exception {
		p.setNombre(null);
		p.setId(0);
	}

	@Test
	public void testConstructorVacio() {
		Persona per = new Persona();

		assertEquals("Anonimo", per.getNombre());
		assertEquals(0, per.getId());
	}

	@Test
	public void testConstructorNombre() {
		p = new Persona("Pedro");

		assertEquals("Pedro", p.getNombre());
		assertEquals(0, p.getId());
	}

	@Test
	public void testConstructorIdNombre() {
		p = new Persona(3, "Pedro");

		assertEquals("Pedro", p.getNombre());
		assertEquals(3, p.getId());
	}

	@Test
	public void testGetNombre() {

		assertEquals("Juan", p.getNombre());

	}

	@Test
	public void testGetId() {

		assertEquals(2, p.getId());
	}

	@Test
	public void testSetNombre() {

		p.setNombre("Pedro");
		assertEquals("Pedro", p.getNombre());

	}

	@Test
	public void testSetId() {

		p.setId(5);
		assertEquals(5, p.getId());

	}

}
