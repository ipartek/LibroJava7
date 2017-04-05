package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.util.Arrays;

public class Coche {

	public static final int DELANTERA_DERECHA = 0, DELANTERA_IZQUIERDA = 1, TRASERA_DERECHA = 2, TRASERA_IZQUIERDA = 3;

	// atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad;
	private int precio;

	private Rueda[] ruedas = new Rueda[4];

	// contructores
	public Coche() {
		super();
		this.marca = "Nisu";
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
		this.precio = 100;
		this.antiguedad = 0;
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

	public int getPrecio() {
		int resul = precio;

		if (antiguedad <= 0)
			resul = precio * 5;
		else if (antiguedad == 1) {
			resul = precio * 3;
			nuevo = false;
		} else
			nuevo = false;

		// en funcion de su antigueda puede variar
		// si antiguedad cero precio * 5
		// si antiguedad 1 precio * 3
		// y si antiguedad >2 precio * 1
		return resul;
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

	// otras funcionalidades

	public Rueda[] getRuedas() {
		return ruedas;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + ", antiguedad=" + antiguedad + ", precio=" + precio + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public void setRueda(Rueda rueda, int posicion) {
		ruedas[posicion] = rueda;
	}

	public Rueda getRueda(int posicion) {
		return ruedas[posicion];
	}

	// @Override
	// public String toString() {
	// return "Coche [Marca: " + marca + ", Potencia: " + potencia + ", Nuevo: " + nuevo + "]";
	// }

}
