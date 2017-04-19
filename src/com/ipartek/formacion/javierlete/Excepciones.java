package com.ipartek.formacion.javierlete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			int num1 = 5, num2 = 0, div;

			try {
				int[] arr = new int[2];
				arr[1] = 5; // arr[2] = 5;

				String s = "Prueba"; // String s = null;
				System.out.println(s.toUpperCase());

				div = num1 / num2;
				System.out.println(String.format("%d/%d = %d", num1, num2, div));
			} catch (ArithmeticException ae) {
				div = Integer.MAX_VALUE;
			} catch (NullPointerException npe) {
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
