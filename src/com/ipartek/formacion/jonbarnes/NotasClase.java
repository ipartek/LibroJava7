//NotasClase.java

package com.ipartek.formacion.jonbarnes;

public class NotasClase {

	public static void main(String[] args) {
		// Declaracion de variables.

		float media = 0;
		float notaAlta = 0;
		float notaBaja = 10;

		float[] arrayNotas = { (float) 6.5, (float) 8.9, (float) 5.0, (float) 7.5, (float) 5.0, (float) 10.0,
				(float) 7.5, (float) 7.2, (float) 8.8, };

		String[] arrayUF = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406" };

		String[] arrayExamenes = { "06/09/2017", "21/09/2017", "29/09/2017", "08/06/2017", "29/06/2017", "20/07/2017",
				"11/04/2017", "05/05/2017", "26/05/2017" };

		// Ponemos el titulo primero.

		System.out.println("Resumen");
		System.out.println("-------------------------------");

		// Rellenamos los modulos con las fechas y las notas. Aparte sacamos la
		// suma para la media ademas de buscar el maximo y el minimo.

		for (int i = 0; i < arrayNotas.length; i++) {

			// System.out.print(arrayExamenes[i] + "...");
			// System.out.print(arrayUF[i] + "..........");
			// System.out.println(arrayNotas[i]);

			System.out.println(arrayExamenes[i] + "..." + arrayUF[i] + ".........." + arrayNotas[i]);

			if ((i + 1) % 3 == 0 && i != 0) {
				System.out.println("-------------------------------");
			}
			media = media + arrayNotas[i];

			if (notaAlta < arrayNotas[i]) {
				notaAlta = arrayNotas[i];
			}

			if (notaBaja > arrayNotas[i]) {
				notaBaja = arrayNotas[i];
			}
		}

		// Dividimos la suma de la media por el tamaño del array.

		media = media / arrayNotas.length;

		// Sacamos por pantalla, la nota media, la nota mas alta y la nota mas
		// baja,

		// Para limitar los decimales=> String.format("%.2f",media).

		System.out.println("La notas media es: ........ " + String.format("%.2f", media));
		System.out.println("La nota mas alta es: ........ " + notaAlta);
		System.out.println("La nota mas baja es: ........ " + notaBaja);

	}
}
