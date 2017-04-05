package com.ipartek.formacion.inakijimenez.programa;

import java.util.Date;

import com.ipartek.formacion.inakijimenez.tipos.Persona;

public class PersonaPrueba {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// PRIMERO
		Persona p1 = new Persona();

		p1.setId(5);
		p1.setNombre("Javier");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "Javier");

		// TERCERO
		p1.setFechaNacimiento(new Date("1970/10/10"));

		// CUARTO
		System.out.println(p1.aTexto()); // ID: 1, NOMBRE: Javier
	}
}
