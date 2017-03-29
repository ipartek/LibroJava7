package com.ipartek.formacion.odeiolaso.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HundirFlota2 {

	static int fials = 1, columnas = 1;

	static String[][] tablero = new String[fials][columnas];
	static String[][] tableroJugador = new String[fials][columnas];

	static boolean tabla = false, winner = false, disparo = false;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; winner; i++)
			if (i == 0)
				crearFlout();
			else
				hundirFlout();

		pillarTexto();
	}

	private static void forForFlout() {

	}

	private static void crearFlout() {

		pillarTexto(" Itroduce numero de filas: ", " Itroduce numero de columnas:", "NO ES UN NUMERO");

		forForFlout();

	}

	private static void pillarTexto(String filas, String columnas, String noNumerico) {
		boolean textoCapturado = false;

		do {

			System.out.print(" Itroduce numero de filas: ");
			String fila = br.readLine();

			if (fila.matches("\\d+")) {
				fials = Integer.parseInt(fila);
				do {
					System.out.print(" Itroduce numero de columnas: ");
					String column = br.readLine();
					if (column.matches("\\d+")) {
						columnas = Integer.parseInt(column);
						tabla = true;
					} else
						System.out.println("NO ES UN NUMERO");
				} while (!tabla);
			} else
				System.out.println("NO ES UN NUMERO");

		} while (!tabla);

	}

	private static void hundirFlout() throws IOException {

		forForFlout();

		int filaDisparo = -1, columnaDisparo = -1;

		String ficha = " ";

		for (int c = 0; c < tablero.length; c++) {
			for (int l = 0; l < tablero[c].length; l++) {
				tablero[c][l] = ficha;
			}
		}
		//
		// int max = fials > columnas ? fials : columnas;
		//
		// int bracos = (int) Math.floor(Math.random() * max);

		int bracos = (int) Math.floor(Math.random() * fials * columnas);

		for (int b = 0; b < bracos;) {

			int x = (int) Math.floor(Math.random() * tablero.length);

			int y = (int) Math.floor(Math.random() * tablero[0].length);

			if (tablero[x][y] != "O") {
				tablero[x][y] = "O";
				b++;
			}
		}

		// String linea = br.readLine();
		//
		// if (linea.matches("\\d*"))
		// System.out.println("Numero x 2: " + (Integer.parseInt(linea) * 2));
		// else
		// System.out.println("NO ES UN NUMERO");

		boolean jugador = true;

		int disparos = 0;

		do {

			if (filaDisparo > -1 && columnaDisparo > -1) {
				if (tablero[filaDisparo][columnaDisparo] == "O") {
					tablero[filaDisparo][columnaDisparo] = "@";
					bracos--;
					System.out.println("TOCADO");
				} else {
					tablero[filaDisparo][columnaDisparo] = "X";
					System.out.println("AGUA");
				}
				disparos++;
			}

			int totalLength = tablero[0].length + tableroJugador[0].length;

			System.out.println();

			System.out.print("   | ");

			for (int i = 0; i < 2; i++) {

				for (int c = 0; c < tablero[0].length; c++) {
					System.out.print(c + 1);

					if (c == (totalLength - 1)) {
						System.out.println();

					} else {
						System.out.print(" | ");
					}
				}
				System.out.print("       ");
			}
			System.out.println();

			for (int l = 0; l < totalLength + 1; l++) {
				System.out.print("----");
				if (l == (tablero.length))
					System.out.print("       ");
			}

			System.out.println();
			for (int c = 0; c < tablero.length; c++) {
				for (int i = 0; i < 2; i++) {
					System.out.print(" " + (c + 1) + " | ");
					for (int l = 0; l < tablero[c].length; l++) {

						if (tablero[c][l] != "O")
							System.out.print(tablero[c][l]);
						else
							System.out.print(" ");

						System.out.print(" | ");

						if (l == (tablero[c].length - 1))
							System.out.print("       ");

					}

					// System.out.print("       ");
				}
				System.out.println();

				if (c != (totalLength - 1)) {
					for (int l = 0; l < totalLength + 1; l++) {
						System.out.print("----");
						if (l == (tablero.length))
							System.out.print("       ");
					}
					System.out.println();
				}

			}

			System.out.println("Numero de barcos: " + bracos);

			System.out.println("Torpedos lanzados: " + disparos);

			if (bracos > 0)
				do {

					System.out.print(" Itroduce el numero de fila al que quieres disparar: ");
					String linea = br.readLine();

					if (linea.matches("\\d+")) {
						filaDisparo = Integer.parseInt(linea) - 1;
						if (filaDisparo < fials && filaDisparo >= 0) {
							do {
								System.out.print(" Itroduce el numero de columna al que quieres disparar: ");
								String column = br.readLine();
								if (column.matches("\\d+")) {
									columnaDisparo = Integer.parseInt(column) - 1;
									if (columnaDisparo < columnas && columnaDisparo >= 0)
										disparo = true;
									else
										System.out.println("EL NUMERO ES MAYOR DEL NUMERO DE COLUMNAS O MENOR DE CERO");
								} else
									System.out.println("NO ES UN NUMERO");
							} while (!disparo);
						} else
							System.out.println("EL NUMERO ES MAYOR DEL NUMERO DE FILAS O MENOR DE CERO");
					} else
						System.out.println("NO ES UN NUMERO");

				} while (!disparo);
			else
				winner = true;

			disparo = false;

		} while (!winner);

		System.out.println("¡¡¡ENORABUENA HAS GANADO!!!");

	}
}
