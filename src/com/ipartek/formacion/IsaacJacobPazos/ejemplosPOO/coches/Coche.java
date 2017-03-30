package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches;

public class Coche {
	// Estructura de una clase basica

	// Atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad;// por defecto 0
	private int precio;// por defecto 100 euros

	// En el metodo getPrecio cuando me devuelve el precio ese precio en funcion
	// del año puede variar en funcion de lo siguiente:

	// Si antiguedad=0, precio*5
	// Si antiguedad=1, precio*3
	// Si antiguedad>=2, precio*1

	// constructores
	public Coche() {
		this("nisu", 50, true, 0, 100);
	}

	public Coche(String marca, int potencia) {
		this(marca, potencia, true, 0, 100);
	}

	public Coche(String marca, int potencia, boolean nuevo, int antiguedad,
			int precio) {
		super();
		setMarca(marca);
		setPotencia(potencia);
		setNuevo(nuevo);
		setAntiguedad(antiguedad);
		setPrecio(precio);
	}

	// getter y setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getPrecio() {
		if (getAntiguedad() <= 0) {
			return precio * 5;
		} else if (getAntiguedad() == 1) {
			return precio * 3;
		} else {
			return precio;
		}
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// funciones
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo="
				+ nuevo + "]";
	}

}
