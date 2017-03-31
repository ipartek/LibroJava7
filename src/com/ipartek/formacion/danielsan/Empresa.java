package com.ipartek.formacion.danielsan;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {

	public static final String PRESIDENTE = "Botin";
	private String nombre;
	private boolean DirectorSiNo;
	private Persona[] Junta = new Persona[5];
	private Persona Director;
	private ArrayList<Persona> Personas = new ArrayList<Persona>();

	// constructores
	public Empresa(String nombre, Persona[] junta, Persona director, ArrayList<Persona> personas) {
		super();
		this.nombre = nombre;
		Junta = junta;
		Director = director;
		Personas = personas;
	}

	public Empresa(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		Director = director;
	}

	// Setters y Getters
	public Persona getDirector() {
		return Director;
	}

	public void setDirector(Persona director) {
		Director = director;
	}

	// To String
	@Override
	public String toString() {
		return "Empresa : nombre=" + nombre + ", DirectorSiNo=" + DirectorSiNo + ", \nJunta=" + Arrays.toString(Junta) + " \nDirector=" + Director + "Personas:" + Personas;
	}

	public void setPersonaJunta(Persona persona, int posicion) {
		Junta[posicion] = persona;
	}

	public Persona getPersona(int posicion) {
		return Junta[posicion];
	}
}
