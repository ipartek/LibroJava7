package com.ipartek.formacion.leiremunarriz;

public class Coche {

	//atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad;
	private int precio;

	//constructores
	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;
	}

	public Coche(String marca, int potencia) {
		this();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;

	}

	//getters y setters

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

	//no se puede hacer con un case porque no se controla el valor negativo

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

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + ", antiguedad=" + antiguedad + ", precio=" + precio + "]";
	}

	//otras funcionalidades
	//@Override
	//public String toString() {

	//return "coche [marca=" + getMarca() + ", potencia=" + potencia + ", nuevo=" + nuevo + " + antiguedad+", antiguedad="+precio+", precio"]";
	//}

}
