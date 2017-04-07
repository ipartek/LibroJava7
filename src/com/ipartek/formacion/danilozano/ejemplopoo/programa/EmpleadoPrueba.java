package com.ipartek.formacion.danilozano.ejemplopoo.programa;

import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Empleado;
import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Persona;



public class EmpleadoPrueba {

	public static void main(String[] args) {
		Persona nuevo = new Persona();

		nuevo.add(new Empleado("151615x", 511, "fhdg", 125.03));
		nuevo.add(new Empleado("535355x", 55531, "f", 52.3));
		System.out.println(nuevo);
		System.out.println("El total del sueldo bruto es= " +nuevo.getTotalSueldoBruto());
	}

}
