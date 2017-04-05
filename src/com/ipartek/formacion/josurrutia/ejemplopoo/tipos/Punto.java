package com.ipartek.formacion.josurrutia.ejemplopoo.tipos;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		setX(x);
		setY(y);

		System.out.println("Se ha creado un objeto");
	}

	public Punto(int x, int y) {
		// setX(x);
		// setY(y);
		this((double) x, (double) y);

	}

	public Punto() {
		// setX(0.0);
		// setY(0.0);
		this(0.0, 0.0);
	}

	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = (double) x;
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
}
