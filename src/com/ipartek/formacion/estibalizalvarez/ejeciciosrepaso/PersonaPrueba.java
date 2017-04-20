package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Date;

public class PersonaPrueba {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// PRIMERO
		Persona p1 = new Persona();

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		p1.setId(5);
		p1.setNombre("Javier");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "Javier Lete");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// TERCERO
		p1.setFechaNacimiento(new Date("1970/10/20"));

		// CUARTO
		System.out.println(p1.aTexto()); // ID: 1, NOMBRE: Javier, Tue Oct 20 00:00:00 CET 1970

		System.out.println("SE ACABO");
	}
}
