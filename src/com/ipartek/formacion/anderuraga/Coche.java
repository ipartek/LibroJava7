package com.ipartek.formacion.anderuraga;

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
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.precio = 100;
		this.antiguedad = 0;
	}

	public Coche(String marca, int potencia) {
		this();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
	}

	// getters y setters

	public int getPrecio() {
		int resul = precio;
		if (antiguedad <= 0) {
			resul = precio * 5;
		} else if (antiguedad == 1) {
			resul = precio * 3;
		}
		return resul;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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
