package com.ipartek.formacion.alvaromartinez;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Ejemplo001 {

	public static void main(String[] args) {
		// tiposDeDatos();
		estructurasDeControl();
	}

	private static void fechas() {
		Date ahora = new Date(); // funcion fecha
		System.out.println(ahora);
	}

	private static void estructurasDeControl() {
		System.out.println("Estructuras de control");

		boolean condicion1 = true;
		boolean condicion2 = false;

		if (condicion1)
			System.out.println("HOLA"); // correcto para a 1ª linea de codigo
										// pero aconsejable con {}
		else if (condicion2)
			System.out.println("OTRO");

		int opcion = 1;

		switch (opcion) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		default:
			System.out.println("FIN");
		}

		int mes = 3;
		int dias;

		switch (mes) {
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;

		}

		System.out.println(dias);

		int c = 1;

		while (c <= 10) {
			System.out.println(c++);
			/**
			 * System.out.println(++c); System.out.println(c--);
			 * System.out.println(--c);
			 */

		}

		do {
			System.out.println(c--);
		} while (c <= 1); // !while es como si fuera un 'until'

		for (int n = 1; n <= 10; n++)
			System.out.println("FOR: " + n);

		int t, z;
		for (t = 1, z = 3; t * z <= 10 || z * 2 == 20; t--, z = t * 3)
			System.out.println("FOR: " + t + " , " + z);

		System.out.println("DESPUES FOR: " + t + " , " + z);

		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d, %d\n", up, down);

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0, dato; i < arr.length; i++) {
			dato = arr[i];
			System.out.println(dato);
		}

		for (int dato : arr)
			System.out.println(dato);

		char[][] tablero;
		tablero = new char[8][8];

		for (int x = 0; x < tablero.length; x++)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = '.';

		for (int x = 0; x < tablero.length; x += 5)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = 'P';

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();
		}

		char[] figuras = { 'T', 'C', 'A', 'R', 'D', 'A', 'C', 'T' };
		int primeraFila = 0;
		int ultimaFila = tablero.length - 1;
		int segundaFila = primeraFila + 1;
		int penultimaFila = ultimaFila - 1;

		tablero[primeraFila] = figuras.clone();
		tablero[ultimaFila] = figuras.clone();

		tablero[primeraFila] = figuras;
		tablero[ultimaFila] = figuras;

	}

	private static void tiposDeDatos() {
		int i;
		int a, b;
		int z = 0;
		int g = 1, c = 2;

		i = 3;

		a = b = c;

		float f = 5.3f;

		double d = 5.3;

		char car = '$';
		System.out.println(car);

		System.out.println(i + g + c + z + a + b + "");
		System.out.println("" + i + g + c + z + a + b);

		System.out.println("Prueba");

		int resto = 5 % 2;
		System.out.println("El Resto es " + resto);

		int x = 3;
		System.out.println(1 <= x && x <= 10);// Más rapido
		System.out.println(1 <= x & x <= 10); // Más lento

		x = -50;
		System.out.println(!(1 >= x || x >= 10));// Más rapido
		System.out.println(!(1 >= x | x >= 10));// Más lento

		boolean estaDentroDelRango = !(1 >= x || x >= 10);// Más rapido
		System.out.println(estaDentroDelRango ? "Si" : "NO");

		System.out.println(5 & 3);

		int num1 = 3, num2 = 2;
		int max = num1 > num2 ? num1 : num2;
		// Se imprime peor
		System.out.println("El máximo1 de " + num1 + " y " + num2 + " es " + max);
		// Se imprime mejor
		System.out.println(String.format("El máximo2 de %d y %d es %d", num1, num2, max));

	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void colecciones() {

		@SuppressWarnings("rawtypes")
		Vector v = new Vector();

		v.add("HOLA");
		v.add(7);
		v.add(5.3);

		v.remove(1);

		v.insertElementAt("Otro", 2);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));

			double d = (double) v.get(1);
			System.out.println(d);

			Object[] obj = v.toArray();
			System.out.println(obj[1]);

		}
	}

	private static void colecciomesJava5() {

		ArrayList<String> al = new ArrayList<String>();

		al.add("UNO");
		al.add("DOS");
		al.add("TRES");

		for (String dato : al) {
			System.out.println(dato);
		}

		String s = al.get(1);

	}
}