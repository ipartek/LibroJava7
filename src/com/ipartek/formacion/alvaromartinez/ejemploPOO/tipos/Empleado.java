package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Empleado extends Persona {

	// atributos
	private String dni;
	private String numeroSeguridadSocial;
	private Puesto puesto;
	private Empresa empresaRazonSocial;
	private double sueldoBruto;

	// constructores
	public Empleado() {
		super();
		this.dni = "00000000A";
		this.numeroSeguridadSocial = "00-00000000A";
		this.puesto = new Puesto();
		this.empresaRazonSocial = new Empresa();
		this.sueldoBruto = 0.0;
	}

	public Empleado(String dni, String numeroSeguridadSocial, Puesto puesto, Empresa empresaRazonSocial,
			double sueldoBruto) {
		super();
		this.dni = dni;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.puesto = puesto;
		this.empresaRazonSocial = empresaRazonSocial;
		this.sueldoBruto = sueldoBruto;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumeroSeguridadSocial() {
		return this.numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public Puesto getPuesto() {
		return this.puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public Empresa getEmpresaRazonSocial() {
		return this.empresaRazonSocial;
	}

	public void setEmpresaRazonSocial(Empresa empresaRazonSocial) {
		this.empresaRazonSocial = empresaRazonSocial;
	}

	public double getSueldoBruto() {
		return this.sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", puesto=" + puesto
				+ ", empresaRazonSocial=" + empresaRazonSocial + ", sueldoBruto=" + sueldoBruto + "]";
	}
	// vvffr
}
