package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

import java.util.Date;

public class Persona {
	private int Id = 0;
	private String Nombre = "";
	Date FechaNacimiento = new Date("1900/01/01");

	public Persona(int Id, String Nombre) {
		this.Id = Id;
		this.Nombre = Nombre;
	}

	public Persona() {

	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public void setFechaNacimiento(Date FechaNacimiento) {
		this.FechaNacimiento = FechaNacimiento;
	}

	public int getId() {
		return Id;
	}

	private String getNombre() {
		return Nombre;
	}

	private Date getFechaNacimiento() {
		return FechaNacimiento;
	}
}
