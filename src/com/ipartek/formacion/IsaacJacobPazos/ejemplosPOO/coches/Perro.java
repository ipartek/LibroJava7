package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches;

public class Perro {
	private String nombre;
	private String raza;
	private String due�o;
	private boolean pulga;

	public Perro(String nombre) {
		this(nombre, "Birraza", "NoDue�o", false);
	}

	public Perro(String nombre, String raza, String due�o, boolean pulga) {
		this.nombre = nombre;
		this.raza = raza;
		this.due�o = due�o;
		this.pulga = pulga;
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

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}

	public boolean isPulga() {
		return pulga;
	}

	public void setPulga(boolean pulga) {
		this.pulga = pulga;
	}

}
