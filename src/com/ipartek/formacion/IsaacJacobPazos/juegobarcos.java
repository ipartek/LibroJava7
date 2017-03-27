package com.ipartek.formacion.IsaacJacobPazos;

import java.util.Scanner;

public class juegobarcos {
	private static Scanner teclado, teclado2;

	// El ejercicio consiste en hacer un juego simple de guerra de barcos hecho
	// con una matriz. Generamos una tabla de elementos, en el que se generaran
	// en ciertos puntos los barcos, y si das una coordenada te dirá si es agua
	// o barco.

	// Segundo dia del programa. Nuevo objetivo, cuando acabemos de hacerlo
	// funcional, tenemos que hacer que se pueda jugar contra la maquina.
	public static void main(String[] args) {
		teclado2 = new Scanner(System.in);
		int x, y;
		System.out.println("Por favor, diga el ancho que tendrá el tablero.");
		x = teclado2.nextInt();// tengo que recordar el obligar a que el ancho y
								// el alto sean mayor que 1 obligatoriamente (?)
		System.out.println("Ahora indique el alto que tendrá,");
		y = teclado2.nextInt();
		char[][] partida;
		partida = new char[x][y];
		// con esto el tablero esta montado. Ahora tenemos que colocar barcos en
		// puntos aleatorios.
		int nBarcos = 4;// por ahora un numero fijo de barcos
		for (int i = 0; i < nBarcos; i++) {
			GenerarBarco(partida);
		}
		do {
			nBarcos = HundirBarco(partida, nBarcos);
			System.out.println("Quedan " + nBarcos + " barcos.");
		} while (nBarcos > 0);
		System.out.println("YOU WIN!");
	}

	private static char[][] GenerarBarco(char[][] partida) {
		int valorX, valorY;
		do {
			valorX = (int) (Math.random() * partida.length);
			valorY = (int) (Math.random() * partida[0].length);
			// Ahora con esto tenemos tanto la coordenada X e Y que queremos
			// para el
			// barco. Asi que vamos a insertarlo con la condicion de que no
			// exista.
			System.out.println("Los valores son: " + valorX + "," + valorY);
		} while (partida[valorX][valorY] == 'b');
		System.out.println("ARARRARARARARARARA");
		partida[valorX][valorY] = 'b';
		return partida;

	}

	public static void MostrarTabla(char[][] tablero) {
		for (int columnas = 0; columnas < tablero.length; columnas++) {
			for (int filas = 0; filas < tablero[columnas].length; filas++) {
				System.out.print("|");
				if (tablero[columnas][filas] == 'b') {
					System.out.print(" ");

				} else {
					System.out.print(tablero[columnas][filas]);
				}
				// System.out.print("|" + tablero[columnas][filas]);//codigo
				// trampa para tramposos :):):)
			}
			System.out.print("|");
			System.out.println("");
		}
	}

	// Ahora seria crear el metodo para ir probando si hay barco o no.
	// El metodo lo que hará sera preguntar dos coordenadas, y checkear si esa
	// posicion tiene un barco o no, en caso que si lo tenga, lo que hará será
	// cambiar el char de la tabla por una X.
	// aqui hay una serie de problemas a tratar. Primero, ¿Que elemento
	// enviaremos como elemento de entrada? Se supone que por una parte tenemos
	// que editar una tabla que esta en el main, pero tambien tenemos que tener
	// un valor de contador para saber cuando nos dará el mensaje de victoria.

	private static int HundirBarco(char[][] partida, int nBarcos) {
		teclado = new Scanner(System.in);
		int numeroX = 0, numeroY = 0;
		do {
			System.out
					.println("Dime un numero para la coordenada X pls entre 0 y "
							+ (partida.length - 1));
			numeroX = teclado.nextInt();
			if (numeroX < 0 || numeroX > (partida.length - 1))
				System.out.println("¿tu ereh mu tonto?");
		} while (numeroX < 0 || numeroX > (partida.length - 1));
		do {
			System.out
					.println("Dime un numero para la coordenada y pls entre 0 y "
							+ (partida[0].length - 1));
			numeroY = teclado.nextInt();
			if (numeroY < 0 || numeroY > (partida[0].length - 1))
				System.out.println("¿tu ereh mu tonto?");
		} while (numeroY < 0 || numeroY > (partida[0].length - 1));
		if (partida[numeroX][numeroY] == 'b') {
			System.out.println("HUNDIDO!");
			partida[numeroX][numeroY] = 'x';
			nBarcos--;
		} else {
			System.out.println("agua.");
			partida[numeroX][numeroY] = '~';
		}

		MostrarTabla(partida);
		return nBarcos;
	}

}
