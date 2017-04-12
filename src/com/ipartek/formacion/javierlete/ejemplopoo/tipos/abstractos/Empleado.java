package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

public abstract class Empleado {
	private String nombre;

	public abstract double getSueldoMensual();

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

	public Empleado(String nombre) {
		super();
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() == 0)
			throw new EmpleadoException("No se admiten nombres nulos ni vacíos");

		this.nombre = nombre;
	}

}
