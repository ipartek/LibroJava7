package com.ipartek.formacion.alexanderbilbao.ejemplospoo.programa;

import java.util.ArrayList;

import com.ipartek.formacion.alexanderbilbao.ejemplospoo.tipos.abstractos.Empleado;
import com.ipartek.formacion.alexanderbilbao.ejemplospoo.tipos.abstractos.EmpleadoException;
import com.ipartek.formacion.alexanderbilbao.ejemplospoo.tipos.abstractos.EmpleadoIndefinido;
import com.ipartek.formacion.alexanderbilbao.ejemplospoo.tipos.abstractos.EmpleadoPorHoras;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		try {
			empleados.add(new EmpleadoPorHoras("Javier", 60, 20.0));
			empleados.add(new EmpleadoIndefinido("Ander", 14, 30000.0));

			for (Empleado empleado : empleados)
				System.out.println(empleado.getSueldoMensual());
		} catch (EmpleadoException ee) {
			System.out.println("Error de tipo empleado");
			ee.printStackTrace();

		}
	}

}
