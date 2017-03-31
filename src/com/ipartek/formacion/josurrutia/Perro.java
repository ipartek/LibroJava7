package com.ipartek.formacion.josurrutia;

/*
 un perro 
 nombre 
 raza mil razas
 dueño sin dueño boolean 
 pulgas sin pulgas boolean 
 */
public class Perro {

	private String nombre;
	private String raza;
	private boolean duenio;
	private boolean pulgas;

	public Perro() {
		super();
		this.nombre = "Lar";
		this.raza = "mil razas";
		this.duenio = false;
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, boolean duenio, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.duenio = duenio;
		this.pulgas = pulgas;
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

	public boolean isDuenio() {
		return duenio;
	}

	public void setDuenio(boolean duenio) {
		this.duenio = duenio;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", duenio=" + duenio + ", pulgas=" + pulgas + "]";
	}

}
