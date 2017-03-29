package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {
		Punto pt1;
		pt1 = new Punto(5, 7);

		pt1.setX(5);
		pt1.setY(7);

		System.out.println(String.format("Punto 1: (%d,%d)", pt1.getX(), pt1.getY()));

		// _____________________________________________________________________________________
		Punto pt2;
		pt2 = new Punto(84.689, -95.651009);

		pt2.setX(43.234565);
		pt2.setY(-3.234234);

		System.out.println(String.format("Punto 2: (%.6f,%.6f)", pt2.getXDouble(), pt2.getYDouble()));

		Punto pt3 = new Punto();

		System.out.println(String.format("Punto 3: (%.1f,%.1f)", pt3.getXDouble(), pt3.getYDouble()));

	}
}
