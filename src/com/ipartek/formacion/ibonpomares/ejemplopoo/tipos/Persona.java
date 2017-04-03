package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.Date;

public class Persona {

	public Persona(){
		
	}
	
	private int id;
	private String nombre;
	private Date fecha;
	//CREAMOS UN CONSTRUCTOR
	
	
	public Persona(int x, String y){
		this.id = x;
		this.nombre = y;
		//setX(x);
		//setY(y);
	}
	//GETERS Y SETERS ID NOMBRE FECHA TEXTO
	public int getId() {
		return (int) id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getNombre() {
		return (String) nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Date getFechaNacimiento(){
				
		return fecha;	
	}
	
	public void setFechaNacimiento(Date fecha){
		
		this.fecha = fecha;
		//ya sabemos que es de tipo date
	
	}
//	Date d = new Date();
//	System.out.println(d);
	

	public String aTexto() {
		//System.out.println("ID: " + setId(id)+ ",NOMBRE: "+ setNombre(nombre));
		//System.out.println(setId(id),setNombre(nombre),setFechaNacimiento(fecha));
	
		
		//return "ID: " + id + ", Nombre: " + nombre + ", Fecha de nacimiento: "+ fecha ;
		return String.format("ID: %d, Nombre: %s, Fecha de nacimiento: %3$te-%3$tm-%3$tY"
				,getId(), getNombre(), getFechaNacimiento());
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	
	
}
