package com.ipartek.formacion.danielsan;

public class Producto {

	private int indice;
	private String nombre;
	private double precio;
	public static final int ANCHO_INDICE = 5, ANCHO_NOMBRE = 30, ANCHO_PRECIO = 10;
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	// Constructores
	public Producto(int indice, String nombre, double precio) {
		super();
		this.indice = indice;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	// Setters y Getters
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
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

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// ToString
	@Override
	public String toString() {
		return toString(SIN_FORMATO);

	}

	public String toString(boolean conFormato) {
		if (conFormato) {
			return String.format("ID: %" + ANCHO_INDICE + "d\t %-" + ANCHO_NOMBRE + "s %" + ANCHO_PRECIO + ".2f", indice, nombre, precio);
		} else {
			return String.format("ID: " + indice + "--> " + nombre + " (" + precio + "€)");
		}
	}
}
