package com.ipartek.formacion.jonAntuñano;

public class Notas {

	public static void main(String[] args) {
		// Ejercicio: array con resumen de las notas de todas las unidades
		// formativas hacer la nota media, la nota mas alta y la mas alta
		// 06/09 UF1465 6.5
		// 21/09 UF1466 8.9
		// 29/09 UF1467 5.0
		// -------------------------
		// 08/06 UF2175 7.5
		// 29/06 UF2176 5.0
		// 20/07 UF2177 10.0
		// -------------------------
		// 11/04 UF2404 7.5
		// 05/05 UF2405 7.2
		// 26/05 UF2406 8.8
		// -------------------------
		// NMEDIA X.X
		// NALTA 10.0
		// NBAJA 5.0

		String[] fechaUnidadesFormativas = { "06/09", "21/09", "29/09",
				"06/09", "08/06", "29/06", "20/07", "11/04", "05/05", "26/05" };

		String[] unidadesFormativas = { "UF1465", "UF1466", "UF1467", "UF2175",
				"UF2176", "UF2177", "UF2404", "UF2405", "UF2406" };
		double[] notasUnidadesFormativas = { 6.5, 8.9, 5.0, 7.5, 5.0, 10.0,
				7.5, 7.2, 8.8 };

		double nMedia = 0, nAlta = 0, nBaja = 10;

		System.out.println("Resumen");

		System.out.println("-------------------------------------");

		for (int i = 0; i < notasUnidadesFormativas.length; i++) {
			System.out
					.println(fechaUnidadesFormativas[i] + "\t"
							+ unidadesFormativas[i] + "\t"
							+ notasUnidadesFormativas[i]);

			nMedia = nMedia + notasUnidadesFormativas[i];

			if (notasUnidadesFormativas[i] > nAlta)
				nAlta = notasUnidadesFormativas[i];

			if (notasUnidadesFormativas[i] < nBaja)
				nBaja = notasUnidadesFormativas[i];

		}

		nMedia = nMedia / notasUnidadesFormativas.length;

		System.out.println("-------------------------------------");
		System.out.println("La nota media es:" + nMedia);
		System.out.println("La nota mas alta es:" + nAlta);
		System.out.println("La nota mas baja es:" + nBaja);

	}

}
