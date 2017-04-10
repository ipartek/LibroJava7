package com.ipartek.formacion.danilozano.ejemplopoo.tipos.abstractos;

public abstract class Empleado {
	private String nombre;

	public abstract double getSueldoMensual();

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

}
