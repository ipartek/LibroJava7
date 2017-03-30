package com.ipartek.formacion.odeiolaso.ejemplos;

import java.util.Scanner;

public class tresEnRaya {

	public static void main(String[] args) {

		partida();

	}

	public static void partida() {

		String[][] tablero = new String[3][3];

		String ficha = " ";

		boolean winner = false;

		for (int c = 0; c < tablero.length; c++) {
			for (int l = 0; l < tablero.length; l++) {
				tablero[c][l] = ficha;
			}
		}

		boolean jugador1 = true;

		int colum, linea, posicion;

		Scanner entrada = new Scanner(System.in);

		do {

			if (jugador1) {
				// System.out.print(" 1: ");
				// System.out.print("Jugador");
				//
				// String jugada = JOptionPane
				// .showInputDialog("elige una posicion entre el 1 y el 9");
				// System.out.println(jugada);
				//
				// // if(jugada>0 && jugada < 10)
				// posicion = Integer.parseInt(jugada) - 1;

				System.out
						.println("Jugador elige una posicion entre el 1 y el 9");

				posicion = (entrada.nextInt()) - 1;

				ficha = "X";
				jugador1 = !jugador1;
			} else {
				// System.out.print(" 2: ");

				posicion = (int) Math.floor(Math.random() * 9);

				ficha = "O";
				jugador1 = !jugador1;
			}

			colum = posicion / 3;

			linea = posicion % 3;

			if (tablero[colum][linea] != " ") {
				jugador1 = !jugador1;

			} else {
				tablero[colum][linea] = ficha;

				for (int c = 0; c < tablero.length; c++) {
					for (int l = 0; l < tablero.length; l++) {

						System.out.print(tablero[c][l]);

						if (l % 3 == 2) {
							System.out.print("\n");

						} else {
							System.out.print(" | ");
						}

					}
					if (c != 2)
						System.out.println("---------");

					if ((tablero[c][0] == tablero[c][1]
							&& tablero[c][1] == tablero[c][2] && (tablero[c][0] != " "))

							|| (tablero[0][c] == tablero[1][c]
									&& tablero[1][c] == tablero[2][c] && tablero[0][c] != " ")) {

						winner = true;
					}

				}

				System.out.print("\n\n");

				if (((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) || (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]))
						&& (tablero[1][1] != " ")) {

					winner = true;
				}
			}
		} while (!winner);

		System.out.print("You wins");

		// TODO cosas muuuuuyyyyyy chuuuungaaaassss!!!!!

	}
}
