package com.ipartek.formacion.danielsan;

public class PruebaEmpresa {

	public static void main(String[] args) {
		Empresa iberdrola;
		iberdrola = new Empresa("Iberdrola", new Persona(1, "Daniel Sanchez"));

		Persona director = new Persona(1, "Daniel Sanchez");
		iberdrola = new Empresa("Iberdrola", director);

		// System.out.println(iberdrola);

		iberdrola.getDirector().setNombre("Juanma Narizon");

		// System.out.println(iberdrola);

		// System.out.println(iberdrola.getDirector().getNombre().toUpperCase());

		iberdrola.setDirector(new Persona(2, "Iñaki Puto Amo"));

		// System.out.println(iberdrola.getDirector().getNombre().toUpperCase());

		// System.out.println(iberdrola);

		Persona directorNuevo = new Persona(2, "Daniel Sanchez");

		iberdrola.setPersonaJunta(director, 0);
		iberdrola.setPersonaJunta(directorNuevo, 1);
		iberdrola.setPersonaJunta(new Persona(3, "Iñaki Puto Amo"), 2);
		iberdrola.setPersonaJunta(new Persona(4, "Yo"), 3);
		iberdrola.setPersonaJunta(new Persona(5, "Tururu"), 4);

		System.out.println(iberdrola);
	}

}
