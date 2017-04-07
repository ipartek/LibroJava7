package com.ipartek.formacion.javierlete.ejemplopoo.tipos;

public class PuntoNombre extends Punto {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return super.toString() + " [nombre=" + nombre + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
