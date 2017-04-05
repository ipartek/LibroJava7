package com.ipartek.formacion.danielsan;

public class PuntoNombre extends Punto {
	private String nombre;

	// Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PuntoNombre [nombre=" + nombre + "]";
	}

}
