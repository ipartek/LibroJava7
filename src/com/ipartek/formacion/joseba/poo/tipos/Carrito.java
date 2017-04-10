package com.ipartek.formacion.joseba.poo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos = new ArrayList<Producto>(); // enlazar los
																		// productos en
	public final static double IVA = 0.21; // una variable

	public int precio;
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private double precioconiva;

	public int getNumerodearticulos() {

		return productos.size(); // Coge cuantos hay
	}

	public double getPrecioTotal() {
		double preciototal = 0.0;
		for (Producto p : productos) {// Coge los productos
			preciototal = preciototal + p.getPrecio(); // Coge el atributo llamado precio
														// de producto
		}
		return preciototal;
	}

	public String getPrecioTotal(int decimales) {

		return String.format("%." + decimales + "f", getPrecioTotal());
	}

	public double getPrecioTotalconIva() {
		precioconiva = getPrecioTotal() * 1.21;
		return precioconiva;
	}

	public void add(Producto producto) {
		productos.add(producto);
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getIvaSobrePrecioTotal() {

		return getPrecioTotal() * IVA;
	}

	@Override
	public String toString() { // Si no tiene nada sale sin formato
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) { // Con formato
		StringBuffer sb = new StringBuffer(); // String s = "";

		for (Producto p : productos) {
			sb.append(p.toString(conFormato)); // s = s + p.toString(conFormato) + "\n";
			sb.append('\n');/*
							 * Lo de arriba comentado es mas largo(s=new
							 * StrinBuffer().append (s).append(p.toString(conFormato))
							 * .append("\n").toString(); lo que haria es que por cada
							 * cliente crea tantos StringBuffers como productos haya
							 */
		}

		return sb.toString(); // return s;
	}

	public BigDecimal getPrecioTotalSeguro() {
		BigDecimal preciototal = new BigDecimal(0.0);
		for (Producto p : productos)
			// Coge los productos
			preciototal = preciototal.add(p.getPrecioSeguro()); // (add) se le suma
																// getprecioseguro
		return preciototal;

	}
}
