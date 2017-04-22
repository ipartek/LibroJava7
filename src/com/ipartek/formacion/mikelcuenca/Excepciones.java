package com.ipartek.formacion.mikelcuenca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {

	public static void main(String[] args) throws IOException {
		int num1 = 5, num2 = 0, div;

		try {
			div = num1 / num2;
		} catch (ArithmeticException ae) { // ae es una variable del tipo ArithmeticException
			div = Integer.MAX_VALUE;
		}

		System.out.println(String.format("%d/%d = %d", num1, num2, div));

		int numero = leerNumero("Introduce un número");
		int numero2 = leerNumero("Introduce otro número");

		System.out.println(String.format("%d,%d", numero, numero2));

	}

	public static int leerNumero(String texto) throws IOException {
		System.out.println(texto + ": ");

		// Scanner s = new Scanner(System.in);
		// // throw new RuntimeException("NO ESTA TERMINADO");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numero3 = 0;
		try {
			numero3 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
			System.exit(1);
		}
		br.close();
		return numero3;

	}

}
