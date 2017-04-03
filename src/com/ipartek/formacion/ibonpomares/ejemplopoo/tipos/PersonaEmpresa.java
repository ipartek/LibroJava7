package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

public class PersonaEmpresa {

	
public PersonaEmpresa(){
		
	}	



private String dni;
private String nombre;
private String puesto;


public PersonaEmpresa(String nombre, String puesto) {
	super();
	this.nombre = nombre;
	this.puesto = puesto;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}	

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPuesto() {
	return puesto;
}

public void setPuesto(String puesto) {
	this.puesto = puesto;
}

@Override
public String toString() {
	return "PersonaEmpresa [dni=" + dni + ", nombre=" + nombre + ", puesto=" + puesto + "]";
}


	
	
	
	
	
	
	
	
	
	
}
