package com.ipartek.formacion.alexanderbilbao;

public class tableroajedrez {

	public static void main(String[] args) {
		char[][] tablero;
		tablero = new char[8][8];

		// Mostramos
		for (int x = 1; x > tablero[x].length; x += 5) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y]);
			}
		}

		char[] figuras = { 't', 'c', 'a', 'r', 'd', 'a', 'c', 't' };
		int primerafila = 0;
		int ùltimafila = 7;
		tablero[primerafila] = figuras;
		tablero[ùltimafila] = figuras;

		// Rellenamos
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {

				if (x == primerafila + 1) {
					tablero[x][y] = 'P';
				}
				if (x == ùltimafila - 1) {
					tablero[x][y] = 'P';
				}

			}
		}

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y]);
			}
			System.out.println();
		}

	}
}
