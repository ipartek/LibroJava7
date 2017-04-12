package com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos;

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

	// super.toString() llama desde el hijo a los metodos del padre
	// super es la llamada al padre
	@Override
	public String toString() {
		return super.toString() + " [nombre=" + nombre + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
