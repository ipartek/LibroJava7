package com.ipartek.formacion.joseba.poo.tipos;

import java.util.Date;

public class Persona {
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	private int id;
	private String nombre;
	private Date fechaNacimiento;

	public Persona(int id, String nombre) {
		setId(id);
		setNombre(nombre);
	}

	public Persona() {
		this(0, "Anónimo");
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

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@SuppressWarnings("deprecation")
	public String aTexto() {

		// return String.format("ID: %d, NOMBRE: %s, FECHA_NACIMIENTO: %3$te-%3$tm-%3$tY",
		// getId(), getNombre(), getFechaNacimiento());
		return String.format("ID: %d, NOMBRE: %s, FECHA_NACIMIENTO: %d-%d-%d", getId(), getNombre(), getFechaNacimiento().getDate(), getFechaNacimiento().getMonth() + 1, getFechaNacimiento().getYear() + 1900);
	}

	private Date getFechaNacimiento() {
		return fechaNacimiento;
	}
}
