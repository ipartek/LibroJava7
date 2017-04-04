package com.ipartek.formacion.ibonpomares;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Perro;

public class PerroTest {

	@Test
	public void testConstrustorVacio() {
		
		Perro p = new Perro();
		assertEquals("Thor", p.getNombre());
		assertEquals("milrazas", p.getRaza());
		assertFalse(p.isDueno());
		assertFalse(p.isPulgas());	
		
	}

	@Test
	public void testConstrustorParametros() {
		
		Perro p = new Perro("Nala", "seter", true, false);
		assertEquals("Nala", p.getNombre());
		assertEquals("seter", p.getRaza());
		assertTrue(true== p.isDueno());
		assertTrue(false== p.isPulgas());
		
	}
	
	
}
	

