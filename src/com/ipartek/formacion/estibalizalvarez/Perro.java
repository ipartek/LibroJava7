package com.ipartek.formacion.estibalizalvarez;

public class Perro {

	// Atributos
	private String nombre;
	private String raza;
	private String due�o;
	private Boolean pulgas;

	// construtores:
	public Perro(String nombre) {
		super();// Te lo pone por defecto.
		this.nombre = nombre;// te devuelve el valor que le hayas puesto en la variable nombre.
		this.raza = "Mil razas";// por defecto.
		this.due�o = "Sin due�o";// por defecto.
		this.pulgas = false;

	}// constructor
		// geters y seters

	public String toString() {// te devuelve todos los string.
		return "Perro [Nombre=" + nombre + ", Raza=" + raza + ", Due�o=" + due�o + ", Pulgas=" + pulgas +]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}

	public Boolean getPulgas() {
		return pulgas;
	}

	public void setPulgas(Boolean pulgas) {
		this.pulgas = pulgas;
	}

	// otras funcionalidades

}// perro
