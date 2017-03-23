package com.ipartek.formacion.leiremunarriz;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayFecha = { "06/09/2017", // primer array
				"21/09/2017", "29/09/2017", "08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017", "05/05/2017", "26/05/2017", };

		String[] arrayUF = { "UF1465", // primer array
				"UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406", };

		float[] arrayNOTAS = { 6.5f, // segundo array float
				8.9f, 5.0f, 7.5f, 5.0f, 10.0f, 7.5f, 7.2f, 8.8f, };

		System.out.println("Resumen ");

		float media = 0.0f;
		float alta = 0.0f;
		float baja = 10.0f;

		for (int i = 0; i < arrayNOTAS.length; i++) {

			String uf = arrayUF[i];
			float notas = arrayNOTAS[i];
			String fechas = arrayFecha[i];

			if (i % 3 == 0) { // para que saque la linea cada tres vueltas
								// esta,el resto vacio

				System.out.println("-------------------------------------");
			}

			System.out.println(fechas + "\t" + uf + "\t" + notas);
			media = notas + media;
			if (alta <= notas)
				alta = notas;
			if (baja >= notas)
				baja = notas;

		}
		System.out.println("-------------------------------------");
		System.out.println("La media es: " + media / 9);
		System.out.println("Nota mas alta: " + alta);
		System.out.println("Nota mas baja: " + baja);

	}// end main
}