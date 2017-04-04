package com.ipartek.formacion.ibonpomares;

public class Ejercicio1 {

	public static void main(String[] args) {

		notas();

	}

	// Resumen
	// UF1465-6.5
	// UF1466-8.9
	// UF1467-5.0
	// ------
	// UF2175-7.5
	// UF2176-5.0
	// UF2177-10.0
	// ------
	// UF2404-2.5
	// UF2405-7.2
	// UF2406-8.8
	// ------
	// Media
	// Nota alta
	// Nota baja

	public static void notas() {

		double media = 0.0;
		double alta = 0.0;
		double baja = 10.0;

		String[] fecha = { "06/09/2017", "21/09/2017", "29/09/2017", "08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017", "05/05/2017", "26/05/2017" };
		String[] UF = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406" };
		Float[] notas = { (float) 6.5, (float) 8.9, (float) 5.0, (float) 7.5, (float) 5.0, (float) 10.0, (float) 7.5, (float) 7.2, (float) 8.8 };

		System.out.println("Resumen");
		System.out.println("-----------------------");

		for (int i = 0; i < fecha.length; i++) {
			System.out.printf(fecha[i] + " - ");
			System.out.printf(UF[i] + " - ");
			System.out.println(notas[i]);
		}
		
		
		System.out.println("-------------------------");
		// Nota media
		for (int i = 0; i < notas.length; i++) {

			media = media + notas[i];
		}
		// Nota mas alta
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > alta) {
				alta = notas[i];
			}
		}
		// Nota mas baja
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < baja) {
				baja = notas[i];
			}
		}
		// mostramos las notas ponemos UN solo decimal
		System.out.println("Nota media: " + (String.format("%.1f", media / notas.length)));
		System.out.println("Nota mas alta: " + alta);
		System.out.println("Nota as baja: " + baja);

	}
}