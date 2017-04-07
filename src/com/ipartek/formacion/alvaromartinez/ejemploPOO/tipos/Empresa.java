package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {

	// atributos
	private String nombreEmpresa;
	private String direccion;
	private String poblacion;
	private Persona director;
	private Persona[] junta = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	// constructores
	// nombre
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombre) {
		this.nombreEmpresa = nombre;
	}

	// direccion
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// poblacion
	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	// director
	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	// junta
	public Persona[] getJunta() {
		return junta;
	}

	public void setJunta(Persona junta[]) {
		this.junta = junta;
	}

	// personas
	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	// otras funcionalidades
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombreEmpresa + ", direccion=" + direccion + ", poblacion=" + poblacion
				+ ", director=" + director + ", junta=" + Arrays.toString(junta) + "]";
	}

	public Empresa(String nombreEmpresa, Persona director) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.director = director;

	}

	public Empresa() {
		super();
		this.nombreEmpresa = "SIN NOMBRE";
		this.director = new Persona();
	}

	public double getTotalSueldoBruto() {
		double totalSueldoBruto = 0.0;

		// creo una variable Persona para recorrer el aray personas
		for (Persona persona : personas) {
			if (persona instanceof Empleado) {
				// creo un Empleado donde guardo la persona empleada
				Empleado empleadoPersona = (Empleado) persona;
				totalSueldoBruto = totalSueldoBruto + empleadoPersona.getSueldoBruto();
			}
		}
		return totalSueldoBruto;
		// gfggyh
	}
}
