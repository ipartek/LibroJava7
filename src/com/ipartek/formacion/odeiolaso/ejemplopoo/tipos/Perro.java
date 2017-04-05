package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

public class Perro {
	private String nombre;// no puede no tener nombre
	private String raza;
	private String dueno;
	private boolean pulgas;

	public Perro(String nombre) {
		this.nombre = nombre;
		this.raza = "milrazas";
		this.dueno = "sinDueno";
		this.pulgas = false;
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

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

}
