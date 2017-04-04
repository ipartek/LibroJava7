package com.ipartek.formacion.danielsan;

public class Perro {

	private String nombre, raza, dueño;
	private boolean pulgas;
	
	//Constructores
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.pulgas=false;
		this.dueño=null;
		this.raza="Mil razas";
	}

	public Perro(String nombre, String raza, String dueño, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueño = dueño;
		this.pulgas = pulgas;
	}

	//Setters y Getters
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

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueño=" + dueño + ", pulgas=" + pulgas + "]";
	}
	
	
}
