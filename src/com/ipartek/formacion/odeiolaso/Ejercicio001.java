package com.ipartek.formacion.odeiolaso;

public class Ejercicio001 {

	public static void main(String[] args) {

		int[] notas = { 65, 89, 50, 75, 50, 100, 75, 72, 88 };

		String[] uf = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176",
				"UF2177", "UF2405", "UF2406", "UF2407" };

		String[] fecha = { "06/09/2017", "21/09/2017", "29/09/2017",
				"08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017",
				"05/05/2017", "20/05/2017" };

		int med = 0, max = notas[0], min = notas[0];

		System.out.println("Resumen");

		for (int i = 0; i <= notas.length; i++) {
			if (i % 3 == 0) {
				for (int l = 0; l < 27; l++) {
					System.out.print("-");
				}
				System.out.print("\n");
				if (i == notas.length)
					break;
			}

			System.out.println(fecha[i] + "   " + uf[i] + "   "
					+ (notas[i] / 10f));

			med += notas[i];
			max = notas[i] > max ? notas[i] : max;
			min = notas[i] < min ? notas[i] : min;

		}

		System.out.println("\tMEDIA:\t" + ((med / notas.length) / 10f));
		System.out.println("NOTA MAS ALTA\t" + (max / 10f));
		System.out.println("NOTA MAS BAJA\t" + (min / 10f));

	}

}
