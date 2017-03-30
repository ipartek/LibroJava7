package com.ipartek.formacion.ibonpomares;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Coche;

public class CocheTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		}
	
	public void testConstructorVacio(){
		
		Coche c1 = new Coche();
		assertEquals("nisu", c1.getMarca());
		assertEquals(50, c1.getPotencia());
		assertTrue(c1.isNuevo());
		
		assertEquals(0, c1.getAno());
		assertEquals(500, c1.getPrecio());
	
	}
	@Test
	public void testGetPrecio(){
		
		final int PRECIO_INICIL= 100;
		
		Coche c = new Coche();
		assertEquals(PRECIO_INICIL * 5, c.getPrecio());
		
		c.setAno(0);
		assertEquals(PRECIO_INICIL * 3, c.getPrecio());	
		
		c.setAno(1);
		assertEquals(PRECIO_INICIL * 3, c.getPrecio());
		
		c.setAno(2);
		assertEquals(PRECIO_INICIL, c.getPrecio());
		
		c.setAno(12);
		assertEquals(PRECIO_INICIL, c.getPrecio());
	
		c.setAno(-1);
		assertEquals(PRECIO_INICIL * 5, c.getPrecio());
	
		
		//camnbiamos precio iniciaL
		
		c.setPrecio(PRECIO_INICIL*2);
		assertEquals(PRECIO_INICIL * 5 * 2, c.getPrecio());
	}
	
	
	
	
	
	@Test
	public void testConstructorParametros(){
		
		Coche ferrari = new Coche("Ferrari", 900);
		assertEquals("Ferrari", ferrari.getMarca());
		assertEquals(900, ferrari.getPotencia());
		assertTrue(ferrari.isNuevo());
		System.out.println(ferrari);
		
		
	}
	@Test
	public void testConstructorParametros1(){
		
		Coche c2 = new Coche("BMW", 200, 3);
		assertEquals("BMW", c2.getMarca());
		assertEquals(200, c2.getPotencia());
		//assertTrue(c2.isNuevo());
		assertEquals(3, c2.getAno());
		System.out.println(c2);
	
		
	}
	
	
	
	
	

}
