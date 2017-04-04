package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		
		Carrito c = new Carrito();
		
		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa Base", 100.2));
		c.add(new Producto(3, "Raton", 10.3));
		
		System.out.println(c);
		
		
		/*
		 * ID: 1 Mmonitor 21", 125.03
		 * ...
		 */

		System.out.println(c.getPrecioTotal());
		System.out.println(c.getIvaSobrePrecioTotal()); //Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());
		System.out.println(c.getNumeroDeArticulos());
		
		
		
	}

}
