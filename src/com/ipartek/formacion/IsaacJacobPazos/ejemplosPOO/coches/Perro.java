package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches;

public class Perro {
	private String nombre;
	private String raza;
	private String dueño;
	private boolean pulga;

	public Perro(String nombre) {
		this(nombre, "Birraza", "NoDueño", false);
	}

	public Perro(String nombre, String raza, String dueño, boolean pulga) {
		this.nombre = nombre;
		this.raza = raza;
		this.dueño = dueño;
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

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public boolean isPulga() {
		return pulga;
	}

	public void setPulga(boolean pulga) {
		this.pulga = pulga;
	}

}
