package com.ipartek.formacion.danilozano;

public class notasExamenes {

	public static void main(String[] args) {
		String[] uf = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176",
				"UF2177", "UF2404", "UF2405", "UF2406" };
		float[] notas = { 6.5F, 8.9F, 5.0F, 7.5F, 5.0F, 10.0F, 7.5F, 7.2F, 8.8F };
		String[] fechas = { "06/09/17", "21/09/17", "29/09/17", "08/06/17",
				"29/06/17", "20/07/17", "11/04/17", "05/05/17", "26/05/17" };
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

			// if (notas[i] > sumanotas) {
			// sumanotas = notas[i];
			// }
		}

		System.out.println("el numero maximo es " + maxnota);
		System.out.println("el numero minimo es " + minnota);

	}
}
