package com.ipartek.formacion.odeiolaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {

	public static void main(String[] args) {
		try {
			int num1 = 5, num2 = 0, div;

			try {
				int[] array = new int[2];
				// array[5] = 4;

				String s = null;
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
			// System.out.println("ERROR NO ENCONTRADO");
			// System.out.println(e);
			// e.printStackTrace();
			// }

			System.out.println("FIN");

			int numero = leerEntero("Introduce un numero");
			int x = leerEntero("Introduce la X");
			int y = leerEntero("Introduce la Y");

			System.out.println("Numeros X € Y: " + numero + x + y);

		} catch (Exception e) {
			System.out.println("ERROR EXTRAÑO DE CONOJONES. REINICIE LA APLICACION. EN CASO DE QUE PERSISTA EL ERROR CONTACTE CON DESARROLLO");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static int leerEntero(String texto) {

		// Scanner s = new Scanner(System.in);
		// int numero = Integer.parseInt(s.nextLine());
		// s.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numero = 0;
		boolean hayError = true;

		do {

			try {
				System.out.println(texto + ": ");
				// br.close();
				numero = Integer.parseInt(br.readLine());
				hayError = false;
			} catch (NumberFormatException e1) {
				System.out.println("LA proxima vez intenta con n numero entero..");
				hayError = true;
			} catch (IOException e1) {
				System.out.println("ERROR DE IO");
				System.out.println(e1.getMessage());
				// e1.printStackTrace();
				System.exit(1);
			}
		} while (hayError);

		// try {
		// br.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// System.exit(1);
		// }

		return numero;

		// TODO: Falta terminar este metodo
		// throw new RuntimeException("NO ESTA TERMINADO");
	}

}
