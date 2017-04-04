package com.ipartek.formacion.danielsan;

public class Perro {

	private String nombre, raza, due�o;
	private boolean pulgas;
	
	//Constructores
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.pulgas=false;
		this.due�o=null;
		this.raza="Mil razas";
	}

	public Perro(String nombre, String raza, String due�o, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.due�o = due�o;
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

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
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
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", due�o=" + due�o + ", pulgas=" + pulgas + "]";
	}
	
	
}
