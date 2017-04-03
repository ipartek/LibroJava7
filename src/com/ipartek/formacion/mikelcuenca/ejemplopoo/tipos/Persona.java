package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		this("Anónimo", 18);
	}

	public Persona(String nombre) {
		setEdad(18);
		setNombre(nombre);
	}

	public Persona(String nombre, int edad) {
		setEdad(edad);
		setNombre(nombre);
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return (String.format("%s", getNombre()));
	}

}
