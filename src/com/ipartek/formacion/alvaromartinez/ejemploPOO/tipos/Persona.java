package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

import java.util.Date;

public class Persona {
	private int Id = 0;
	private String Nombre = "";
	@SuppressWarnings("deprecation")
	private Date FechaNacimiento = new Date("1900/01/01");

	public Persona(int Id, String Nombre, Date FechaNacimiento) {
		this.Id = Id;
		this.Nombre = Nombre;
		this.FechaNacimiento = FechaNacimiento;
	}

	@SuppressWarnings("deprecation")
	public Persona() {
		this.Id = 0;
		this.Nombre = "NADIE";
		this.FechaNacimiento = new Date("0000/00/00");
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

	public String getNombre() {
		return Nombre;
	}

	@SuppressWarnings("unused")
	private Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [Id=" + Id + ", Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + "]";
	}

}
