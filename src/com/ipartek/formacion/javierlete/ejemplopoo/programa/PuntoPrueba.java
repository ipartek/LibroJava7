package com.ipartek.formacion.javierlete.ejemplopoo.programa;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {
		Punto pt1;
		pt1 = new Punto();

		pt1.setX(5);
		pt1.setY(7);

		System.out.println(String.format("pt1(%d,%d)", pt1.getX(), pt1.getY()));
		System.out.println(String.format("pt1(%1.2f,%1.2f)", pt1.getXDouble(), pt1.getYDouble()));
		System.out.println("pt1(" + pt1.getX() + "," + pt1.getY() + ")");

		Punto pt2 = new Punto();

		pt2.setX(43.234565);
		pt2.setY(-3.234234);

		System.out.println(String.format("pt2(%d,%d)", pt2.getX(), pt2.getY()));
		System.out.println(String.format("pt2(%1.2f,%1.2f)", pt2.getXDouble(), pt2.getYDouble()));

	}

}
