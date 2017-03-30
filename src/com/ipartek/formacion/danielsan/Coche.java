package com.ipartek.formacion.danielsan;

public class Coche {

	private String marca;
	private int potencia, antiguedad, precio;
	private boolean nuevo;

	// constructores
	public Coche() {
		super();
		this.marca = "Ferrari";
		this.potencia = 50;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;

	}

	public Coche(int potencia, String marca) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;

	}

	public Coche(String marca, int potencia, int antiguedad, int precio) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.precio = precio;
		isNuevo();

	}

	// Getters
	public String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public boolean isNuevo() {
		boolean resul;
		if (antiguedad == 0) {
			nuevo = true;
		} else {
			nuevo = false;
		}
		resul = nuevo;
		return resul;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public int getPrecio() {

		int resul = precio;
		if (antiguedad <= 0) {
			resul = precio * 5;
		} else if (antiguedad == 1) {
			resul = precio * 3;
		}

		return resul;
	}

	// Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setPrecio(int precio) {

		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", antiguedad=" + antiguedad + ", precio=" + precio + ", nuevo=" + nuevo + "]";
	}

}