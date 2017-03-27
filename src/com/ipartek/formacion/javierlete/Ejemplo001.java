package com.ipartek.formacion.javierlete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.Console;
import java.util.Scanner;

public class Ejemplo001 {

	public static void main(String[] args) throws IOException {
		// tiposDeDatos();
		// estructurasDeControl();
		// entradaConsola();
		// entradaClasica(); // Este es un comentario largo para poder probar si esto sigue hace un salto de línea
		// ejemploDiagrama();

		int a = leerNumero("A: ");
		int b = leerNumero("B: ");
		System.out.println("La suma de A y B es: " + (a + b));
	}

	private static int leerNumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = "0";

		do {
			if (!linea.matches("\\d+"))
				System.out.println("DEBES PONER UN NUMERO");

			System.out.print(mensaje);
			linea = br.readLine();
		} while (!linea.matches("\\d*"));

		int numero = Integer.parseInt(linea);

		return numero;
	}

	private static void ejemploDiagrama() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		do {
			if (!linea.matches("\\d*"))
				System.out.println("DEBES PONER UN NUMERO, PEAZO INUTIL");

			System.out.print("Dime el número: ");

			linea = br.readLine();

		} while (!linea.matches("\\d*"));

		int num = Integer.parseInt(linea);

		System.out.println(num * 2);
	}

	private static void entradaClasica() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine();

		if (linea.matches("\\d*"))
			System.out.println("NUMERO x 2: " + (Integer.parseInt(linea) * 2));
		else
			System.out.println("NO ES UN NUMERO");
	}

	private static void entradaConsola() {
		// Console c = System.console();
		// System.out.println(c.readLine());

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número: ");

		String dato = s.next();

		if (dato.matches("\\d*"))
			System.out.println("NUMERO x 2: " + (Integer.parseInt(dato) * 2));
		else
			System.out.println("TEXTO: " + dato);

		System.out.print("Introduce un nombre: ");
		System.out.println(s.next());

		s.close();
	}

	private static void estructurasDeControl() {
		System.out.println("Estructuras de control");

		boolean condicion = false;
		boolean condicion2 = true;

		if (condicion)
			System.out.println("Condicion1");
		else if (condicion2)
			System.out.println("Condicion2");
		else
			System.out.println("ELSE");

		int opcion = 2;

		switch (opcion) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		default:
			System.out.println("OTRO");
		}

		int mes = 6;
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
			System.out.println("Dentro" + c++);
		}

		do {
			System.out.println(c--);
		} while (c >= 1);

		/*
		 * int n = 1; while(n <= 10){ System.out.println(n); n++; }
		 */

		for (int n = 1; n <= 10; n++)
			System.out.println("FOR: " + n);

		int t, z;
		for (t = 1, z = 3; t * z <= 10 || z * 2 == 20; t--, z = t * 3)
			System.out.println("FOR " + t + ", " + z);

		System.out.println("DESPUES FOR " + t + ", " + z);

		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d, %d\n", up, down);

		System.out.println("C:\nuevos\trabajos");

		System.out.println("C:\\nuevos\\trabajos");

		int[] arr = { 1, 2, 3, 4, 5 };
		// int[] lluvias = new int[12];

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

		// tablero.length se le quita 3 porque uno sería el necesario
		// para saltar de la posición primera a la última, pero
		// tenemos que compensar una fila por el salto inicial a la
		// segunda y otra fila, porque lo ponemos en la anteúltima
		// for(int x = 1; x < tablero.length ; x += tablero.length-3)
		// for(int y = 0; y < tablero[x].length; y++)
		// tablero[x][y] = 'p';

		int primeraFila = 0;
		int ultimaFila = tablero.length - 1;
		int segundaFila = primeraFila + 1;
		int anteultimaFila = ultimaFila - 1;

		for (int x = 0; x < tablero.length; x++)
			if (x == segundaFila || x == anteultimaFila)
				for (int y = 0; y < tablero[x].length; y++)
					tablero[x][y] = 'p';

		char[] figuras = { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' };

		tablero[primeraFila] = figuras.clone();
		tablero[ultimaFila] = figuras.clone();

		tablero[ultimaFila][1] = '.';

		tablero[5][2] = 'c';

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();
		}
	}

	@SuppressWarnings("unused")
	private static void tiposDeDatos() {
		int i;
		int a, b;
		int z = 0;
		int g = 1, c = 2;

		int x = 3;

		System.out.println(1 <= x && x <= 10);

		x = -50;

		boolean estaDentroDelRango = !(x <= 1 || x >= 10);

		System.out.println(estaDentroDelRango ? "SI" : "NO");

		int num1 = 3, num2 = 5;

		int max = num1 > num2 ? num1 : num2;

		System.out.println("El máximo de " + num1 + " y " + num2 + " es " + max);

		System.out.println(String.format("El máximo de %d y %d es %d", num1, num2, max));

		i = 3;

		a = b = c;

		float f = 5.3f;

		double d = 5.3;

		boolean bool = true;

		char car = '$';

		System.out.println(i + z + g + a + b + "");
		System.out.println("" + i + z + g + a + b);

		System.out.println("Prueba");

		int resto = 5 % 2;

		System.out.println("El resto de 5 / 2 es " + resto);

		System.out.println(5 & 3);

	}

}
