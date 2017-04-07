package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
	private String nombre;
	private Persona director;
	private Persona[] junta = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public Empresa(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta) + ", personas=" + personas + "]";
	}

	public void setPersonaJunta(Persona persona, int posicion) {
		junta[posicion] = persona;
	}

	public Persona getPersonaJunta(int posicion) {
		return junta[posicion];
	}

	public void addPersona(Persona persona) {
		personas.add(persona);
	}
}
