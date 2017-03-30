package com.ipartek.formacion.anderuraga;

public class Coche {

	// atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int anyo;
	private int precio;

	// constructores
	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
	}

	public Coche(String marca, int potencia) {
		super();
		this.marca = marca;
		this.potencia = potencia;
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

	// otras funcionalidades
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + "]";
	}

}
