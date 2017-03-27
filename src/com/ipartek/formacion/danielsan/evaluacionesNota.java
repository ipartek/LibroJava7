package com.ipartek.formacion.danielsan;

public class evaluacionesNota {

	public static void main(String[] args) {

		/*
		 * Pedir por consola las notas de los modulos ArrayUF [String]
		 * ArrayNotas [Float] Resumen ---------------------------- UF1465 6,5
		 * UF1466 8,9 Media UF1467 5 --------------------------- UF2175 7,5
		 * UF2176 5 Media UF2177 10 -------------------------- UF2404 7,5 UF2405
		 * 7,2 Media UF2406 8,8 -------------------------- Sacar media x,x Nota
		 * mas alta x Nota mas baja x
		 */

		String[] arrayUF = new String[9];

		arrayUF[0] = "UF1465";
		arrayUF[1] = "UF1466";
		arrayUF[2] = "UF1467";
		arrayUF[3] = "UF2175";
		arrayUF[4] = "UF2176";
		arrayUF[5] = "UF2177";
		arrayUF[6] = "UF2404";
		arrayUF[7] = "UF2405";
		arrayUF[8] = "UF2406";

		String[] arrayFechas = new String[9];

		arrayFechas[0] = "06/09";
		arrayFechas[1] = "21/09";
		arrayFechas[2] = "29/09";
		arrayFechas[3] = "08/06";
		arrayFechas[4] = "29/06";
		arrayFechas[5] = "20/07";
		arrayFechas[6] = "11/04";
		arrayFechas[7] = "05/05";
		arrayFechas[8] = "26/05";

		Float[] arrayNotas = { 6.5F, 8.9F, 5F, 7.5F, 5F, 10F, 7.5F, 7.2F, 8.8F };

		int cont = 1;
		float sumanotas = 0;
		System.out.println("Resumen");
		System.out.println("-------------------------------");
		for (int i = 0; i < arrayUF.length; i++) {
			System.out.print(arrayFechas[i] + "\t");
			System.out.print(arrayUF[i] + "\t");
			System.out.println(arrayNotas[i]);
			sumanotas = sumanotas + arrayNotas[i];
			if (cont % 3 == 0) {
				System.out.printf("La media del trimestres es: %1.1f", sumanotas / 3);
				System.out.println();
				System.out.println("-------------------------------");
				sumanotas = 0;
			}
			cont++;
		}
		sumanotas = 0;
		float maxNota = 0;
		float minNota = 10;
		for (int i = 0; i < arrayNotas.length; i++) {
			if (maxNota < arrayNotas[i]) {
				maxNota = arrayNotas[i];
			}
			if (minNota > arrayNotas[i]) {
				minNota = arrayNotas[i];
			}
			sumanotas = sumanotas + arrayNotas[i];
		}
		System.out.printf("La media de las notas es: %1.1f", sumanotas / 9);
		System.out.println();
		System.out.println("La nota mas alta es: " + maxNota);
		System.out.println("La nota mas baja es: " + minNota);
	}
}
