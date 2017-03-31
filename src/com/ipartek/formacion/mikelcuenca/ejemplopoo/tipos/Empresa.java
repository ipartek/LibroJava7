package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

import java.util.Arrays;

public class Empresa {

	// TODO addPersona

	private int numeroMiembrosJunta = 5;
	private int numeroTrabajadores = 10;
	private Persona[] junta;
	private Persona[] trabajadores;
	private Persona director = new Persona();

	public Empresa() {
		super();
		junta = new Persona[numeroMiembrosJunta];
		trabajadores = new Persona[numeroTrabajadores];
		for (int i = 0; i < numeroTrabajadores; i++) {

			trabajadores[i] = new Persona(i);

			if (i < numeroMiembrosJunta) {
				junta[i] = trabajadores[i];
			}
		}

		this.director = trabajadores[0];

	}

	public Empresa(int numeroTrabajadores, int numeroMiembrosJunta) {
		this.numeroTrabajadores = numeroTrabajadores;
		this.numeroMiembrosJunta = numeroMiembrosJunta;
		junta = new Persona[numeroMiembrosJunta];
		trabajadores = new Persona[numeroTrabajadores];

	}

	public Empresa(int numeroTrabajadores, int numeroMiembrosJunta, Persona director) {
		this.numeroTrabajadores = numeroTrabajadores;
		this.numeroMiembrosJunta = numeroMiembrosJunta;
		this.director = director;
	}

	public int getNumeroMiembrosJunta() {
		return numeroMiembrosJunta;
	}

	public void setNumeroMiembrosJunta(int numeroMiembrosJunta) {
		this.numeroMiembrosJunta = numeroMiembrosJunta;
	}

	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public Persona[] getJunta() {
		return junta;
	}

	public void setJunta(Persona[] junta) {
		this.junta = junta;
	}

	public Persona[] getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Persona[] trabajadores) {
		this.trabajadores = trabajadores;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Empresa [numeroMiembrosJunta=" + numeroMiembrosJunta + ", numeroTrabajadores=" + numeroTrabajadores + ", junta=" + Arrays.toString(junta) + ", trabajadores="
				+ Arrays.toString(trabajadores) + ", director=" + director + "]";
	}

	public void nombrarJunta() {

		for (int i = 0; i < numeroMiembrosJunta; i++) {
			junta[i] = new Persona(i);
		}
	}

	public void setPersonaJunta(int i, Persona persona) {
		junta[i] = persona;
	}

	public Persona getPersonaJunta(int posicion) {
		return junta[posicion];
	}

}
