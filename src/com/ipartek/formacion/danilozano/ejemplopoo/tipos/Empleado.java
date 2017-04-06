package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.util.ArrayList;

public class Empleado extends Persona {

	private String dni;
	private int numeroSeguridadSocial;
	private String empresa;
	private double sueldoBruto;

	public Empleado() {

	}

	public Empleado(String string, int i, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public void add(Empleado empleado) {
		empleados.add(empleado);

	}

	// getters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	// ////////////////////////////////////////////////

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", empresa=" + empresa + ", sueldoBruto=" + sueldoBruto + "]";
	}

	// /////////////////////////////////////////////////////////
	// empresa ->getTotalSueldoBruto
}
