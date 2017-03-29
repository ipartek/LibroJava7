package com.ipartek.formacion.mikelcuenca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuerraDeBarcos {

	public static void main(String[] args) throws IOException {
		// Pedir al jugador el alto y el ancho del tablero. Poner el contador de barcos a 0.
		int fila = leerNumero("Alto del tablero: ");
		int columna = leerNumero("Ancho del tablero: ");
		int numeroDeBarcos = 0;

		// Crear un tablero del tama�o indicado de casillas se�aladas como vac�as
		String[][] tablero = new String[fila][columna];

		for (int x = 0; x < tablero.length; x++)
			for (int y = 0; y < tablero[x].length; y++)
				tablero[x][y] = "|.|";

		// Dibujar el tablero vac�o.
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++)
				System.out.print(tablero[x][y]);
			System.out.println();
		}
		System.out.println();

		// Pedir un n�mero de barcos menor que el n�mero de casillas
		do {
			if (numeroDeBarcos > fila * columna)
				System.out.println("Demasiados barcos. ");
			numeroDeBarcos = leerNumero("N�mero de barcos: ");
		} while (numeroDeBarcos > fila * columna);

		// Poner tantas b en posiciones aleatorias como barcos sin
		// repetir posici�n.
		int a = fila;
		int b = columna;

		for (int x = 0; x < numeroDeBarcos; x++) {

			a = (int) (Math.random() * fila);
			b = (int) (Math.random() * columna);

			if (tablero[a][b] != "|b|")
				tablero[a][b] = "|b|";
			else
				x--;

		}

		// Pedir un numero de fila y un n�mero de columna sin que se puedan salir
		// del tablero tantas veces como n�mero de barcos quedan.
		int coordenadaFila = 0;
		int coordenadaColumna = 0;

		for (int i = 0; i < numeroDeBarcos; i++) {

			do {
				if (coordenadaFila >= tablero.length)
					System.out.println("Fuera del tablero.");
				coordenadaFila = leerNumero("Introduce una fila: ") - 1;

			} while (coordenadaFila >= tablero.length);

			do {
				if (coordenadaColumna >= tablero[0].length)
					System.out.println("Fuera del tablero.");
				coordenadaColumna = leerNumero("Introduce una columna: ") - 1;

			} while (coordenadaColumna >= tablero[0].length);

			// Y si coinciden con una casilla barco cambiarla por una x, dar
			// el mensaje de Hundido

			if (tablero[coordenadaFila][coordenadaColumna] == "|b|") {

				tablero[coordenadaFila][coordenadaColumna] = "|x|";
				System.out.println("Hundido");

			} else {
				tablero[coordenadaFila][coordenadaColumna] = "|a|";
				System.out.println("Agua");
				i--;
			}

			// Y pintar el tablero ocultando los barcos pintando un vacio
			// en esas casillas.
			for (int x = 0; x < tablero.length; x++) {
				for (int y = 0; y < tablero[x].length; y++)
					if (tablero[x][y] == "|b|") {
						System.out.print("|.|");
					}

					else
						System.out.print(tablero[x][y]);
				System.out.println();
			}

		}

		// Cuando no quedan barcos el juego termina.
		System.out.println("Felicidades!");

	}

	// M�todo creado para pedir un n�mero y s�lo aceptar enteros positivos.
	public static int leerNumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "1";

		do {

			if (!linea.matches("\\d+") || linea.matches("0"))
				System.out.println("Debes poner un n�mero entero positivo: ");

			System.out.println(mensaje);

			linea = br.readLine();

		} while (!linea.matches("\\d+") || linea.matches("0"));

		int num = Integer.parseInt(linea);

		return num;
	}

}
