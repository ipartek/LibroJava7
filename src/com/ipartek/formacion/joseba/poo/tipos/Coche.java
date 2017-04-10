package com.ipartek.formacion.joseba.poo.tipos;

public class Coche {

	// Atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int precio;

	private int antiguedad;
	private int precio_total;

	// Constructores

	public Coche() {
		super();

		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.precio = 100;
		this.antiguedad = 0;

	}

	public Coche(String marca, int potencia) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;

	}

	// Getters y Setters
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

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;

	}

	public int getPrecio() {

		if (antiguedad <= 0) {

			precio_total = (precio * 5);
		} else if (antiguedad == 1) {

			precio_total = (precio * 3);
		} else if (antiguedad >= 2) {

			precio_total = (precio * 1);
		}

		return precio_total;
	}

	public void setPrecio(int precio) {
		this.precio = precio;

	}

	// Otras funcionalidades
	@Override
	public String toString() {
		return "Coche [marca= " + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + " precio= " + precio_total + " ]";
	}

}
