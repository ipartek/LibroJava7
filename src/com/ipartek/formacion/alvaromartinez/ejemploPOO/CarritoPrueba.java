package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Carrito;
import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base X57F", 100.2));
		c.add(new Producto(3, "Rat�n", 10.3));

		System.out.println("ZALLA INFORM�TICA");
		// System.out.println("N�mero de art�culos = " +
		// c.getNumeroDeArticulos() + "\n");
		System.out.println(String.format("N�mero de art�culos = %d", c.getNumeroDeArticulos()));

		System.out.println(c);

		/*
		 * ID: 1, Monitor 21", 125.03� ...
		 */

		System.out.println("Subtotal =  " + c.getPrecioTotal() + " �");
		System.out.println("IVA 21% = " + c.getIvaSobrePrecioTotal() + " �"); // 21%
		System.out.println("Total = " + c.getPrecioTotalConIva() + " �");
	}
}
