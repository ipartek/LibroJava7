package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.util.ArrayList;

public class Empleado {

	private String dni;
	private int numeroSeguridadSocial;
	private String empresa;
	private double sueldoBruto;

	public Empleado(String dni, int numeroSeguridadSocial, String empresa,
			double sueldoBruto) {
		super();
		this.dni = dni;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.empresa = empresa;
		setSueldoBruto(sueldoBruto);
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public String toString() {
		return "DNI: "+dni+ "S.S: "+numeroSeguridadSocial+ "Empresa: "+ empresa+"Sueldo Bruto: "+sueldoBruto+"\n";
	}

	

	}

	// /////////////////////////////////////////////////////////
	// empresa ->getTotalSueldoBruto

