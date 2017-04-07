package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Puesto {

	// atributos
	private String denominacion;
	private double sueldoBaase;

	// constructores
	public Puesto() {
		this.denominacion = "SIN DENOMNACIÓN";
		this.sueldoBaase = 0.0;
	}

	public Puesto(String denominacion, double sueldoBaase) {
		super();
		this.denominacion = denominacion;
		this.sueldoBaase = sueldoBaase;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public double getSueldoBaase() {
		return sueldoBaase;
	}

	public void setSueldoBaase(double sueldoBaase) {
		this.sueldoBaase = sueldoBaase;
	}

	@Override
	public String toString() {
		return "Puesto [denominacion=" + denominacion + ", sueldoBaase=" + sueldoBaase + "]";
	}

}
