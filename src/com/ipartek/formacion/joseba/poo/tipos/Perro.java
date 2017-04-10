package com.ipartek.formacion.joseba.poo.tipos;

public class Perro {

	private String nombre;
	private String raza;
	private boolean dueno;
	private boolean pulga;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueno = dueno;
		this.pulga = pulga;
		this.dueno = false;
		this.pulga = false;
		this.raza = "mil razas";
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

	public boolean isDueno() {
		return dueno;
	}

	public void setDueno(boolean dueno) {
		this.dueno = dueno;
	}

	public boolean isPulga() {
		return pulga;
	}

	public void setPulga(boolean pulga) {
		this.pulga = pulga;
	}

}
