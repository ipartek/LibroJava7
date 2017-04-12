package com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Carrito {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void add(Producto producto) {
		productos.add(producto);
	}

	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {
		StringBuffer sb = new StringBuffer(); // String s = "";

		for (Producto p : productos) {
			sb.append(p.toString(conFormato));
			sb.append('\n');

			// s = new StringBuffer().append(s).append(p.toString(conFormato)).append("\n").toString();
			// s = s + p.toString(conFormato) + "\n";
			// s += p.toString(conFormato) + "\n";
		}

		return sb.toString(); // return s; // productos.toString();
	}

	public String toStringCutre(boolean conFormato) {
		String s = "";

		for (Producto p : productos)
			s = s + p.toString(conFormato) + "\n";

		return s;
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

	public BigDecimal getPrecioTotalSeguro() {
		BigDecimal precioTotal = new BigDecimal(0.0);

		for (Producto p : productos)
			precioTotal = precioTotal.add(p.getPrecioSeguro());

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
