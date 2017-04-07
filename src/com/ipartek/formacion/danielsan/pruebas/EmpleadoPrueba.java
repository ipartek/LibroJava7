package com.ipartek.formacion.danielsan.pruebas;

import com.ipartek.formacion.danielsan.Empleado;
import com.ipartek.formacion.danielsan.PuestoEmpresa;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		PuestoEmpresa puesto = PuestoEmpresa.DIRECTOR;
		System.out.println(puesto.getSueldoBase());
		System.out.println(puesto.getPuesto());

		Empleado e = new Empleado(1, "Juan", 13758137, 335654, puesto, "Iberdrola");
		System.out.println(e.toString());
		// Empresa NEO_GEO = new Empresa();
	}
}
