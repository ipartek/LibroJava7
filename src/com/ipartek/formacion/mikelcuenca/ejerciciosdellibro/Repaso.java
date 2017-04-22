package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repaso {

	public static void main(String[] args) {

		// solicita un n�mero entero mayor de 10 y menor de 30
		int numero = 1;
		String linea = "bu";
		try {
			do {
				numero = leerNumero("Introduce un n�mero");
			} while (numero <= 10 || numero >= 30);
		}

		catch (NumberFormatException nfe) {
			System.out.println("Error de formato de numero");
		}

		// informa de si el n�mero es divisible por 5
		if (numero % 5 == 0) {

			System.out.println(numero + " es divisible por 5");

		} else {
			System.out.println(numero + " no es divisible por 5");
		}

		// solicita el nombre al usuario

		linea = leerNombre("Introduce tu nombre");

		// informa del numero de letras del nombre

		System.out.println("Tu nombre tiene " + linea.length() + " letras.");

		// el caracter inicial y final

		System.out.println("El primer caracter de tu nombre es " + linea.charAt(0));
		System.out.println("El �ltimo caracter de tu nombre es " + linea.charAt(linea.length() - 1));

		// muestra el nombre en may�sculas

		System.out.println(linea.toUpperCase());

		// muestra el nombre en min�sculas

		System.out.println(linea.toLowerCase());

		// indica si tiene �

		if (linea.contains("�")) {
			System.out.println("Tu nombre contiene la letra �");
		} else {
			System.out.println("Tu nombre no contiene la letra �");
		}

	}

	public static int leerNumero(String mensaje) {
		int numero = 1;
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(flujo);
		String linea = "1";

		do {
			if (!linea.matches("\\d+") || linea.matches("0"))
				System.out.println("Debes introducir un n�mero entero");

			System.out.println(mensaje);

			try {
				linea = br.readLine();
			} catch (IOException e) {
				System.out.println("Error IO");
				e.printStackTrace();
			}

		} while (!linea.matches("\\d+") || linea.matches("0"));

		numero = Integer.parseInt(linea);

		return numero;
	}

	public static String leerNombre(String mensaje) {

		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(flujo);
		String linea = "bu";

		do {
			if (!linea.matches("\\S+"))
				System.out.println("Debes introducir un nombre");

			System.out.println(mensaje);

			try {
				linea = br.readLine();
			} catch (IOException e) {
				System.out.println("Error IO");
				e.printStackTrace();
			}

		} while (!linea.matches("\\S+"));

		return linea;
	}

}
