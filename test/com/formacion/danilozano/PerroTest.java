package com.formacion.danilozano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.danilozano.Perro;

public class PerroTest {

	@Test
	public void testnull() {
		Perro p = new Perro();
		assertEquals(null, p.getNombre());

	}

}