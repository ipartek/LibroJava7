package com.ipartek.formacion.estibalizalvarez.tipos;

public class Puesto {

	private String denominacion;
	private double sueldo;

	// constructores:

	public Puesto() {
		super();
		// constructor vacio.
	}

	// constructor usando campos.
	public Puesto(String denominacion, double sueldo) {
		super();
		this.denominacion = denominacion;
		this.sueldo = sueldo;
	}

	// get y set.
	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}// puesto
