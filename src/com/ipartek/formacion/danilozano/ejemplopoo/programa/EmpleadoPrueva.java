package com.ipartek.formacion.danilozano.ejemplopoo.programa;

import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Empleado;

public class EmpleadoPrueva {

	public static void main(String[] args) {
		Empleado nuevo = new Empleado();

		nuevo.add(new Empleado("151615x", 511, "fhdg", 125.03));
		System.out.println(nuevo);
	}

}
