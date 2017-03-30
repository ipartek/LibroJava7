package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Punto {

	private double x, y;

	public Punto(double x, double y) { // constructor
		setXdouble(x);
		setYdouble(y);
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

	public double getXdouble() {
		return x;
	}

	public double getYdouble() {
		return y;
	}

	public void setYdouble(double y) {
		this.y = (double) y;
	}

	public void setXdouble(double x) {
		this.x = (double) x;
	}

}
