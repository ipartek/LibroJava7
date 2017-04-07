package com.ipartek.formacion.estibalizalvarez;

public class Coche {

	// atributos
	private String marca;// es una marca.
	private int potencia; // es un numero.
	private boolean nuevo;// esta variable es para decirte si es nuevo o no es nuevo.
	private int antiguedad;//
	private int precio;//

	// constructores
	public Coche() {// hemos generado un constructor.
		super();// te lo pone por defecto.
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
	}

	public Coche(String marca, int potencia) {// otro contructor.
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
	}

	// geters y seters
	@Override
	public String toString() {// te devuelve todos los string.
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + "]";
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

}
