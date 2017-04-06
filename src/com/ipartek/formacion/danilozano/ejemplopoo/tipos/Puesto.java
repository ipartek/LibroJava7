package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

public class Puesto extends Empleado {

	private String denominacion;
	private String sueldoBase;

	public Puesto(String string) {

	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(String sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
