package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches.Perro;

public class PerroTest {
	Perro p, p2;

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
		// Se ejecuta antes de cada @Test
		p = new Perro("GUAU");
		p2 = new Perro("Pedos", "JamonYorkside y queso", "Hot man", true);
	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta despues de cada @Test

		// sin parametros
		p = null;
		// con parametros
		p2 = null;
	}

	@Test
	public void testPerroString() {
		assertNotNull(p.getNombre());

		assertNotNull(p2.getNombre());
	}

	@Test
	public void testPerroStringStringStringBoolean() {
		assertNotNull(p.getNombre());
		assertNotNull(p.getDueño());
		assertNotNull(p.getRaza());
		assertNotNull(p.isPulga());

		assertNotNull(p2.getNombre());
		assertNotNull(p2.getDueño());
		assertNotNull(p2.getRaza());
		assertNotNull(p2.isPulga());
	}

	@Test
	public void testGetNombre() {
		assertEquals("GUAU", p.getNombre());
	}

	@Test
	public void testSetNombre() {
		p.setNombre("Cohete");
		assertEquals("Cohete", p.getNombre());
	}

	@Test
	public void testGetRaza() {
		assertEquals("Birraza", p.getRaza());
	}

	@Test
	public void testSetRaza() {
		p.setRaza("Perro pato");
		assertEquals("Perro pato", p.getRaza());
	}

	@Test
	public void testGetDueño() {
		assertEquals("NoDueño", p.getDueño());
	}

	@Test
	public void testSetDueño() {
		p.setDueño("pedotense");
		assertEquals("pedotense", p.getDueño());
	}

	@Test
	public void testIsPulga() {
		assertEquals(false, p.isPulga());
	}

	@Test
	public void testSetPulga() {
		p.setPulga(true);
		assertEquals(true, p.isPulga());
	}

}
