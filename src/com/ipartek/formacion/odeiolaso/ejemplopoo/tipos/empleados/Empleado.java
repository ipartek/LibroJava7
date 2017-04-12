package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.empleados;

public abstract class Empleado {

	private String nombre;

	public abstract double getSueldoMensual();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

	public Empleado(String nombre) {
		if (nombre == null || nombre.trim().length() == 0)
			throw new EmpleadoNombreException("Nose admiten nombres nulos ni vacios");

		setNombre(nombre);

	}

}
