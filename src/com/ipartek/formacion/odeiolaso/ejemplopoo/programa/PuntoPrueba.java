package com.ipartek.formacion.odeiolaso.ejemplopoo.programa;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {
		Punto pt1;
		pt1 = new Punto();

		pt1.setX(5);
		pt1.setY(70000);

		// // Comprueva que es un enteros
		// System.out.println(String.format("Pt1(%d,%d)", pt1.x, pt1.y));
		// // Comprueva que es un String
		// System.out.println(String.format("Pt1(%s,%s)", pt1.x, pt1.y));

		System.out.println(String.format("pt1(%d,%d)", pt1.getX(), pt1.getY()));
		System.out.println(String.format("pt1(%.2f,%.2f)", pt1.getXDouble(), pt1.getYDouble()));

		Punto pt2 = new Punto(43.2345, -2.24653);

		// pt2.setX(43.333256);
		// pt2.setY(-3.333256);

		System.out.println(String.format("pt2(%d,%d)", pt2.getX(), pt2.getY()));
		System.out.println(String.format("pt2(%.2f,%.2f)", pt2.getXDouble(), pt2.getYDouble()));

		Punto pt3 = new Punto();
		System.out.println(String.format("pt3(%f,%f)", pt3.getXDouble(), pt3.getYDouble()));
	}

}
