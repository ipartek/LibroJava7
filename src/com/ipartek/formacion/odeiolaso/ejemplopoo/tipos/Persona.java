package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.util.Date;

public class Persona {

	private int id;
	private String nombre;
	// public String aTexto;
	private Date fechaNacimiento;

	public Persona() {
		this(0, "Anonnimo");
	}

	public Persona(int id, String nombre) {

		setId(id);
		setNombre(nombre);
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String aTexto() {

		// return "ID: " + id + " NOMBRE: " + nombre + " FECHA_NACIMINETO: " + fechaNacimiento;
		// return String.format("ID: %d, NOMBRE: %s, FECHA_NACIMINETO: %3$te-%3$tm-%3$tY", id, nombre, fechaNacimiento);

		return String.format("ID: %d, NOMBRE: %s, FECHA_NACIMINETO: %d-%d-%d", getId(), getNombre(), getFechaNacimiento().getDate(), getFechaNacimiento().getMonth(), getFechaNacimiento().getYear());
	}
}
