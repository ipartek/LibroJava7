package com.ipartek.formacion.javierlete.ejemplopoo.tipos;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void add(Producto producto) {
		productos.add(producto);
	}

	@Override
	public String toString() {
		return toString(false);
	}

	public String toString(boolean conFormato) {
		String s = "";

		for (Producto p : productos)
			s = s + p.toString(conFormato) + "\n";

		return s; // productos.toString();
	}

	public char[] getNumeroDeArticulos() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getPrecioTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getIvaSobrePrecioTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getPrecioTotalConIva() {
		// TODO Auto-generated method stub
		return null;
	}

}
