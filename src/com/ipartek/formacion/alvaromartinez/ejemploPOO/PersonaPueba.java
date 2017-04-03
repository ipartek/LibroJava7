package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import java.util.Date;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Persona;

public class PersonaPueba {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Primero
		Persona p1 = new Persona();

		p1.setId(1);
		p1.setNombre("Álvaro");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "Álvaro");

		// TERCERO
		p1.setFechaNacimiento(new Date("1983/10/27 00:47"));

		// CUARTO
		System.out.println(p1.toString());

	}

}
