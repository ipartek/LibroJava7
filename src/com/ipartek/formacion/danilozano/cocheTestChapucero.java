package com.ipartek.formacion.danilozano;

public class cocheTestChapucero {

	public static void main(String[] args) {
		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("Ferrari", 600);
		System.out.println(ferrari.toString());

		// cambiar potencia 900 y que no sea nuevo(con setter)

		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari.toString());

	}

}
