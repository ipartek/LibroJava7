package com.ipartek.formacion.danielsan;

public class Empleado extends Persona {

	private int dni, numeroSeguridadSocial;
	private PuestoEmpresa puesto;
	private String empresa;
	private double sueldoBruto;

	// Constructor
	public Empleado(int id, String nombre, int dni, int numeroSeguridadSocial, PuestoEmpresa puesto, String empresa) {
		super(id, nombre);
		this.dni = dni;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.puesto = puesto;
		this.empresa = empresa;
		this.sueldoBruto = puesto.getSueldoBase();
	}

	public Empleado(int id, String nombre) {
		super(id, nombre);
	}

	// Setters y Getters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public PuestoEmpresa getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoEmpresa puesto) {
		this.puesto = puesto;
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

	// ToString
	@Override
	public String toString() {
		return super.toString() + "Empleado [dni=" + dni + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", puesto=" + puesto + ", empresa=" + empresa + ", sueldoBruto=" + sueldoBruto + "]";
	}

	// Empresa --> get total sueldo bruto
	// Puesto: nombre, sueldo

}
