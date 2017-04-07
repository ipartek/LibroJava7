package com.ipartek.formacion.estibalizalvarez.programa;

import com.ipartek.formacion.estibalizalvarez.tipos.Puesto;
import com.ipartek.formacion.estibalizalvarez.tipos.empleado;

public class empleadoprueba {

	public static void main(String[] args) {

		empleado a = new empleado();

		a.add(new Puesto("Administrativa", 999.99));
		a.add(new Puesto("Gerente", 250.00));
		a.add(new Puesto("Limpieza", 999.99));

		System.out.println(a);

	}// main
}// empleadoprueba
