package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Persona;

public class PersonaPueba {

	public static void main(String[] args) {
		// Primero
		Persona p1 = new Persona();

		p1.setId(1);
		p1.setNombre("�lvaro");

		System.out.println(String.format("ID: %d, NOMBRE: %d", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "�lvaro");

		// TERCERO
		p1.setFechaNacimiento(new Date("1983/10/27"));

		// CUARTO
		// System.out.println(p1.aTexto());

	}

}