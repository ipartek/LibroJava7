package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Carrito /* extends ArrayList<Producto> */{

	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private ArrayList<Producto> productos = new ArrayList<Producto>();
	// private int id;
	// private String nombre;
	// private double precio;
	// private Producto producto = new Producto(id, nombre, precio);
	private double precioTotal; // ivaSobrePrecioTotal, precioTotalConIva;

	public void add(Producto producto) {
		productos.add(producto);
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public int getNumeroArticulos() {
		// numeroArticulos = productos.size();
		// for (Producto p : productos)
		// numeroArticulos++;
		return productos.size();
	}

	public double getPrecioTotal() {
		for (Producto p : productos) {
			precioTotal += p.getPrecio();
		}

		return precioTotal;
	}

	public BigDecimal getPrecioTotalSeguro() {
		BigDecimal precioTotalSeguro = new BigDecimal(0 - 0);

		for (Producto p : productos) {
			precioTotalSeguro = precioTotalSeguro.add(p.getPrecioSeguro());
		}

		return precioTotalSeguro;
	}

	public String getPrecioTotal(int decimales) {

		String sTotal = "";
		sTotal = String.format("%." + decimales + "f€", precioTotal);

		return sTotal;
	}

	public final static double IVA = 0.21;

	public double getIvaSobrePrecioTotal() {
		// ivaSobrePrecioTotal = precioTotal * 0.21;
		return getPrecioTotal() * IVA; // return ivaSobrePrecioTotal;

	}

	public String getIvaSobrePrecioTotal(int decimales) {
		String sIva = "";
		sIva = String.format("%.2f€", getIvaSobrePrecioTotal());
		return sIva;
	}

	public double getPrecioTotalConIva() {
		// precioTotalConIva = ivaSobrePrecioTotal + precioTotal;
		// return precioTotalConIva;
		return getPrecioTotal() * (IVA + 1);
	}

	public String getPrecioTotalConIva(int decimales) {
		String sIvaTotal = "";
		sIvaTotal = String.format("%.2f€", getPrecioTotalConIva()) + "\n\n APOQUINE";
		return sIvaTotal;
	}

	@Override
	public String toString() {

		return toString(SIN_FORMATO); // "Carrito" + productos.toString();
	}

	public String toString(boolean conFormato) {
		StringBuffer sb = new StringBuffer();// String s = "";

		for (Producto p : productos) {
			sb.append(p.toString(conFormato));
			sb.append('\n');

			// s = new StringBuffer(s).append(p.toString(conFormato)).append("\n").toString();
			// s += p.toString(conFormato) + "\n";
		}

		return sb.toString(); // return s; //return "Carrito" + productos.toString();
	}

}
