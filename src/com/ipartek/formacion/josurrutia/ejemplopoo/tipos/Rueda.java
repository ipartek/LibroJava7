package com.ipartek.formacion.josurrutia.ejemplopoo.tipos;

public class Rueda {

	private double radio, ancho;

	public Rueda(double radio, double ancho) {
		super();
		this.radio = radio;
		this.ancho = ancho;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String toString() {
		return "Rueda [ radio: " + radio + ", ancho: " + ancho + "]";
	}

}
