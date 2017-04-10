package com.ipartek.formacion.joseba.poo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Persona director;
	private Persona[] junta = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public Empresa(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	public void setDirector(Empleado director) {
		if (director.getPuesto() == Puesto.DIRECTOR)
			addPersona(director);
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta) + ", personas=" + personas + "]";
	}

	public void setPersonaJunta(Persona persona, int posicion) {
		junta[posicion] = persona;
	}

	public Persona getPersonaJunta(int posicion) {
		return junta[posicion];
	}

	public void addPersona(Persona persona) {
		personas.add(persona);

		Empleado e;

		if (persona instanceof Empleado) {
			e = (Empleado) persona;
			e.setEmpresa(this);

			switch (e.getPuesto()) {
			case DIRECTOR:
				if (this.director == null)
					this.director = e;
				else
					throw new RuntimeException("No se admite otro director");
				// break;
			case JUNTA:
				boolean sentado = false;
				for (int i = 0; i < junta.length; i++)
					if (junta[i] == null) {
						junta[i] = e;
						sentado = true;
						break;
					}

				if (!sentado)
					throw new RuntimeException("No he podido sentar al juntero");

				break;
			default:
				break;
			}
		}

	}

	// NUEVOS MÉTODOS PARA EMPLEADOS
	public BigDecimal getTotalSueldoBruto() {
		BigDecimal total = new BigDecimal(0.0);

		Empleado e;

		for (Persona p : personas) {
			if (p instanceof Empleado) {
				e = (Empleado) p;
				total = total.add(e.getSueldoBruto());
				// total.add(((Empleado)p).getSueldoBruto());
			}
		}

		return total;
	}
}
