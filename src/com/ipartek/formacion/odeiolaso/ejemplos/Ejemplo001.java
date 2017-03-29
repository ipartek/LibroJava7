package com.ipartek.formacion.odeiolaso.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Ejemplo001 {

	public static void main(String[] args) throws IOException {

		// tiposDeDatos();
		// estructurasDeContro();

		// entradaClasica();

		// int num = LeerNumero("Dime un numero: ");
		//
		// int a = leerNumero("A: ");
		// int b = leerNumero("B: ");
		// System.out.println("La suuma de A y B es: " + (a + b));

		// System.out.println(factorial(5));

		// colecciones();

		// coleccionesJava5();

		fechas();
	}

	private static void fechas() {
		Date d = new Date("1988/05/29");
		System.out.println(d);

	}

	@SuppressWarnings("unused")
	private static void coleccionesJava5() {
		ArrayList<String> al = new ArrayList<String>();
		// ArrayList<Integer> al = new ArrayList<Integer>();

		al.add("uno");
		al.add("Dos");
		al.add("Tres");

		for (String dato : al)
			System.out.println(dato);

		String s = al.get(1);
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void colecciones() {
		Vector v = new Vector();

		v.add("Hola");
		v.add(7);
		v.add(5.3);

		v.remove(1);

		v.insertElementAt("otro", 2);

		v.insertElementAt("uno", v.size() - 1);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		double d = (double) v.get(1);

		Object[] o = v.toArray();
		System.out.println(o[1]);

		v.add(new Vector());
		v.add(new Vector());

		((Vector) v.get(3)).add("gdfg");
	}

	@SuppressWarnings("unused")
	private static int factorial(int numero) {
		if (numero == 1) {
			return 1;
		}

		return numero * factorial(numero - 1);
	}

	@SuppressWarnings("unused")
	private static int leerNumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine();

		if (linea.matches("\\d*"))
			System.out.println("Numero x 2: " + (Integer.parseInt(linea) * 2));
		else
			System.out.println("NO ES UN NUMERO");

		do {
			if (!linea.matches("\\d*"))
				System.out.println("DEBES PONER UN NUMERO, PEZO INUTIL");

			System.out.println(mensaje);

			linea = br.readLine();

		} while (!linea.matches("\\d*"));

		int num = Integer.parseInt(linea);

		return num;

	}

	private static void entradaClasica() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine();

		if (linea.matches("\\d*"))
			System.out.println("Numero x 2: " + (Integer.parseInt(linea) * 2));
		else
			System.out.println("NO ES UN NUMERO");

		do {
			if (!linea.matches("\\d*"))
				System.out.println("DEBES PONER UN NUMERO, PEZO INUTIL");

			System.out.println("Dime el numero:");

			linea = br.readLine();

		} while (!linea.matches("\\d*"));

	}

	private static void estructurasDeContro() {
		System.out.println("Estructuras de control");

		boolean condicion1 = true;
		boolean condicion2 = false;

		if (!condicion1)
			System.out.println("Condicion1");
		else if (condicion2)
			System.out.println("Condicion2");
		else
			System.out.println("Agur");

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

		int mes = 1;
		int dias;

		for (int i = 1; i <= 12; i++) {
			mes = i;

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

			System.out.println(i + ". " + dias);
		}

		int c = 10;

		while (c <= 10) {
			System.out.println(c-- + " " + --c);
			c *= -c;
		}

		int d = 1;

		while (d <= 10)
			System.out.println(++d);

		for (int n = 1; n <= 10; n++)
			System.out.println(n);

		int p, z;
		for (p = 1, z = 3; p * z <= 10 || z * 2 == 20; p--, z = p * 3)
			System.out.println("FOR " + p + ", " + z);

		System.out.println("DESPUES FOR " + p + ", " + z);

		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d. %d\n", up, down);

		System.out.println("C:\nuevos\trabajos");

		System.out.println("C:\\nuevos\\trabajos");

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int dato : arr)
			System.out.println(dato);

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		char[][] tablero;

		tablero = new char[8][8];

		for (int x = 0; x < tablero.length; x++)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = '.';

		int primeraFila = 0;
		int ultimaFila = tablero.length - 1;
		int segundaFila = primeraFila + 1;
		int penultimaFila = ultimaFila - 1;

		for (int x = 0; x < tablero.length; x++)
			if (x == segundaFila || x == penultimaFila)
				for (int y = 0; y < tablero[x].length; y++)
					tablero[x][y] = 'p';

		char[] figuras = { 't', 'c', 'a', 'r', 'd', 'a', 'c', 't' };

		tablero[primeraFila] = figuras.clone();
		tablero[ultimaFila] = figuras.clone();

		tablero[ultimaFila][1] = '.';

		// for (int x = 0; x < tablero.length; x += 7) {
		// for (int y = 0; y < (tablero[x].length / 2); y++)
		// tablero[x][y] = (char) y;
		// for (int y = 0; y < (tablero[x].length / 2); y++)
		// tablero[x][y] = (char) ((tablero[x].length / 2) - y);
		// }

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();

		}

		// String[][][] lluvias = new String[100][12][31];
		//
		// int lluviaAno = 2000;
		// int lluviaMes = 1;
		// int lluviaDia = 1;
		//
		// for (int a = 0; a <= 100; a++) {
		//
		// for (lluviaMes = 0; lluviaMes <= 12; lluviaMes++) {
		//
		// switch (lluviaMes) {
		// case 2:
		// lluviaDia = 28;
		// break;
		// case 4:
		// case 6:
		// case 9:
		// case 11:
		// lluviaDia = 30;
		// break;
		// default:
		// lluviaDia = 31;
		// }
		//
		// for (int di = 0; di <= lluviaDia; di++) {
		//
		// lluvias[a][lluviaMes][d] = "" + (di + 1) + "-"
		// + (lluviaMes + 1) + "-" + (a + lluviaAno);
		//
		// System.out.println(lluvias[a][lluviaMes][d]);
		// }
		// }
		// }

	}

	@SuppressWarnings("unused")
	public static void tiposDeDatos() {
		// TODO cosas chungas

		int i;
		int a, b;
		int z = 0;
		int g = 1, c = 2;

		i = 3;

		a = b = c;

		float f = 5.3f;

		System.out.println(i + z + g + a + b + "");
		System.out.println("" + i + z + g + a + b);

		int resto = 5 % 2;

		System.out.println("El resto de 5 / 2 es " + resto);

		int o = 3;

		System.out.println(1 <= o && o <= 10);

		o = -50;

		boolean estaDentroDelRango = !(o <= 1 || o >= 10);

		System.out.println("Esta Dentro Del Rango: " + (estaDentroDelRango ? "SI" : "NO"));

		int num1 = 3, num2 = 2;

		// Compara num1 y num2, y le da el valor del mas alto a max
		int max = num1 > num2 ? num1 : num2;

		System.out.println("El máximo de " + num1 + " y " + num2 + " es " + max);
	}

}
