package com.ipartek.formacion.josurrutia.ejemplopoo.tipos;

import java.util.ArrayList;

public class Carrito {

	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	// arraylisto productos de producto inicializado a 0
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void add(Producto producto) {

		productos.add(producto);

	}

	@Override
	public String toString() {

		return toString(SIN_FORMATO);// productos.toString();
	}

	public String toString(boolean conFormato) {
		StringBuffer sb = new StringBuffer();// String s = "";

		for (Producto p : productos) {
			sb.append(p.toString(conFormato));
			sb.append(0);
		}
		// s = new StringBuffer().append(s).append(p.toString(conFormato)).append("\n").toString();
		// s = s + p.toString(conFormato) + "\n";

		return sb.toString(); // return s;// productos.toString();
	}

	public int getNumeroDeArticulos() {
		return productos.size();
	}

	public double getPrecioTotal() {

		double precioTotal = 0.0;

		for (Producto p : productos)
			precioTotal += p.getPrecio();
		return precioTotal;
	}

	public String getPrecioTotal(int decimales) {
		return String.format("%." + decimales + "f", getPrecioTotal());
	}

	public final static double IVA = 0.21;

	public double getIvaSobrePrecioTotal() {

		return getPrecioTotal() * IVA;
	}

	public double getPrecioTotalConIva() {

		// return getPrecioTotal() + getIvaSobrePrecioTotal();
		return getPrecioTotal() * (IVA + 1);
	}

}
