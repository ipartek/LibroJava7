package com.ipartek.formacion.estibalizalvarez;

public class CocheTestChapuzero {
	public static void main(String[] args) {

		Coche c = new Coche();// crear/instancia un nuevo objeto llamado c de la clase Coche.
		System.out.println(c.toString());// te devuelve los valores que le has indicado en la clase Coche.

		Coche ferrari = new Coche("ferrari", 600);// crear/instancia un nuevo objeto llamado ferrari de la clase Coche.
		System.out.println(ferrari.toString());

		// cambiar potencia 900 y que no sea nuevo.
		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari);

		char[] nombre;

		// perro

		// Perro perro = new Perro("Brutus");// crear objeto perro de la clase Perro.
		// System.out.println(perro.toString());
		//
		// Perro = new Perro("Gordi");
		// System.out.println(.toString());

	}// main
}
