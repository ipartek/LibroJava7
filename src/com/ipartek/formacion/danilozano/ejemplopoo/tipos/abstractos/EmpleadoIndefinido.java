package com.ipartek.formacion.danilozano.ejemplopoo.tipos.abstractos;

public class EmpleadoIndefinido extends Empleado {
	private int numeroPagas;
	private double sueldoAnual;

	@Override
	public String toString() {
		return "EmpleadoIndefinido [numeroPagas=" + numeroPagas + ", sueldoAnual=" + sueldoAnual + "]";
	}

	public int getNumeroPagas() {
		return numeroPagas;
	}

	public void setNumeroPagas(int numeroPagas) {
		this.numeroPagas = numeroPagas;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	public EmpleadoIndefinido(String nombre, int numeroPagas, double sueldoAnual) {
		super(nombre);
		this.numeroPagas = numeroPagas;
		this.sueldoAnual = sueldoAnual;
	}

	public double getSueldoMensual() {

		return sueldoAnual * numeroPagas;
	}

}
