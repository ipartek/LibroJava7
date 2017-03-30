package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

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
		this.antiguedad = 0;
		this.precio = 100;
	}

	public Coche(String marca, int potencia, int antiguedad) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.antiguedad = antiguedad;
		this.precio = 100;
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

		int precioAjustado = precio;

		if (this.antiguedad <= 0) {
			precioAjustado = precio * 5;
		}

		if (this.antiguedad == 1) {
			precioAjustado = precio * 3;
		}

		if (this.antiguedad >= 2) {
			precioAjustado = precio;

		}
		return precioAjustado;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// otras funcionalidades
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + ", antiguedad=" + antiguedad + ", precio=" + precio + "]";
	}

}
