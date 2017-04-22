package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

public class Vehiculo {

	private String modelo;
	private double potencia;
	private boolean cRuedas;

	public Vehiculo(String modelo) {
		this.modelo = modelo;

	}

	public double damePotencia() {
		return potencia;
	}

	public void ponPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean dameRuedas() {
		return cRuedas;
	}

	public void ponRuedas(boolean ruedas) {
		this.cRuedas = ruedas;
	}

	public String imprimir() {
		if (cRuedas) {
			return String.format("Modelo: %s\nPotencia: %s CV\nTracción a las cuatro ruedas: Sí\n", modelo, potencia);
		} else
			return String.format("Modelo: %s\nPotencia: %s CV\nTracción a las cuatro ruedas: No\n", modelo, potencia);
	}

}
