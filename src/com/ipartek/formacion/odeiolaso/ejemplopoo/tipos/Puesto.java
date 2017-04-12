package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.math.BigDecimal;

public enum Puesto {
	DIRECTOR(new BigDecimal(50000.0)), JUNTA(new BigDecimal(40000.0)), EMPLEADO(new BigDecimal(30000.0));

	private BigDecimal sueldoBase;

	private Puesto(BigDecimal sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}

}
