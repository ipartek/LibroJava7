package com.ipartek.formacion.javierlete.ejemplopoo.tipos;

import java.util.Arrays;

public class Coche {
	private String marca;
	private int potencia, antiguedad, precio;
	private boolean nuevo;

	private Rueda[] ruedas = new Rueda[4];

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", antiguedad=" + antiguedad + ", precio=" + precio + ", nuevo=" + nuevo + ", ruedas=" + Arrays.toString(ruedas) + "]";
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public Coche(String marca, int potencia, int antiguedad, int precio, boolean nuevo) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.precio = precio;
		this.nuevo = nuevo;
	}

	public Coche(String marca, int potencia, int antiguedad) {
		this(marca, potencia, antiguedad, 0, false);
	}

	public Coche(String marca) {
		this(marca, 0, 0, 0, false);
	}

	public Coche() {

	}
}
