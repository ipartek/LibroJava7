package com.ipartek.formacion.danilozano.ejemplopoo.programa;

import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base ...", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		System.out.println(c);
		System.out.println(c.toString(Carrito.CON_FORMATO));
		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println(c.getNumeroDeArticulos());
		System.out.println(c.getPrecioTotal());
		System.out.println(c.getPrecioTotal(3));
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());
	}
}
