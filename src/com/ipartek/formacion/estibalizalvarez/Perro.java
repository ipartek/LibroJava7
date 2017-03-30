package com.ipartek.formacion.estibalizalvarez;

public class Perro {

	// Atributos
	private String nombre;
	private String raza;
	private String dueño;
	private Boolean pulgas;

	// construtores:
	public Perro(String nombre) {
		super();// Te lo pone por defecto.
		this.nombre = nombre;// te devuelve el valor que le hayas puesto en la variable nombre.
		this.raza = "Mil razas";// por defecto.
		this.dueño = "Sin dueño";// por defecto.
		this.pulgas = false;

	}// constructor
		// geters y seters

	public String toString() {// te devuelve todos los string.
		return "Perro [Nombre=" + nombre + ", Raza=" + raza + ", Dueño=" + dueño + ", Pulgas=" + pulgas +]";
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

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Boolean getPulgas() {
		return pulgas;
	}

	public void setPulgas(Boolean pulgas) {
		this.pulgas = pulgas;
	}

	// otras funcionalidades

}// perro
