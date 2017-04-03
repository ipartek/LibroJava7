package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Perro {

	// atributos
	private String nombre;
	private String raza;
	private String due�o;
	private Boolean pulgas;

	// constructores

	public String getRaza() {
		return raza;
	}

	public Perro(String nombre, String raza, String due�o, Boolean pulgas) {
		super();
		this.raza = " Mil razas";
		this.due�o = "Sin due�o";
		this.pulgas = false;
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

	public Boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(Boolean pulgas) {
		this.pulgas = pulgas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// otras funcionalidades

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", due�o=" + due�o + ", pulgas=" + pulgas + "]";
	}

}
