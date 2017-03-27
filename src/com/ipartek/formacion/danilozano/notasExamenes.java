package com.ipartek.formacion.danilozano;

public class notasExamenes {

	public static void main(String[] args) {
		String[] uf = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406" };
		float media1 = 0, media2 = 0, media3 = 0;
		float[] notas = { 6.5F, 8.9F, 5.0F, 7.5F, 5.0F, 10.0F, 7.5F, 7.2F, 8.8F };
		String[] fechas = { "06/09/17", "21/09/17", "29/09/17", "08/06/17", "29/06/17", "20/07/17", "11/04/17", "05/05/17", "26/05/17" };
		float suma = 0;
		float maxnota = 0;
		float minnota = 10;
		for (int i = 0; i < uf.length; i++) {
			System.out.printf(fechas[i] + "\t");
			System.out.printf(uf[i] + "\t");
			System.out.println(notas[i]);

			if (notas[i] > maxnota) {
				maxnota = notas[i];
			}
			if (notas[i] < minnota) {
				minnota = notas[i];

			}
			switch (i) {
			case 0:
			case 1:
			case 2:
				media1 = media1 + notas[i];
				break;

			case 3:
			case 4:
			case 5:
				media2 = media2 + notas[i];
				break;
			default:
				media3 = media3 + notas[i];
				break;
			}
			suma += notas[i];

		}
		System.out.println("------------------------------------");
		System.out.println("el numero maximo es " + maxnota);
		System.out.println("el numero minimo es " + minnota);
		System.out.println("La media de " + suma + " es " + (suma / notas.length));
		System.out.println("la nota media del modulo 1 es " + media1 / 3);
		System.out.println("la nota media del modulo 2 es " + media2 / 3);
		System.out.println("la nota media del modulo 3 es " + media3 / 3);

	}
}
