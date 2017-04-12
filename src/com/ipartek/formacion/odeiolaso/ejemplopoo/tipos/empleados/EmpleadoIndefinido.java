package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.empleados;

public class EmpleadoIndefinido extends Empleado {

	private int numeroPagas;
	private double sueldoAnual;

	public double getSueldoMensual() {
		return sueldoAnual / numeroPagas;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	@Override
	public String toString() {
		return "EmpleadoIndefinido [numeroPagas=" + numeroPagas + ", sueldoAnual=" + sueldoAnual + "]";
	}

	public int getNumeroPagas() {
		return numeroPagas;
	}

	public EmpleadoIndefinido(String nombre, int numeroPagas, double sueldoAnual) {
		super(nombre);
		this.numeroPagas = numeroPagas;
		this.sueldoAnual = sueldoAnual;
	}

	public void setNumeroPagas(int numeroPagas) {
		this.numeroPagas = numeroPagas;
	}
}
