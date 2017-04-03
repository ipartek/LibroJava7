package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Trabajador extends Persona {
	
	private int id;
	private static int siguienteId = 1;
		
	public Trabajador() {
		
		this.id = id + siguienteId;
		siguienteId++;
		
	}

	public Trabajador(String nombre) {
		super(nombre);
		this.id = id + siguienteId;
		siguienteId++;
		
	}

	public Trabajador(String nombre, int edad) {
		super(nombre, edad);
		this.id = id + siguienteId;
		siguienteId++;
		
	}
	
	public int getId() {
		
		return id;
		
	}

}
