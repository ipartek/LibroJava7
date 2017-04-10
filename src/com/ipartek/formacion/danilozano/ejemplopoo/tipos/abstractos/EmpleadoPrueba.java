package com.ipartek.formacion.danilozano.ejemplopoo.tipos.abstractos;

import java.util.ArrayList;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new EmpleadoPosrHoras("dani", 60, 20.2));
		empleados.add(new EmpleadoPosrHoras("javi", 30, 10.2));
		for (Empleado empleado : empleados)
			System.out.println(empleado.getSueldoMensual());
	}

}
