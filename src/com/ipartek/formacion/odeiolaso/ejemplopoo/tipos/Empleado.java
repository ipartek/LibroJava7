package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Empleado extends Persona {
	// Un *Empleado* es una *Persona* que admes tiene...
	private String dni;
	private String nss;
	private Puesto puesto;
	private BigDecimal sueldoBruto;
	private Empresa empresa;

	public Empleado(int id, String nombre, BigDecimal sueldoBruto, Puesto puesto) {
		super(id, nombre);
		this.sueldoBruto = sueldoBruto;
	}

	public Empleado(int id, String nombre, Puesto puesto) {
		this(id, nombre, puesto.getSueldoBase(), puesto);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public BigDecimal getSueldoBruto() {
		return this.sueldoBruto;
	}

	@Override
	public String toString() {
		return "\nEmpleado " + super.toString() + "  [sueldoBruto=" + sueldoBruto + " puesto= " + puesto + "]";
	}
}
