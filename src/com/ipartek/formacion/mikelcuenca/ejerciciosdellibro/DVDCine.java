package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

public class DVDCine {

	String titulo;
	String director;
	String actores;
	String genero;
	int duracion;
	String resumen;

	public DVDCine(String titulo, String director, String actores, String genero, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.genero = genero;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	public boolean esThriller() {
		if (genero.equalsIgnoreCase("Thriller"))
			return true;
		else
			return false;
	}

	public boolean tieneResumen() {
		if (resumen != null)
			return true;
		else
			return false;
	}

	public String muestraDuracion() {
		return duracion + "min.";
	}

	public String muestraDVDCine() {
		return (String.format("%s\nDe: %s\nCon: %s\n%s - %s\nResumen: %s", titulo, director, actores, genero, muestraDuracion(), resumen));
	}
}
