package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Persona> junta = new ArrayList<Persona>();
	private Persona director = new Persona();
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public Empresa(String nombre) {
		
		this.nombre = nombre;
		
	}

	public Empresa(String nombre, Persona director) {
		
		this.nombre = nombre;
		this.director = director;
				
	}
	
	public String getNombre() {
		
		return nombre;
		
	}

	public ArrayList<Persona> getJunta() {
		
		return junta;
	
	}
	
	public ArrayList<Trabajador> getTrabajadores() {
		
		return trabajadores;
		
	}

	public Persona getDirector() {
		
		return director;
	
	}

	public void setDirector(Persona director) {
		
		this.director = director;
	
	}

	public void addPersonaJunta(Persona persona) {
		
		junta.add(persona);
	
	}

	public Persona getPersonaJunta(int posicion) {
		
		return junta.get(posicion);
	
	}
	
	public void addTrabajador(Trabajador t) {
		
		trabajadores.add(t);
		
	}
	
	public Trabajador getTrabajador(int posicion) {
		
		return trabajadores.get(posicion);
	
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", junta=" + junta + ", director="
				+ director + ", trabajadores=" + trabajadores + "]";
	}


	

	

}
