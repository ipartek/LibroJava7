package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Producto {

	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private int id;
	private String nombre;
	private double precio;

	private BigDecimal precioSeguro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public BigDecimal getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		setPrecioSeguro(new BigDecimal(String.format("%.2f", precio).replace(',', '.')));
		String textoPrecio = String.format("%.2", precio);
		textoPrecio = textoPrecio.replace(',', '.');
		// BigDecimal
	}

	public void setPrecioSeguro(BigDecimal precioSeguro) {
		this.precioSeguro = precioSeguro;

	}

	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		setPrecio(precio);

	}

	public static final int ANCHO_ID = 5, ANCHO_NOMBRE = 50, ANCHO_PRECIO = 10;

	@Override
	public String toString() {

		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {
		if (conFormato)
			return String.format("ID: %" + ANCHO_ID + "d %-" + ANCHO_NOMBRE + "s %" + ANCHO_PRECIO + ".2f�", id, nombre, precio);
		else
			return /* "\n */"ID: " + id + ",\t" + nombre + ", \t" + precio + "�";

	}

}
