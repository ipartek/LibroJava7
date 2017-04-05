package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Producto {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	private int id;
	private String nombre;
	private double precio;
	private BigDecimal precioseguro;

	public static final int ANCHO_ID = 5, ANCHO_NOMBRE = 50, ANCHO_PRECIO = 1;

	@Override
	public String toString() {
		return "Producto [precioseguro=" + precioseguro + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		setPrecioseguro(new BigDecimal(String.format("%.2f", precio).replace(',', '.')));
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

	public BigDecimal getPrecioseguro() {
		return precioseguro;
	}

	public void setPrecioseguro(BigDecimal precioseguro) {
		this.precioseguro = precioseguro;
	}

}
