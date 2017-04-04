package com.ipartek.formacion.danielsan;

public class Producto {

	private int indice;
	private String nombre;
	private double precio;

	//Constructores
	public Producto(int indice, String nombre, double precio) {
		super();
		this.indice = indice;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto() {
		super();
	}
	
	//Setters y Getters
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
	
	//ToString
	@Override
	public String toString() {
		return "\nProducto [indice=" + indice + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
