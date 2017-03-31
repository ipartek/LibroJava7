package com.ipartek.formacion.josurrutia;

public class CocheTestTxapucero {

	public static void main(String[] args) {

		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("ferrari", 600, 3, 100);
		System.out.println(ferrari.toString());

		// cambiar la potencia a 900 y que no sea nuevo
		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari);
	}

}
