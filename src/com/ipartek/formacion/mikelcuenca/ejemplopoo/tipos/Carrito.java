package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> contenido;
	private final static double IVA = 0.21;

	public Carrito() {

		this.contenido = new ArrayList<Producto>();

	}

	public int getNumeroDeArticulos() {

		// int n = 0;
		//
		// for (Producto p : contenido) {
		//
		// n++;
		//
		// }

		// return n;

		return contenido.size();

	}

	public double getPrecioTotalVerdadero() {

		double precioTotal = 0.0;

		for (Producto p : contenido) {

			precioTotal = precioTotal + p.getPrecio();

		}

		return precioTotal;

	}

	public String getPrecioTotal() {
		return String.format("%.2f€", getPrecioTotalVerdadero());
	}

	public String getIvaSobrePrecioTotal() {

		return String.format("%.2f€", getPrecioTotalVerdadero() * IVA);

	}

	public String getPrecioTotalConIva() {

		return String.format("%.2f€", getPrecioTotalVerdadero() * (1 + IVA));

	}

	public void add(Producto p) {

		contenido.add(p);
	}

	public String toString() {

		StringBuffer sb = new StringBuffer();
		// String texto = "";

		for (Producto p : contenido) {
			sb.append(p);
			sb.append('\n');
			// texto = texto + p.toString() + "\n";
			// texto = new StringBuffer().append(texto).append(p.toString()).append("\n").toString();
		}
		return sb.toString();
		// return texto;

	}

}
