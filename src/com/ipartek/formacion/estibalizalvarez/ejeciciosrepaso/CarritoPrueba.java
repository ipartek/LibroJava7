package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.math.BigDecimal;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));// añade el producto al carrito.
		c.add(new Producto(2, "Placa base ...", 100.2));
		c.add(new Producto(30, "Ratón", 10.3));

		for (int id = 1; id <= 50; id++)
			c.add(new Producto(id, "Producto" + id, id * 2));

		System.out.println("Esto es Sin_Formato:");
		System.out.println(c);// aqui le saldria el false en el if de producto.
		// System.out.println(c.toString(Carrito.SIN_FORMATO));
		System.out.println("Esto es Con_Formato:");
		System.out.println(c.toString(Carrito.CON_FORMATO));// aqui seria el true de CON_FORMATO.
		// System.out.println(c.toString(true));// aqui le sale el true en el if de producto.

		/*
		 * Queremos que salga de esta manera en la pantalla: ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println(c.getNumeroDeArticulos());
		System.out.println(c.getPrecioTotal());// saca precio total con muchos decimales.
		System.out.println(c.getPrecioTotalSeguro());// saca precio total con Bidecimal.
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());

		BigDecimal precioNuevo = new BigDecimal(125.03);// te va a escribir el precio segun va, sin colas largas en lo decimales.

	}
}
