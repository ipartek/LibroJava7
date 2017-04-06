package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Punto {

	private double x, y;

	public Punto(double x, double y) { // constructor
		setXDouble(x);
		setYDouble(y);
	}

	public Punto(int x, int y) {
		this((double) x, (double) y);
	}

	public Punto() { // otra version del constructor

	}

	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = x; // this se refiere al elemento general
					// de toda la clase.
	}

	public int getY() {
		return (int) y;

	}

	public void setY(int y) {
		this.y = y;
	}

	public double getXDouble() {
		return x;
	}

	public double getYDouble() {
		return y;
	}

	public void setYDouble(double y) {
		this.y = (double) y;
	}

	public void setXDouble(double x) {
		this.x = (double) x;
	}

}
