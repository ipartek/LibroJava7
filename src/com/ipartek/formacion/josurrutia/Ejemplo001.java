package com.ipartek.formacion.josurrutia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Ejemplo001 {

	public static void main(String[] args) throws IOException {
		// tiposDeDatos();
		// estructurasDeControl();
		// insercion();
		// ejemploLeerNumero();
		// coleciones();
		// coleccionesJava5();
		fechas();
	}

	private static void fechas() {
		Date d = new Date();
		System.out.println(d);

	}

	private static void coleccionesJava5() {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Uno");
		a1.add("Dos");
		a1.add("Tres");

		for (String dato : a1)
			System.out.println(dato);

		String s = a1.get(1);
	}

	@SuppressWarnings({ "unused", "unchecked" })
	private static void coleciones() {
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();

		v.add("HOLA");
		v.add(7);
		v.add(5.3);

		// Borra la posicion uno, empieza a contar desde 0
		v.remove(1);

		v.insertElementAt("otro", 2);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		double d = (double) v.get(1);

		Object[] o = v.toArray();
		System.out.println(o[1]);

		v.add(new Vector());
		v.add(new Vector());

		((Vector) v.get(3)).add("asdas");

	}

	public static void ejemploLeerNumero() throws IOException {
		int a = leernumero("A : ");
		int b = leernumero("B : ");
		System.out.println("La suma es : " + (a + b));
	}

	private static int leernumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		do {
			if (!linea.matches("\\d*"))
				System.out.println("ERRORRR GARRAFAL");

			System.out.println(mensaje);
			linea = br.readLine();

		} while (!linea.matches("\\d*"));
		return Integer.parseInt(linea);

	}

	@SuppressWarnings("unused")
	private static void insercion() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		System.out.println("Como te llamas?");
		String nombre = br.readLine();

		System.out.println("Hola " + (nombre));
		do {
			if (!linea.matches("\\d*")) {
				System.out.println("ERRORRR GARRAFAL");
			}
			System.out.println("Cuantos años tienes?:");
			linea = br.readLine();
		} while (!linea.matches("\\d*"));
		int num = Integer.parseInt(linea);

		System.out.println("Tu edad es de:" + (num));

		// solo puedes meter un numero
		/*
		 * System.out.println(" Cuantos años tienes???"); String linea = br.readLine();
		 * 
		 * if (linea.matches("\\d*")) { System.out.println("Tu edad es de:" + (Integer.parseInt(linea))); } else { do { System.out.println(); System.out.println(" Repito cuantos años tienes???"); linea = br.readLine(); } while (!linea.matches("\\d*"));
		 * 
		 * }
		 */
	}

	@SuppressWarnings("unused")
	private static void estructurasDeControl() {

		System.out.println("Estructuras de Control");

		boolean condicion = false;
		boolean condicion2 = true;

		if (condicion) {
			System.out.println("Condicion1");
		} else if (condicion2) {
			System.out.println("Condicion2");
		} else {
			System.out.println("ELSE");
		}

		int opcion = 1;

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

		int g = 1;

		while (g <= 10) {
			// deveuelve el valor y luego lo incrementa
			System.out.println("Incremento " + g++);
		}
		do {
			// decrementa el valor y luego lo devuelve
			System.out.println("Decremento " + g-- + "\n");

		} while (g >= 1);

		/*
		 * int n = 1; while(n <=10){ System.out.println(n); n++; }
		 */
		for (int n = 1; n <= 10; n++) {
			System.out.println("FOR1 : " + n);
		}
		System.out.println();

		int t, z;
		for (t = 1, z = 3; t * z <= 10 || z * 2 == 20; t--, z = 3 * t) {
			System.out.println("FOR2 : " + t + ", " + z);
		}
		System.out.println("DESPUES DEL FOR " + t + ", " + z);

		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d, %d\n", up, down);

		System.out.println("C:\nuevos\trabajos");
		System.out.println("C:\\nuevos\\trabajos");

		int[] array = { 1, 2, 3, 4, 5 };
		// int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		for (int dato : array) {
			System.out.println(dato);
		}

		// TODO array meses y dias
		int[][] arra = new int[12][31];

		for (int i = 0; i < arra.length; i++) {
			for (int j = 0; j < arra[i].length; j++) {
				arra[i][j] = i + j;
				System.out.println("array el mes : " + (i + 1) + " dia : " + (j + 1));
			}
		}
		System.out.println('\n');
		// TODO tablero de ajedrez
		char[][] tablero;
		tablero = new char[8][8];
		// rellenar los puntos
		for (int x = 0; x < tablero.length; x++)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = '.';

		int primeraFila = 0;
		int ultimaFila = tablero.length - 1;
		int segundaFila = primeraFila + 1;
		int anteultimaFila = ultimaFila - 1;
		// pintar peones
		for (int x = 1; x < tablero.length; x++)
			if (x == 1 || x == tablero.length - 2) {
				for (int y = 0; y < tablero[x].length; y++)
					tablero[x][y] = 'p';
			}

		char[] figuras = { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' };

		tablero[primeraFila] = figuras.clone();
		tablero[ultimaFila] = figuras.clone();

		tablero[ultimaFila][1] = '.';
		// cambiar el caballo de posicion
		tablero[5][2] = 'c';

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();
		}

	}

	@SuppressWarnings("unused")
	private static void tiposDeDatos() {
		int a = 2;
		int b = 3, c;

		c = a + b + 3;

		float f = 5.3f;
		System.out.println(f);

		System.out.println(c);

		// suma los numeros y luego lo combierte en texto
		System.out.println(a + b + "");

		// combierte los numeros en texto y no los suma los concatena
		System.out.println("" + a + b);

		int resto = 5 % 2;

		System.out.println("El resto de 5 / 2 es : " + resto);

		int x = 3;

		System.out.println(1 <= x && x <= 10);

		x = -50;
		System.out.println(1 >= x || x >= 10);

		// negacion
		boolean estaDentroDelRango = !(x <= 1 || x <= 10);

		// SI si es true NO si es false
		System.out.println(estaDentroDelRango ? "SI" : "NO");

		int num1 = 3, num2 = 2;

		// si el numero 1 es mayor q el 2 devuelveme el 1 y sino el 2
		int max = num1 > num2 ? num1 : num2;

		System.out.println("El maximo de " + num1 + " y " + num2 + " es " + max);

		System.out.println(String.format("El maximo de %d y %d es %d", num1, num2, max));
	}
}
