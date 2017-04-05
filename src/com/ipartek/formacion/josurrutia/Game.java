package com.ipartek.formacion.josurrutia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	private static int x, y;
	private static String[][] campo;

	public static void Tablero() {

		campo = new String[10][10];
		System.out.println("\n \t GAME \n");

		// Rellenar el array campo con el caracter
		for (int i = 0; i < campo.length; i++)
			for (int j = 0; j < campo[i].length; j++)
				campo[i][j] = "|_|";

		// Mostrar el campo de juego
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++)
				System.out.print(campo[i][j]);
			System.out.println();
		}

		// Crear y posicionar los barcos dentro del array
		System.out.println("Tienes 10 barcos para destruir");
		for (int a = 0; a < 10; a++) {
			x = (int) (Math.random() * 10);
			y = (int) (Math.random() * 10);
			System.out.println("Linea " + x + " Columna " + y);
			if (campo[x][y] == "|B|") {
				a--;
			} else
				campo[x][y] = "|B|";

		}

	}

	public static void Jugada() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cont = 10;
		String linea, columna;
		do {
			System.out.println("teclea una posicion de linea de 0 a 9: ");
			linea = br.readLine();

			System.out.println("teclea una posicion de columna de 0 a 9: ");
			columna = br.readLine();

			if (Integer.parseInt(linea) >= 10 && Integer.parseInt(columna) >= 10) {
				System.out.println("haber txabal lee bien");
			} else if ("|B|" == campo[Integer.parseInt(linea)][Integer.parseInt(columna)]) {
				System.out.println("acertaste");
				System.out.println("Te quedan " + --cont + " barcos");
				campo[Integer.parseInt(linea)][Integer.parseInt(columna)] = "|H|";
				if (cont == 0) {
					System.out.println("Felicidades as ganado....");
				}

				// TODO faltan cosillas te queda algo por hacer
			} else {
				System.out.println("Agua");
				campo[Integer.parseInt(linea)][Integer.parseInt(columna)] = "|A|";
			}
			for (int i = 0; i < campo.length; i++) {
				for (int j = 0; j < campo[i].length; j++) {
					if (campo[i][j] != "|B|") {
						System.out.print(campo[i][j]);

					} else {
						System.out.print("|_|");
					}
				}
				System.out.println();
			}

		} while (linea != campo[x][y]);
		System.out.println("Haber txabal mejor reinicia el juego...");

	}

	public static void main(String[] args) throws IOException {
		// TODO Juego de hundir la flota by: Josu U.
		Tablero();
		Jugada();
	}

}
