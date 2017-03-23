package com.ipartek.formacion.inakijimenez;

public class Notas {
	// TODO almacenar nota de los 9 examenes de los modulos
	/*
	 * TODO Resumen UF1465 6,5 UF1466 8,9 UF1467 5,0
	 * -------------------------------------------- UF2175 7,5 UF2176 5 UF2177
	 * 10 -------------------------------------------- UF2404 7,5 UF2405 7,2
	 * UF2406 8,8 --------------------------------------------
	 * 
	 * MEDIA x,x por bloques y total Nota mas alta y mas baja
	 */
	public static void main(String[] args) {

		String arrayUF[] = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176",
				"UF2177", "UF2404", "UF2405", "UF2406" };
		float arrayNotas[] = { 6.5f, 8.9f, 5.0f, 7.5f, 5.0f, 10.0f, 7.5f, 7.2f,
				8.8f };
		String arrayFechas[] = { "06/09/2017", "21/09/2017", "29/09/2017",
				"08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017",
				"05/05/2017", "26/05/2017" };

		System.out.println("Resumen");

		float mediaBloque1 = 0, mediaBloque2 = 0, mediaBloque3 = 0;
		float notaAlta = 0, notaBaja = 15;

		for (int i = 0; i < arrayNotas.length; i++) {

			if (i % 3 == 0)
				System.out
						.println("------------------------------------------------------------------");

			switch (i) {
			case 0:
			case 1:
			case 2:
				mediaBloque1 = mediaBloque1 + arrayNotas[i];
				break;

			case 3:
			case 4:
			case 5:
				mediaBloque2 = mediaBloque2 + arrayNotas[i];
				break;

			default:
				mediaBloque3 = mediaBloque3 + arrayNotas[i];

			}

			if (notaAlta < arrayNotas[i])
				notaAlta = arrayNotas[i];

			if (notaBaja > arrayNotas[i])
				notaBaja = arrayNotas[i];

			System.out.println("\t" + arrayFechas[i] + "\t" + arrayUF[i] + "\t"
					+ arrayNotas[i]);

		}

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("La nota media del modulo 1 es: "
				+ (mediaBloque1 / 3));
		System.out.println("La nota media del modulo 2 es: "
				+ (mediaBloque2 / 3));
		System.out.println("La nota media del modulo 3 es: "
				+ (mediaBloque3 / 3));
		System.out.println("La nota media total es: "
				+ ((mediaBloque1 + mediaBloque2 + mediaBloque3) / 9));
		System.out.println("La nota mas baja obtenida en el curso ha sido: "
				+ notaBaja);
		System.out.println("La nota mas alta obtenida en el curso ha sido: "
				+ notaAlta);
	}
}
