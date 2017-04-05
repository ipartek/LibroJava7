package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Carrito {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void add(Producto producto) {
		productos.add(producto);

	}

	public int getNumeroDeArticulos() {

		return productos.size();
	}

	public double getPrecioTotal() {
		double preciototal = 0.0;
		for (Producto p : productos)
			preciototal += p.getPrecio();
		return preciototal;
	}

	public BigDecimal getPrecioTotalSeguro() {
		BigDecimal precioTotal = new BigDecimal(0.0);

		for (Producto p : productos)
			precioTotal = precioTotal.add(p.getPrecioseguro());
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
		return (getPrecioTotal() + getIvaSobrePrecioTotal());
	}

	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {
		String s = "";
		for (Producto p : productos)
			s = s + p.toString(conFormato) + "\n";

		return s; // productos.toString();
	}

}