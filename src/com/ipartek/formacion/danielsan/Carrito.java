package com.ipartek.formacion.danielsan;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private final double IVA = 0.21;
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	// Constructores
	public Carrito(ArrayList<com.ipartek.formacion.danielsan.Producto> producto) {
		super();
		productos = producto;
	}

	public Carrito() {
		super();
	}

	// Setters y Getters
	public ArrayList<Producto> getProducto() {
		return productos;
	}

	public void setProducto(ArrayList<Producto> producto) {
		productos = producto;
	}

	// Metodos
	public int getNumeroDeArticulos() {
		return productos.size();
	}

	public double getPrecioTotal() {
		double Precio = 0.0;
		for (Producto p : productos) {
			Precio += p.getPrecio();
		}
		return Math.rint(Precio * 100) / 100;
	}

	public double getIvaSobrePrecioTotal() {
		double Precio = getPrecioTotal();
		return (Math.rint((Precio * IVA) * 100) / 100);
	}

	public double getPrecioTotalConIva() {
		double Precio = getPrecioTotal() + getIvaSobrePrecioTotal();
		return Math.rint(Precio * 100) / 100;
	}

	public void add(Producto producto) {
		productos.add(producto);
	}

	// ToString
	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {
		String s = "Carrito:\n";
		for (Producto p : productos) {
			s = s + p.toString(conFormato) + "\n";
		}

		return s;
	}
}
