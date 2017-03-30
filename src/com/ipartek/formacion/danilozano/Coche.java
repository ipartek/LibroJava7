package com.ipartek.formacion.danilozano;

public class Coche {

	// atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad;
	private int precio;

	// constructores
	public Coche() {
		super();
		this.setMarca("nisu");
		this.setPotencia(50);
		this.nuevo = true;
		this.precio = (100);
		this.antiguedad = (0);

	}

	public Coche(String marca, int potencia) {
		super();
		this.setMarca(marca);
		this.setPotencia(potencia);
		this.nuevo = true;
	}

	// getters y setters

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

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
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

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// otras funcionalidades

	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + "]";

	}

}
