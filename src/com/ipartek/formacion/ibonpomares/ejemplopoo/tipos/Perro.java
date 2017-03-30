package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

public class Perro {



private String nombre; 
private String raza;;
private boolean dueno;
private boolean pulgas;





public Perro() {
	super();
	this.nombre = "Thor";
	this.raza = "milrazas";
	this.dueno = false;
	this.pulgas = false;
}

public Perro(String nombre, String raza, Boolean dueno, Boolean pulgas) {
	super();
	this.nombre = nombre;
	this.raza = raza;
	this.dueno = dueno;
	this.pulgas = pulgas;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public boolean isDueno() {
	return dueno;
}

public void setDueno(boolean dueno) {
	this.dueno = dueno;
}

public boolean isPulgas() {
	return pulgas;
}

public void setPulgas(boolean pulgas) {
	this.pulgas = pulgas;
}

@Override
public String toString() {
	return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueno=" + dueno + ", pulgas=" + pulgas + "]";
}







}