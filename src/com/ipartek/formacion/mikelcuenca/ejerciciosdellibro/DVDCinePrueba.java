package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

public class DVDCinePrueba {

	public static void main(String[] args) {
		DVDCine prueba = new DVDCine("Titulo", "Director", "Actores", "Genero", 115, "Resumen");
		System.out.println(prueba.muestraDVDCine());

		if (prueba.esThriller()) {
			System.out.println("Es un thriller");
		} else {
			System.out.println("No es un thriller");
		}

		if (prueba.tieneResumen()) {
			System.out.println("Tiene resumen");
		} else {
			System.out.println("No tiene resumen");
		}
	}

}
