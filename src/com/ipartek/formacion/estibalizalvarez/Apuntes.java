package com.ipartek.formacion.estibalizalvarez;

import java.io.BufferedReader;//importa de java.io el burreredReader.
import java.io.IOException;//
import java.io.InputStreamReader;//

public class Apuntes {

	public static void main(String[] args) throws IOException {
		int a = leerNumero("A: ");// crea el numero entero a
		int b = leerNumero("B: ");

		System.out.println("la sumade A y B es " + (a + b));

	}

	private static int leerNumero(String mensaje) throws IOException {//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";// una variable llamada linea. Valor 0.

		do {// repite si se cumple la condicion"while".
			if (!linea.matches("\\d+"))// te comprueba si es disinto de un numero porque tiene una ! delante.
				// "\\d+": digitos uno o mas. matches valida entre el patron y lo que quieres validar.
				System.out.println("DEBES PONER UN NUMERO");
			System.out.println(mensaje);// te saca el mensaje A: o B:
			linea = br.readLine();// donde se queda el cursor para tu teclear.
		} while (!linea.matches("\\d+"));// "+" añade mas de un numero.

		int numero = Integer.parseInt(linea);//
		return numero;// te devuelve un numero.
	}
}
