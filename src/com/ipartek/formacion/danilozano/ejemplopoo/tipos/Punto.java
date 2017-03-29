package com.ipartek.formacion.danilozano.ejemplopoo.tipos;

public class Punto {
	private double x, y;

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
