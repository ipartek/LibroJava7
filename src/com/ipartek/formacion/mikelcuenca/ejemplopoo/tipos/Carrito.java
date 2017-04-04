package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> contenido;
	private final double IVA = 0.21;

	public Carrito() {

		this.contenido = new ArrayList<Producto>();
	}

	public int getNumeroDeArticulos() {

		int n = 0;

		for (Producto p : contenido) {

			n++;

		}

		return n;

	}

	public double getPrecioTotal() {

		double precioTotal = 0;

		for (Producto p : contenido) {

			precioTotal = precioTotal + p.getPrecio();

		}

		return precioTotal;

	}

	public double getIvaSobrePrecioTotal() {

		return getPrecioTotal() * IVA;

	}

	public double getPrecioTotalConIva() {

		return getPrecioTotal() * (1 + IVA);

	}

	public void add(Producto p) {

		contenido.add(p);
	}

	public String toString() {

		String texto = "";

		for (Producto p : contenido)
			texto = texto + p.toString() + "\n";

		return texto;

	}

}
