package com.ipartek.formacion.josebaclemente;

public class Ejercicios {
	// TODO Sacar las notas con sus asignaturas y despues sacar la media,nota
	// mas baja y nota mas alta
	public static void main(String[] args) {

		// Variables con datos

		String[] modulo = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176",
				"UF2177", "UF2404", "UF2405", "UF2406" };

		String[] fechas = { "06/09/2017", "21/09/2017", "29/09/2017",
				"08/06/2017", "29/06/2017", "20/07/2017", "11/04/2017",
				"05/05/2017", "26/05/2017" };

		double[] notas = { 6.5, 8.9, 5.0, 7.5, 5.0, 10.0, 7.5, 7.2, 8.8 };

		System.out.println("Resumen");

		double suma = 0;

		// El for lo que hace en este caso es enseñar los datos de las variables

		for (int i = 0; i < modulo.length; i++) {

			System.out.println(fechas[i] + " " + modulo[i] + "  " + notas[i]);

			// En caso de que el resto de la division sea 0 mete un espacio
			if ((i + 1) % 3 == 0) {

				System.out.println("-------------");
			}

		}

		// En este for cogemos la variable de suma y le asignamos el valor de
		// notas
		// En este caso como son numeros se suman entre ellos,si fuera texto no
		// se sumaria

		for (int i = 0; i < notas.length; i++) {

			suma += notas[i];

		}

		// De esta manera como ya tenemos la suma de todo los valores solo falta
		// sacar la media
		// para ello dividimos con el valor de su longitud

		System.out.println("La media de todo el curso " + suma + " es "
				+ (suma / notas.length));

		double min, max;

		min = max = notas[0];

		for (int i = 0; i < notas.length; i++) {

			if (min > notas[i]) {

				min = notas[i];

			}

			if (max < notas[i]) {

				max = notas[i];

			}

		}
		System.out.println("La nota minima es " + min);
		System.out.println("La nota maxima es " + max);

		double[] media1 = { 6.5, 8.9, 5.0 };
		double[] media2 = { 7.5, 5.0, 10.0 };
		double[] media3 = { 7.5, 7.2, 8.8 };

		for (int i = 0; i < media1.length; i++) {

			suma += media1[i];

		}
		System.out.println("La media de el modulo1 " + suma + " es "
				+ (suma / media1.length));

		for (int i = 0; i < media2.length; i++) {

			suma += media2[i];

		}
		System.out.println("La media de el modulo2 " + suma + " es "
				+ (suma / media2.length));

		for (int i = 0; i < media3.length; i++) {

			suma += media3[i];

		}
		System.out.println("La media de el modulo3 " + suma + " es "
				+ (suma / media3.length));

	}
}
