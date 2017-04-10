package com.ipartek.formacion.joseba.poo.tipos;

import java.math.BigDecimal;

public class CPuesto {
	public static final CPuesto DIRECTOR = new CPuesto(0, "DIRECTOR", new BigDecimal(50000.0));
	public static final CPuesto JUNTA = new CPuesto(1, "JUNTA", new BigDecimal(40000.0));
	public static final CPuesto EMPLEADO = new CPuesto(2, "EMPLEADO", new BigDecimal(30000.0));

	private static CPuesto[] valores = { DIRECTOR, JUNTA, EMPLEADO };

	private BigDecimal sueldoBase;
	private int orden;
	private String nombre;

	private CPuesto(int orden, String nombre, BigDecimal sueldoBase) {
		this.orden = orden;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}

	public static CPuesto[] values() {
		return valores;
	}

	public int ordinal() {
		return this.orden;
	}

	public String name() {
		return this.nombre;
	}

	public String toString() {
		return name();
	}

	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}
}
