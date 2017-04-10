package com.ipartek.formacion.joseba.poo.tipos;

import java.math.BigDecimal;

public class Empleado extends Persona {
	// Un *Empleado* es una *Persona* que además tiene...
	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	private String nss;

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	private Puesto puesto;

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	private BigDecimal sueldoBruto;
	private Empresa empresa;

	public Empleado(int id, String nombre, BigDecimal sueldoBruto, Puesto puesto) {
		super(id, nombre);
		this.sueldoBruto = sueldoBruto;
		this.puesto = puesto;
	}

	public Empleado(int id, String nombre, Puesto puesto) {
		this(id, nombre, puesto.getSueldoBase(), puesto);
	}

	public BigDecimal getSueldoBruto() {
		return this.sueldoBruto;
	}

	@Override
	public String toString() {
		return "\nEmpleado " + super.toString() + "  [sueldoBruto=" + sueldoBruto + " puesto=" + puesto + "]";
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
