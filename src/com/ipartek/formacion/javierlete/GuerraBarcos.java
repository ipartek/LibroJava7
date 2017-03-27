package com.ipartek.formacion.javierlete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuerraBarcos {

	private static char[][] tableroOrdenador = new char[4][4];
	private static char[][] tableroJugador = new char[4][4];

	private static int xJugador, yJugador;

	public static void main(String[] args) throws IOException {
		crearTableros();
		ponerBarcos();
		do {
			mostrarTableros();
			pedirCoordenadas();
			if (hayBarco()) {
				hundirBarco();
			} else {
				agua();
			}
		} while (quedanBarcos());
		felicidades();
	}

	private static void felicidades() {
		System.out.println("Felicidades");
	}

	private static boolean quedanBarcos() {
		boolean hayBarcos = false;

		bucle: for (int x = 0; x < tableroOrdenador.length; x++)
			for (int y = 0; y < tableroOrdenador[x].length; y++)
				if (tableroOrdenador[x][y] == 'B') {
					hayBarcos = true;
					break bucle;
				}

		return hayBarcos;
	}

	private static void agua() {
		tableroJugador[xJugador][yJugador] = 'A';
	}

	private static void hundirBarco() {
		tableroOrdenador[xJugador][yJugador] = 'A';
		tableroJugador[xJugador][yJugador] = 'H';
	}

	private static boolean hayBarco() {
		// return tableroOrdenador[xJugador][yJugador] == 'B';
		if (tableroOrdenador[xJugador][yJugador] == 'B')
			return true;
		else
			return false;
	}

	private static void pedirCoordenadas() throws IOException {
		xJugador = pedirCoordenada("Dime la x: ", tableroJugador.length);
		yJugador = pedirCoordenada("Dime la y: ", tableroJugador[0].length);
	}

	private static int pedirCoordenada(String mensaje, int tope) throws IOException {
		int numero;
		do {
			numero = leerNumero(mensaje);

			if (numero >= tope)
				System.out.println("Te has salido del tablero");
		} while (numero >= tope);

		return numero;
	}

	private static void mostrarTableros() {
		mostrarTablero(tableroOrdenador);
		mostrarTablero(tableroJugador);
	}

	private static void mostrarTablero(char[][] tablero) {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();
		}
	}

	private static void crearTableros() {
		crearTablero(tableroOrdenador, 'A');
		crearTablero(tableroJugador, '.');
	}

	private static void crearTablero(char[][] tablero, char relleno) {
		for (int x = 0; x < tablero.length; x++)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = relleno;
	}

	private static void ponerBarcos() {
		int numeroBarcos = 4;
		int x, y;

		for (int i = 0; i < numeroBarcos; i++) {
			x = (int) (Math.random() * tableroOrdenador.length);
			y = (int) (Math.random() * tableroOrdenador[0].length);

			if (tableroOrdenador[x][y] == 'B')
				i--;
			else
				tableroOrdenador[x][y] = 'B';
		}

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
}
