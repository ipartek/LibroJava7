package com.ipartek.formacion.odeiolaso.ejemplopoo.programa;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;
		// ipartek = new Empresa("Ipartek", new Persona("Javier Lete"));
		Persona director = new Persona(1, "Javier Lete");
		ipartek = new Empresa("Ipartek", director);

		System.out.println(ipartek);

		ipartek.getDirector().setNombre("Javier Lete Gartzia");

		System.out.println(ipartek);

		Persona directorNuevo = new Persona(3, "Iñaki Cáceres");

		ipartek.setDirector(directorNuevo);

		System.out.println(ipartek.getDirector().getNombre().toUpperCase() + " Director SUPREMO de " + ipartek.getNombre().toUpperCase());

		ipartek.setPersonaJunta(director, 0);
		ipartek.setPersonaJunta(directorNuevo, 1);

		for (int i = 0; i < 2; i++) {
			System.out.println(i + ". " + ipartek.getPersonaJunta(i).getNombre());
		}

		System.out.println(ipartek);

		ipartek.addPersona(new Persona(3, "Desconcocido"));
	}

}
