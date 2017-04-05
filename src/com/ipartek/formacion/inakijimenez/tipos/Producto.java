package com.ipartek.formacion.inakijimenez.tipos;

public class Producto {

	private int id;
	private String nombre;
	private double precio;

	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

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

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		// return "ID:" + id + "\t" + nombre + "\t" + precio + "€\n";
		return toString(false);
	}

	public String toString(boolean conFormato) {
		if (conFormato) {
			return String.format("ID: %5d %-50s %10.2f\n", id, nombre, precio);
		} else {
			return String.format("ID: %d %s %10.2f\n", id, nombre, precio);
		}

	}
}
