package com.ipartek.formacion.anderuraga;

public class CocheTestTxapucero {

	public static void main(String[] args) {

		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("ferrari", 600);
		System.out.println(ferrari.toString());

		// cambiar potencia 900 y que no sea nuevo
		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari);
	}

}
