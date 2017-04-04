package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

import java.util.ArrayList;

public class Carrito {

	// atributos
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	// contructores
	public void add(Producto producto) {
		productos.add(producto);

	}

	@Override
	public String toString() {
		String s = "";

		for (Producto p : productos)
			s = s + p + "\n";
		return s;

		// return "Productos del Carrito\n" + productos.toString();
	}

	public int getNumeroDeArticulos() {

		return productos.size();
	}

	public double getPrecioTotal() {
		double pt = 0.0;

		for (Producto p : productos)
			pt = pt + p.getPrecio();

		return pt;
	}

	public double getIvaSobrePrecioTotal() {
		double iva = 0.0;

		iva = (getPrecioTotal() * 0.21);

		return iva;
	}

	public double getPrecioTotalConIva() {
		double precioConIva = 0;

		precioConIva = (getPrecioTotal());

		return precioConIva;
	}

}
