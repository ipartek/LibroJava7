package com.ipartek.formacion.danielsan.LaboratorioUnidades;

import java.util.Scanner;

public class TresSegmentosTriangulos {

	public static void main(String[] args) {
		int segmento1, segmento2, segmento3;

		segmento1 = consola(1);
		segmento2 = consola(2);
		segmento3 = consola(3);

		if ((segmento1 + segmento2 <= segmento3) || (segmento1 + segmento3 <= segmento2) || (segmento3 + segmento2 <= segmento1)) {
			System.out.println("Los segmentos, jamas podran formar un triangulo.");
		} else {
			System.out.println("Los segmentos, pueden formar un triangulo.");
		}
	}

	public static int consola(int x) {
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
}
