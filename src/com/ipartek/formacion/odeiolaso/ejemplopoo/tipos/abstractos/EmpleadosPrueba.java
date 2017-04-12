package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.abstractos;

import java.util.ArrayList;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.empleados.Empleado;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.empleados.EmpleadoIndefinido;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.empleados.EmpleadoPorHoras;

public class EmpleadosPrueba {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		empleados.add(new EmpleadoPorHoras("Javier", 60, 20.0));
		empleados.add(new EmpleadoIndefinido("Ander", 14, 30000.0));

		for (Empleado empleado : empleados)
			System.out.println(empleado.getSueldoMensual());

	}

}
