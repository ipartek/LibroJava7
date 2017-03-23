package com.ipartek.formacion.mikelcuenca;

public class NotasCertificado {

	public static void main(String[] args) {

		String[] UF = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406" };

		Double[] Notas = { 6.5, 8.9, 5.0, 7.5, 5.0, 10.0, 7.5, 7.2, 8.8 };

		String[] Fechas = { "06/09", "21/09", "29/09", "08/06", "29/06", "20/07", "11/04", "05/05", "26/05" };

		System.out.println("Resumen:");
		System.out.println("--------");

		/*
		 * for (int i = 6; i < 9; i++) {
		 * 
		 * System.out.println(Fechas[i] + " - " + UF[i] + " - " + Notas[i]);
		 * 
		 * }
		 * 
		 * System.out.println("---------");
		 * 
		 * for (int i = 3; i < 6; i++) {
		 * 
		 * System.out.println(Fechas[i] + " - " + UF[i] + " - " + Notas[i]);
		 * 
		 * }
		 * 
		 * System.out.println("---------");
		 * 
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * System.out.println(Fechas[i] + " - " + UF[i] + " - " + Notas[i]);
		 * 
		 * }
		 */

		for (int i = 0; i < 9; i++) {

			System.out.println(Fechas[i] + " - " + UF[i] + " - " + Notas[i]);

			if ((i + 1) % 3 == 0) {

				System.out.println("-------------");

			}

		}

		double sumaArray = 0;
		// double subSuma1Array = 0;
		// double subSuma2Array = 0;
		// double subSuma3Array = 0;

		// for (int i = 0; i < 3; i++) {

		// subSuma1Array += Notas[i];

		// }

		// System.out.println("Media módulo 1: " + Math.round(subSuma1Array /
		// 3));

		// for (int i = 3; i < 6; i++) {

		// sumaArray += Notas[i];

		// }

		// System.out.println("MEDIA: " + Math.round(sumaArray / Notas.length));

		// for (int i = 0; i < Notas.length; i++) {

		// sumaArray += Notas[i];

		// }

		// System.out.println("MEDIA: " + Math.round(sumaArray / Notas.length));

		for (int i = 0; i < Notas.length; i++) {

			sumaArray += Notas[i];

		}

		System.out.println("MEDIA: " + Math.round(sumaArray / Notas.length));

		double min, max;
		min = max = Notas[0];

		for (int i = 0; i < 9; i++) {

			if (min > Notas[i]) {

				min = Notas[i];

			}

			if (max < Notas[i]) {

				max = Notas[i];
			}

		}

		System.out.println("NOTA MÍNIMA: " + min);
		System.out.println("NOTA MÁXIMA: " + max);

	}

}
