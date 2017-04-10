package com.ipartek.formacion.joseba.poo.tipos;

public class CarritoPrueba {

	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03)); // \para separar las comillas y
														// poder
		// asignarlas
		c.add(new Producto(2, "Placa base", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		for (int id = 1; id <= 50; id++)
			c.add(new Producto(id, "Producto" + id, id * 2 * Math.random()));
		System.out.println(c.toString(Carrito.CON_FORMATO));

		/*
		 * ID: 1, Monitor 21",125.03€
		 */
		System.out.println("Precio total:");
		System.out.println(c.getPrecioTotal());
		System.out.println(c.getPrecioTotal(3)); // Dejas dos
													// decimales
		System.out.println("Iva sobre precio total:");
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println("Numero de articulos:");
		System.out.println(c.getNumerodearticulos());
		System.out.println("Precio total con iva:");
		System.out.println(c.getPrecioTotalconIva());
		System.out.println("Precio total seguro:");
		System.out.println(c.getPrecioTotalSeguro());
	}
}
