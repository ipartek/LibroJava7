package com.ipartek.formacion.joseba.poo.tipos;

import java.util.Arrays;

public class Cochenuevo {

	public static final int DELANTERA_DERECHA = 0, DELANTERA_IZQUIERDA = 1, TRASERA_DERECHA = 2, TRASERA_IZQUIERDA = 3; // Constante

	private String marca;
	private int potencia, antiguedad, precio;
	private boolean nuevo;

	private Rueda[] ruedas = new Rueda[4];

	public String getMarca() {
		return marca;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
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

	public Cochenuevo(String marca, int potencia, int antiguedad, int precio, boolean nuevo) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.precio = precio;
		this.nuevo = nuevo;
	}

	public Cochenuevo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Coche [marca= " + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + " precio= " + precio + "\nruedas=" + Arrays.toString(ruedas) + "]";
	}

	public void setRueda(Rueda rueda, int delanteraDerecha) {
		// TODO Auto-generated method stub

	}

	public int[] getRueda(int traseraDerecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
