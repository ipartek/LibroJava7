package com.ipartek.formacion.josurrutia.ejemplopoo.programa;

import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {

		Empresa ipartek;

		// ipartek = new Empresa("Ipartek", new Persona("Josu Urrutia"));

		Persona director = new Persona("Josu Urrutia");
		ipartek = new Empresa("Ipartek", director);

		System.out.println(ipartek);

		// cambiar el nombre del director
		ipartek.getDirector().setNombre("Josu Urrutia Larizgoitia");
		System.out.println(ipartek);

		// nuevo director
		Persona directorNuevo = new Persona(2, "Javier Lete");
		ipartek.setDirector(directorNuevo);

		// ipartek.setDirector(new Persona(2, "Javier Lete"));

		System.out.println(ipartek.getDirector().getNombre().toUpperCase());

		// añadir personas en la junta
		ipartek.setPersonaJunta(director, 0);
		ipartek.setPersonaJunta(directorNuevo, 1);

		System.out.println(ipartek.getPersonaJunta(1).getNombre());

		System.out.println(ipartek);

		ipartek.addPersona(new Persona(3, "Desconocido"));
		ipartek.addPersona(new Persona(4, "Anonimo"));
		ipartek.addPersona(new Persona(5, "Pepe Perez"));

		System.out.println(ipartek);
	}

}
