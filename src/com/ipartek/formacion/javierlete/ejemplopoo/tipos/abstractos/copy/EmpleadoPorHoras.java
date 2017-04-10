package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.copy;

public class EmpleadoPorHoras extends Empleado {

	private int numeroHoras;
	private double precioHora;

	@Override
	public String toString() {
		return super.toString() + " EmpleadoPorHoras [numeroHoras=" + numeroHoras + ", precioHora=" + precioHora + "]";
	}

	public EmpleadoPorHoras(String nombre, int numeroHoras, double precioHora) {
		super(nombre);
		this.numeroHoras = numeroHoras;
		this.precioHora = precioHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	public double getSueldoMensual() {
		return numeroHoras * precioHora;
	}

}
