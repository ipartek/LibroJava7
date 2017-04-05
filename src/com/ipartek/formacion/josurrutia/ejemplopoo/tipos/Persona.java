package com.ipartek.formacion.josurrutia.ejemplopoo.tipos;

import java.util.Date;

public class Persona {
	private int id;
	private String Nombre;
	private Date FechaNacimiento;

	public Persona(int id, String Nombre) {
		setId(id);
		setNombre(Nombre);
	}

	public Persona(String nombre) {
		super();
		Nombre = nombre;
	}

	public Persona() {
		this(0, "Anonimo");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.FechaNacimiento = fechaNacimiento;
	}

	public String aTexto() {

		// return "ID: " + getId() + ", NOMBRE: " + getNombre() + " Fecha: " + getFechaNacimiento();
		return String.format("ID: %d, NOMBRE: %s, Fecha: %3$te-%3$tm-%3$tY", getId(), getNombre(), getFechaNacimiento());
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + "]";
	}

}
