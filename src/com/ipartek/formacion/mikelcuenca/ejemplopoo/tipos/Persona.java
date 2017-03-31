package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Persona {

	private int id;
	private String nombre;
	private boolean junta;
	private boolean director;

	public Persona() {
		this(0, "Anónimo");
	}

	public Persona(int id) {
		setId(id);
		setNombre("Anónimo");
	}

	public Persona(int id, String nombre) {
		setId(id);
		setNombre(nombre);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isJunta() {
		return junta;
	}

	public void setJunta(boolean junta) {
		this.junta = junta;
	}

	public boolean isDirector() {
		return director;
	}

	public void setDirector(boolean director) {
		this.director = director;
	}

	public String toString() {
		return (String.format("ID: %d", getId()));
	}

}
