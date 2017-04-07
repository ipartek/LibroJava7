package com.ipartek.formacion.estibalizalvarez.tipos;

import java.util.ArrayList;

public class empleado {

	// atributos:
	private String dni;
	private int numeross;
	private Puesto puesto;
	private double sueldobruto;
	private Empresa empresatrabajo;

	// arraylist:
	private ArrayList<Puesto> id = new ArrayList<>();

	// añades a id la denominacion del puesto.
	public void add(Puesto denominacion) {
		id.add(denominacion);

	}

	// to.string:
	@Override
	public String toString() {
		return "empleado [dni=" + dni + ", numeross=" + numeross + ", puesto=" + puesto + ", sueldobruto=" + sueldobruto + ", empresatrabajo=" + empresatrabajo + ", id=" + id + "]";
	}

	// constructores:

	public empleado() {// constructor vacio.
		super();
	}

	// constructores con campos:
	public empleado(String dni, int numeross, Puesto puesto, double sueldobruto, Empresa empresatrabajo) {
		super();
		this.dni = dni;
		this.numeross = numeross;
		this.puesto = puesto;
		this.sueldobruto = sueldobruto;
		this.empresatrabajo = empresatrabajo;
	}

	// get y set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeross() {
		return numeross;
	}

	public void setNumeross(int numeross) {
		this.numeross = numeross;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public double getSueldobruto() {
		return sueldobruto;
	}

	public void setSueldobruto(double sueldobruto) {
		this.sueldobruto = sueldobruto;
	}

	public Empresa getEmpresatrabajo() {
		return empresatrabajo;
	}

	public void setEmpresatrabajo(Empresa empresatrabajo) {
		this.empresatrabajo = empresatrabajo;
	}

}// empleado
