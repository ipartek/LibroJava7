package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {

		// PRIMERO
		Persona p1 = new Persona();

		p1.setId(5);
		p1.setNombre("Javier");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "Javier");

		// // TERCERO
		// p1.setFechaNacimiento(new Date("1970/10/10"));
		//
		// // CUARTO
		// System.out.println(p1.aTexto()); // ID: 1, NOMBRE: Javier
		//
		// // PRUEBAS PARA EL TEST
		// System.out.println(p1.getFechaNacimiento());
	}

}
