package com.ipartek.formacion.inakijimenez.tipos;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private int id;
	private String nombre;
	private Date fechaNacimiento;

	public Persona(int id, String nombre) {
		setId(id);
		setNombre(nombre);
	}

	public Persona() {
		this(0, "Anonimo");
	}

	public Persona(String nombre) {
		this(0, nombre);
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
		// int id = getId();
		// String nombre = getNombre();
		Date fechaNacimiento = getFechaNacimiento();

		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		String fechaFormateada = formatter.format(fechaNacimiento);

		// String aTexto = "ID: " + id + ", NOMBRE: " + nombre + ", FECHA: " + fechaFormateada;
		return String.format("ID: %d, NOMBRE: %s, Fecha Nacimiento: %s", getId(), getNombre(), fechaFormateada);
	}

	// public void addPersona(int id, String nombre){
	//
	// Persona(id, nombre);
	//
	// }
}
