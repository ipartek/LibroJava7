package com.ipartek.formacion.josurrutia.ejemplopoo.programa;

import java.math.BigDecimal;

import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base ...", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		for (int id = 1; id <= 50; id++) {
			c.add(new Producto(id, "Producto" + id, 20.10));
		}
		System.out.println("\tSin Formato \n" + c);

		System.out.println("\n\tCon Formato \n" + c.toString(Carrito.CON_FORMATO));

		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println(c.getNumeroDeArticulos());
		System.out.println(c.getPrecioTotal());

		System.out.println(c.getPrecioTotalSeguro());

		System.out.println(c.getPrecioTotal(3));
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());

		double precio = 125.03;
		BigDecimal precioNuevo = new BigDecimal(125.03);

	}
}
