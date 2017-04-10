package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Puesto {

	// atributos
	private String denominacion;
	private double sueldoBase;

	// constructores
	public Puesto() {
		this.denominacion = "SIN DENOMNACIÓN";
		this.sueldoBase = 0.0;
	}

	public Puesto(String denominacion, double sueldoBase) {
		super();
		this.denominacion = denominacion;
		this.sueldoBase = sueldoBase;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Puesto [denominacion=" + denominacion + ", sueldoBase=" + sueldoBase + "]";
	}
	// hola
}
