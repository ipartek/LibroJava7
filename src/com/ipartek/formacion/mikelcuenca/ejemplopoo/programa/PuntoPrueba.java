package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) throws IOException {
		Punto pt1;
		pt1 = new Punto(leerNumero("Introduce la x: "), leerNumero("Introduce la y: "));
		Punto pt2 = new Punto();

		pt2.setXdouble(leerNumero("Introduce la x: ")); // pt1.x = 5;
		pt2.setYdouble(leerNumero("Introduce la y: ")); // pt1.y = 7;

		System.out.println(pt1.getX());
		System.out.println(pt2.getY());
		System.out.println(pt1.getX());
		System.out.println(String.format("pt1(%d,%d)", pt1.getX(), pt1.getY()));
		System.out.printf("pt2(%.2f,%.2f)", pt2.getXdouble(), pt2.getYdouble());

	}

	public static double leerNumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		do {

			if (!linea.matches("\\d*.\\d*"))
				System.out.println("DEBES INTRODUCIR UN NUMERO POSITIVO");

			System.out.println(mensaje);

			linea = br.readLine();

		} while (!linea.matches("\\d*.\\d*"));

		double num = Double.parseDouble(linea);

		return num;
	}

}
