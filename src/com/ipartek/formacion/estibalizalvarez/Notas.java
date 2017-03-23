package com.ipartek.formacion.estibalizalvarez;

public class Notas {

	public static void main(String[] args) {

		String[] arrayUf = { "Uf1465", "Uf1466", "Uf1467", "Uf1468", "Uf2175", "Uf2176", "Uf2177", "Uf2404", "Uf2405", "Uf2406", };

		float[] arrayNotas = { 6.5f, 8.9f, 5.0f, 7.5f, 5.0f, 10.0f, 7.5f, 7.2f, 8.8f, };
		String[] arrayfechas = { "06/06/2017", "21/09/2017", "29/09/2017", "08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017", "05/05/2017", "26/05/2017", };

		System.out.println("RESUMEN");//

		for (int i = 0; i < arrayNotas.length; i++) {//

			String uf = arrayUf[i];// para que salga la columna de las UF.
			float notas = arrayNotas[i];// para que aparezcan las notas.
			String fechas = arrayfechas[i];// para que aparezcan las fechas.
			if (i % 3 == 0) {// Para que cada 3 valores te ponga las rayas.
				System.out.println("------------------");// para que pararezcan
															// las rayas.
			}
			System.out.println(fechas + " " + uf + " " + notas);

			System.out.println("Media:");
			System.out.println("Nota mas alta:");
			System.out.println("Nota mas baja:");
		}

	}
}
