package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Perro {

	private String nombre;
	private String raza;
	private String dueno;
	private boolean pulgas;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.raza = "mil razas";
		this.dueno = "sin dueño";
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, String dueno, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueno = dueno;
		this.pulgas = pulgas;
	}

	public Perro(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueno = "sin dueño";
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, String dueno) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueno = dueno;
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
