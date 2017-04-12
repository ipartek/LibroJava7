package com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos;

// tiene constructores, metodos y metodos añadidos
public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		setX(x);
		setY(y);

		System.out.println("Se ha creado el objeto");
	}

	public Punto(int x, int y) {
		this((double) x, (double) y);
	}

	public Punto() {
		this(1.0, 1.0);
	}

	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = (double) x;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public int getY() {
		return (int) y;
	}

	public void setY(int y) {
		this.y = (double) y;
	}

	public double getXDouble() {
		return x;
	}

	public double getYDouble() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	// suma las coordenadas y devuelve el nuevo punto
	public static Punto sumar(Punto a, Punto b) {
		return new Punto(a.x + b.x, a.y + b.y);
	}

	public Punto sumar(Punto p) {
		return sumar(this, p);
	}
}
