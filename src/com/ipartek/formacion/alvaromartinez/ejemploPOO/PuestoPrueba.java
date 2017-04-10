package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Puesto;

public class PuestoPrueba {

	public static void main(String[] args) {

		Puesto prueba = new Puesto();
		prueba.toString();

		System.out.println(prueba);

		prueba.setDenominacion("SECRETARIA|O");
		System.out.println(prueba.getDenominacion());

		prueba.setSueldoBase(18200);
		;
		System.out.println(prueba);

		prueba = new Puesto("GERENTE", 30000);
		System.out.println(prueba);

	}

}
