package com.ipartek.formacion.odeiolaso.ejemplopoo.programa;

import java.math.BigDecimal;
import java.util.Scanner;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Empleado;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Persona;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Puesto;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del director: ");
		String nombre = s.nextLine();
		s.close();

		// Empresa e = new Empresa("JLSA", new Persona(1, "Jefe Jefacez"));
		Empresa e = new Empresa("JLSA", new Persona(1, nombre));

		Persona p = new Persona(2, "Invitado Invitadez");
		Empleado e1 = new Empleado(3, "Empleado Empleadez", new BigDecimal(10000.0), Puesto.EMPLEADO);
		Empleado e2 = new Empleado(3, "EmpleaDOS Empleadez", Puesto.JUNTA);

		e.addPersona(e1);
		e.addPersona(p);
		e.addPersona(e2);

		System.out.println(e);
		System.out.println(e.getTotalSueldoBruto());
	}
}
