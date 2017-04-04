package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Carrito;
import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base X57F", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		System.out.println("ZALLA INFORMÁTICA");
		// System.out.println("Número de artículos = " +
		// c.getNumeroDeArticulos() + "\n");
		System.out.println(String.format("Número de artículos = %d", c.getNumeroDeArticulos()));

		System.out.println(c);

		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println("Subtotal =  " + c.getPrecioTotal() + " €");
		System.out.println("IVA 21% = " + c.getIvaSobrePrecioTotal() + " €"); // 21%
		System.out.println("Total = " + c.getPrecioTotalConIva() + " €");
	}
}
