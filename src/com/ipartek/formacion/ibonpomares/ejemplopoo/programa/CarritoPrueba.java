package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import java.util.Date;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	
	
	public static void main(String[] args) {
		
		Carrito c = new Carrito();
		
		c.add(new Producto(1, "Monitor 21\"", 125.03));
//		c.add(new Producto(2, "Placa Base", 100.2));
//		c.add(new Producto(3, "Raton", 10.3));
//		c.add(new Producto(4, "Teclado", 15));
		
		//generar simulacion de productos
		for (int id = 1; id <= 50; id++) {
			//c.add(new Producto(id, "Producto"+ id, id * 2 * Math.random()));
			c.add(new Producto(id, "Producto"+ id, 20 ));
			
		}
		
		
		//System.out.println(c);
		long antes = new Date().getTime();
		System.out.println(c.toString(Carrito.CON_FORMATO));
		System.out.println(new Date().getTime() - antes);
		
//		antes = new Date().getTime();
//		System.out.println(c.toStringCutre(Carrito.CON_FORMATO));
//		System.out.println(new Date().getTime() - antes);
//		
		/*
		 * ID: 1 Mmonitor 21", 125.03
		 * ID: 2,Placa Base,   100.2
		 * ID: 3,Raton,        10.3
		 */
		
		System.out.println("Numero De Articulos: " + c.getNumeroDeArticulos());
		System.out.println("Precio Total: " + c.getPrecioTotal(2));
		System.out.println("IVA Sobre Precio Total: " + c.getIvaSobrePrecioTotal()); //Asumimos IVA 21%
		System.out.println("Precio Total Con IVA: " + c.getPrecioTotalConIva());
		
		
		
		
	}

}
