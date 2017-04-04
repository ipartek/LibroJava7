package com.ipartek.formacion.inakijimenez.programa;

import com.ipartek.formacion.inakijimenez.tipos.Coche;

public class CocheTestChapucero {

	public static void main(String[] args) {

		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("Ferrari", 600);
		System.out.println(ferrari.toString());

		// cambiar potencia 900 y que no sea nuevo
		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari.toString());

	}

}
