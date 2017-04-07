package com.ipartek.formacion.javierlete.ejemplopoo.programa;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;

		// ipartek = new Empresa("Ipartek", new Persona(1, "Javier Lete"));

		Persona director = new Persona(1, "Javier Garc�a Lete");

		ipartek = new Empresa("Ipartek", director);

		System.out.println(ipartek);

		ipartek.getDirector().setNombre("Javier Lete Garc�a");

		System.out.println(ipartek);

		Persona directorNuevo = new Persona(2, "I�aki C�ceres");

		ipartek.setDirector(directorNuevo);

		System.out.println(ipartek.getDirector().getNombre().toUpperCase());

		ipartek.setPersonaJunta(director, 0);
		ipartek.setPersonaJunta(directorNuevo, 1);

		System.out.println(ipartek.getPersonaJunta(1).getNombre());

		System.out.println(ipartek);

		ipartek.addPersona(new Persona(3, "Desconocido"));
		ipartek.addPersona(new Persona(4, "An�nimo"));
		ipartek.addPersona(new Persona(5, "Pepe P�rez"));

		System.out.println(ipartek);
	}

}
