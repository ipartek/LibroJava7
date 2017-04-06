package com.ipartek.formacion.danielsan.pruebas;

import com.ipartek.formacion.danielsan.PuestoEmpresa;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		PuestoEmpresa puesto = PuestoEmpresa.DIRECTOR;
		System.out.println(puesto.getSueldoBase());
		System.out.println(puesto.getPuesto());
	}

}
