package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa1 {

	
	private String nombre;
	private Persona director;
	private Persona[] junta = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	

//	public Empresa1(String nombre, Persona director, Persona[] junta, ArrayList<Persona> personas) {
//		super();
//		this.nombre = nombre;
//		this.director = director;
//		this.junta = junta;
//		this.personas = personas;
//	}


	public Empresa1(String nombre, Persona director) {
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
		return "Empresa1 [nombre=" + nombre + ",\n director=" + director + ",\n junta=" + Arrays.toString(junta) + ",\n personas=" + personas + "]";
	}


	public void setPersonaJunta(Persona persona, int posicion){
		junta[posicion] = persona;
	}
	
	public Persona getPersonaJunta(int posicion){
		return junta[posicion];
	}
	
	public void addPersona(Persona persona){
		personas.add(persona);
	}
	
	
	
	
	
	
	
	
	
}
