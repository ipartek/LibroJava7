package com.ipartek.formacion.joseba.poo.tipos;

public class Rueda {

	private double radio, ancho;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Rueda [radio=" + radio + ", ancho=" + ancho + "]";
	}

	public Rueda() {
		super();
	}

	public double getAncho() {
		return ancho;
	}

	public Rueda(double radio, double ancho) {
		super();
		this.radio = radio;
		this.ancho = ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
}
