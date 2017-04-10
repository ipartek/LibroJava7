package com.ipartek.formacion.joseba.poo.tipos;

public class Punto {

	private double x, y;

	public Punto(double x, double y) {

		setX(x);
		setY(y);
		System.out.println("Se ha creado");
	}

	public Punto(int x, int y) {

		this((double) x, (double) y);
	}

	public Punto() {

		this(0.0, 0.0);

	}

	public int getX() {
		return (int) x;
	}

	public void setX(double x) {
		this.x = (double) x;
	}

	public int getY() {
		return (int) y;
	}

	public void setY(double y) {
		this.y = (double) y;
	}

	public double getYDouble() {
		return y;
	}

	public double getXDouble() {
		return x;
	}

}
