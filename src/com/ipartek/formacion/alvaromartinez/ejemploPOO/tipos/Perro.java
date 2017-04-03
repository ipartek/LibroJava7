package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Perro {

	// atributos
	private String nombre;
	private String raza;
	private String dueño;
	private Boolean pulgas;

	// constructores

	public String getRaza() {
		return raza;
	}

	public Perro(String nombre, String raza, String dueño, Boolean pulgas) {
		super();
		this.raza = " Mil razas";
		this.dueño = "Sin dueño";
		this.pulgas = false;
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
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueño=" + dueño + ", pulgas=" + pulgas + "]";
	}

}
