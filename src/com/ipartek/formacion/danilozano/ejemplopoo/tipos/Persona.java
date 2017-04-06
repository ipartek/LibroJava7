package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Date;



public class Persona {
	@Override
	public String toString() {
		return ""+ empleados ;
	}

	private int id;
	private String nombre;
	private Date fechaNacimiento;

	public Persona(int id, String nombre) {
		setId(id);
		setNombre(nombre);
	}

	public Persona() {
		this(0, "Anónimo");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@SuppressWarnings("deprecation")
	//public String aTexto() {

		// return
		// String.format("ID: %d, NOMBRE: %s, FECHA_NACIMIENTO: %3$te-%3$tm-%3$tY",
		// getId(), getNombre(), getFechaNacimiento());
		
	//}

	private Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public void add(Empleado empleado) {
		empleados.add(empleado);
}
	public double getTotalSueldoBruto() {
		double totalSueldoBruto = 0.0;
		for (Empleado nuevo : empleados)
			totalSueldoBruto += nuevo.getSueldoBruto();
		return totalSueldoBruto;
	}	
}