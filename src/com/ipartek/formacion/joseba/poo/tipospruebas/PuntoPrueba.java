package com.ipartek.formacion.joseba.poo.tipospruebas;

import com.ipartek.formacion.joseba.poo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {

		Punto pt1;
		pt1 = new Punto(5, 7);

		pt1.setX(5);
		pt1.setY(7);

		// Sustiye las variables en los parentesis mediante el %d
		// %d es un int
		System.out.println(String.format("pt1(%d,%d)", pt1.getX(), pt1.getY()));
		// Le damos formato de double con %f
		System.out.println(String.format("pt1(%1.2f,%1.2f)", pt1.getXDouble(), pt1.getYDouble()));
		// %5 dejaria 5 huecos en total y si pones2 deja dos huecos detras del punto o
		// coma
		// ejemplo metes 100.2342 y te saldria 100.23
		System.out.println("pt1(" + pt1.getX() + "," + pt1.getY() + ")"); // Tambien se
																			// puede
		// escribir asi

		Punto pt2 = new Punto(332423, -443242);

		pt2.setX(332423);
		pt2.setY(-443242);

		System.out.println(String.format("pt2(%d,%d)", pt2.getX(), pt2.getY()));
		System.out.println(String.format("pt2(%f,%f)", pt2.getXDouble(), pt2.getYDouble()));
		System.out.println(String.format("pt2(%1.2f,%1.2f)", pt2.getXDouble(), pt2.getYDouble()));

		Punto pt3 = new Punto();
		System.out.println(String.format("pt3(%1.2f,%1.2f)", pt3.getXDouble(), pt3.getYDouble()));
	}
}
