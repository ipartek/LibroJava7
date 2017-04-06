package com.ipartek.formacion.danielsan;

public enum PuestoEmpresa {
	DIRECTOR("Director", 6000), MIENBROJUNTA("Miembro de la Junta", 4000), INTERNO("Interno", 2200), EXTERNO("Externo", 1400), MANTENIMIENTO("Mantenimiento", 800);

	private String puesto;
	private int sueldoBase;

	private PuestoEmpresa(String puesto, int sueldoBase) {
		this.puesto = puesto;
		this.sueldoBase = sueldoBase;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

}
