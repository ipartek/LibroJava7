package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
	private String nombre;
	private Persona director;
	private Persona[] junta = new Persona[5];// array de la junta de 5 personas
	private ArrayList<Persona> personas = new ArrayList<Persona>(); // array
																	// para las
																	// personas
																	// que
																	// puedan
																	// entrar

	// constructores
	public Empresa(String nombre, com.ipartek.formacion.danilozano.Persona director2) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	// getters y setters
	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	// otras funciones
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta) + ", personas=" + personas + "]";
	}

}
