package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class PuntoNombre extends Punto {
	private String nombre;

	public PuntoNombre(int x, int y, String nombre) {
		super(x, y);
		this.nombre = nombre;
	}

	public PuntoNombre() {
		this(0, 0, "Anónimo");
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return super.toString() + " [nombre=" + nombre + "]";// esta llamando a toString() de punto(padre) y le añade elementos que faltan.
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
