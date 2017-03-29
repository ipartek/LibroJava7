package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

import java.util.Date;

public class Persona {

	private int id;
	private String nombre;
	private Date d;

	public Persona() {

	}

	public Persona(int id, String nombre) {
		setId(id);
		setNombre(nombre);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setFechaNacimiento(Date d) {
		this.d = d;

	}

	public Date getFechaNacimiento() {
		return d;
	}

	public String aTexto() {
		return ("ID: " + id + ", NOMBRE: " + nombre + ", " + d);
	}

}
