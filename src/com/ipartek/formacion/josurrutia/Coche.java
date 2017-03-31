package com.ipartek.formacion.josurrutia;

public class Coche {

	// atributos

	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad; // 0
	private int precio; // 100€

	// constructores

	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;
	}

	public Coche(String marca, int potencia, int antiguedad, int precio) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.antiguedad = antiguedad;
		this.precio = precio;
	}

	// getters y setters

	public int getPrecio() {

		int result = precio;
		if (antiguedad <= 0) {
			result = (precio * 5);
		} else if (antiguedad == 1) {
			result = precio * 3;
		}
		if (antiguedad >= 2) {
			result = precio;
		}
		return result;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getAntiguedad() {

		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	// otras funcionalidades

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + "]";
	}

}
