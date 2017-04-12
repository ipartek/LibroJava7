package com.ipartek.formacion.danielsan.LaboratorioUnidades;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int numero1, numero2;
		String operador;

		numero1 = getComprobarDato(1);
		operador = getComprobarDato("x");
		numero2 = getComprobarDato(2);

	}

	public static int getComprobarDato(int x) {
		final String REG_SEGMEN = "\\d+";
		String controlarEntero;
		@SuppressWarnings("resource")
		Scanner segmentoIntroducido = new Scanner(System.in);
		do {
			System.out.println("Introduce el " + x + " numero.");
			controlarEntero = segmentoIntroducido.nextLine();
			if (!controlarEntero.matches(REG_SEGMEN)) {
				System.out.print(controlarEntero + " es incorrecto. ");
			}
		} while (!controlarEntero.matches(REG_SEGMEN));
		return Integer.parseInt(controlarEntero);
	}

	public static String getComprobarDato(String x) {
		String controlarEntero;
		@SuppressWarnings("resource")
		Scanner segmentoIntroducido = new Scanner(System.in);
		do {
			System.out.println("Introduce el operador.");
			controlarEntero = segmentoIntroducido.nextLine();
			if (!controlarEntero.matches("\\s{1,1}")) {
				System.out.print(controlarEntero + " es incorrecto. ");
			}
		} while (!controlarEntero.matches("\\s{1,1}"));
		return controlarEntero;
	}
}
