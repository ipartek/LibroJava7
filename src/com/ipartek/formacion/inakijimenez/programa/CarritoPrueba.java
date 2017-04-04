package com.ipartek.formacion.inakijimenez.programa;

import com.ipartek.formacion.inakijimenez.tipos.Carrito;
import com.ipartek.formacion.inakijimenez.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor21\"", 125.03));
		c.add(new Producto(2, "Placa base...", 100.02));
		c.add(new Producto(3, "Raton", 10.3));

		System.out.println(c);
		System.out.println(c.toString(true));

		/*
		 * ID: 1, Monitor: 21", 125.03€ ....
		 */

		System.out.println(String.format("El numero de articulos del carro es de: %d\n", c.getNumeroArticulos()));
		System.out.println(String.format("Subtotal:\t %10.2f€", c.getPrecioTotal()));
		System.out.println(String.format("I.V.A.:\t\t %10.2f€", c.getIvaSobrePrecioTotal()));// Asumimos 21%
		System.out.println(String.format("Total:\t\t %10.2f€", c.getPrecioTotalConIva()));
	}
}
