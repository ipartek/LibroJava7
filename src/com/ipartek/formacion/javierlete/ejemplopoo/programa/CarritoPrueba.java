package com.ipartek.formacion.javierlete.ejemplopoo.programa;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		// c.add(new Producto(1, "Monitor 21\"", 125.03));
		// c.add(new Producto(2, "Placa base ...", 100.2));
		// c.add(new Producto(30, "Ratón", 10.3));

		for (int id = 1; id <= 50; id++)
			c.add(new Producto(id, "Producto" + id, 20.1)); // * Math.random()));

		System.out.println(c);
		// System.out.println(c.toString());
		// System.out.println(c.toString(false));
		// System.out.println(c.toString(Carrito.SIN_FORMATO));

		System.out.println(c.toString(Carrito.CON_FORMATO));

		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println(c.getNumeroDeArticulos());
		System.out.println(c.getPrecioTotal());

		System.out.println(c.getPrecioTotalSeguro());

		System.out.println(c.getPrecioTotal(3));
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());

		// double precio = 125.03;
		// BigDecimal precioNuevo = new BigDecimal(125.03);

	}
}
