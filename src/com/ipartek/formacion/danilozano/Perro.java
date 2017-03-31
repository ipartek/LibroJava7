package com.ipartek.formacion.danilozano;

public class Perro {
	// atributos
	private String nombre;
	private String raza;
	private String dueyo;
	private boolean pulgas;

	// constructores
	public Perro() {
		this.setNombre(null);
		this.setRaza("milrazas");
		this.setDueyo("Sin Dueño");
		this.pulgas = false;
	}

	public Perro(String nombre, String raza, String dueyo, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueyo = dueyo;
		this.pulgas = pulgas;
	}

	// getters y setters

	public String getNombre() {

		String resul = nombre;
		if (nombre == null) {
			resul = (null);

		} else {
			resul = getNombre();
			return resul;
		}
		return resul;

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

	public String getDueyo() {
		return dueyo;
	}

	public void setDueyo(String dueyo) {
		this.dueyo = dueyo;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {

		return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueyo=" + dueyo + ", pulgas=" + pulgas + "]";

	}
}
