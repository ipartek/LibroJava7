package com.ipartek.formacion.inakijimenez.tipos;

public class Perro {

	private String nombre;
	private String raza;
	private String duenyo;
	private boolean pulgas;

	public Perro() {
		System.out.println("No puede existir un perro sin nombre");
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.raza = "mil razas";
		this.duenyo = "Sin Dueño";
		this.pulgas = false;
	}

	public Perro(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.duenyo = "Sin Dueño";
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, String duenyo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.duenyo = duenyo;
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, String duenyo, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.duenyo = duenyo;
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

	public String getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(String duenyo) {
		this.duenyo = duenyo;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

}
