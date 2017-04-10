package com.ipartek.formacion.danilozano.ejemplopoo.tipos.abstractos;

public class EmpleadoPosrHoras extends Empleado {

	private int numeroHoras;
	private double precioHora;

	public double getSueldoMensual() {
		return numeroHoras * precioHora;
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

	public EmpleadoPosrHoras(String nombre, int numeroHoras, double precioHora) {
		super(nombre);
		this.numeroHoras = numeroHoras;
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "EmpleadoPosrHoras [numeroHoras=" + numeroHoras + ", precioHora=" + precioHora + "]";
	}

}
