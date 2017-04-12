package com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Producto {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private int id;
	private String nombre;
	private double precio;

	private BigDecimal precioSeguro;

	public static final int ANCHO_ID = 5, ANCHO_NOMBRE = 50, ANCHO_PRECIO = 10;

	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {
		if (conFormato)
			return String.format("ID: %" + ANCHO_ID + "d %-" + ANCHO_NOMBRE + "s %" + ANCHO_PRECIO + ".2f€", id, nombre, precio);
		else
			return "ID: " + id + ", " + nombre + ", " + precio + "€";
	}

	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		setPrecio(precio);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		setPrecioSeguro(new BigDecimal(String.format("%.2f", precio).replace(',', '.')));
		// String textoPrecio = String.format("%.2f", precio);
		// textoPrecio = textoPrecio.replace(',', '.');
		// BigDecimal bdPrecio = new BigDecimal(textoPrecio);
		// setPrecioSeguro(bdPrecio);
	}

	public BigDecimal getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(BigDecimal precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

}
