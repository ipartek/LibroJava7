package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			int num1 = 5, num2 = 0, div;// creas tres variables y les das valor.

			try {
				int[] arr = new int[2];// aqui slo hay 2 huecos, 0 y 1.
				arr[1] = 5; // arr[2] = 5;//en la primera le indicas que en la posicion 1 le ponga un 5. y en la segunda le dices que en la posicion 2 un 5 y como no hay hueco entonces casca el programa.

				String s = "Prueba"; // String s = null; si coge el 2º casca el programa ya que no hay nada dentro de s.
				System.out.println(s.toUpperCase());// te pone en mayusculas el valor de la s.

				div = num1 / num2;// si a num2 le damos el valor 0, entonces casa el programa.
				System.out.println(String.format("%d/%d = %d", num1, num2, div));
			} catch (ArithmeticException ae) {
				div = Integer.MAX_VALUE;// como casca el programa en div le da el maximo valor y salta a finaly.
			} catch (NullPointerException npe) {//
				System.out.println("Error de puntero");
				div = 0;
			} finally {
				System.out.println("POR COJONES ME EJECUTO");
			}
			// catch (Exception e) {
			// System.out.println("ERROR NO ESPERADO");
			// e.printStackTrace();
			// }

			System.out.println("FIN");

			int x = leerEntero("Introduce la x");
			int y = leerEntero("Introduce la y");

			System.out.println(String.format("%d, %d", x, y));
		} catch (Exception e) {
			System.out.println("ERROR NO ESPERADO. CONTACTE CON EL EQUIPO DE DESARROLLO");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static int leerEntero(String texto) {

		int numero = 0;

		boolean hayError;

		do {
			hayError = false;

			try {
				System.out.print(texto + ": ");
				numero = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("No se ha reconocido la entrada como un número entero");
				hayError = true;
			} catch (IOException e) {
				System.out.println("ERROR DE IO");
				// e.printStackTrace();
				System.out.println(e.getMessage());
				System.exit(1);
			}
		} while (hayError);

		// try {
		// br.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		return numero;

		// TODO: Falta terminar este método
		// throw new RuntimeException("NO ESTA TERMINADO");
	}

}
