package com.ipartek.formacion.odeiolaso;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Carrito;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Televisor 22\"", 125.03));
		c.add(new Producto(2, "Plaba base...", 100.2));
		c.add(new Producto(3, "Raton", 10.3));

		// long date = new

		for (int id = 1; id < 50; id++) {
			c.add(new Producto(id, "Producto" + id, id * 2 * Math.random()));
		}

		System.out.println(c);

		System.out.println(c.toString(Carrito.CON_FORMATO));

		System.out.println(c.getNumeroArticulos());
		System.out.println(c.getPrecioTotal());
		System.out.println(c.getPrecioTotal(3));
		System.out.println(c.getIvaSobrePrecioTotal());
		System.out.println(c.getIvaSobrePrecioTotal(5)); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());
		System.out.println(c.getPrecioTotalConIva(7));

	}

}
