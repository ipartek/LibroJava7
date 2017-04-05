package com.ipartek.formacion.danielsan;

public class CarritoPrueba {
	public static final int ANCHO_RESULTADOS1 = 30;

	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.add(new Producto(1, "Moitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base...", 100.2));
		c.add(new Producto(3, "Raton", 10.3));

		System.out.println(c.toString(Carrito.CON_FORMATO));

		/*
		 * ID: 1, Monitor 21", 125.03€
		 */

		System.out.println("Numero de productos: " + c.getNumeroDeArticulos());
		System.out.println("Precio: " + c.getPrecioTotal());
		System.out.println("IVA: " + c.getIvaSobrePrecioTotal());// Asumimos
		// IVA 21%
		System.out.println("Precio total: " + c.getPrecioTotalConIva());
	}
}
