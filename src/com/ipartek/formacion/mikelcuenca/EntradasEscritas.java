package com.ipartek.formacion.mikelcuenca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradasEscritas {

	public static void entradaClasica() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine();

		if (linea.matches("\\d*"))
			System.out.println("NUMERO X 2: " + (Integer.parseInt(linea) * 2));
		else
			System.out.println("NO ES UN NUMERO");

	}

	public static void entradaNumeros() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		do {

			if (!linea.matches("\\d*"))
				System.out.println("DEBES PONER UN NUMERO, PEAZO INUTIL");

			System.out.println("Dime el número: ");

			linea = br.readLine();

		} while (!linea.matches("\\d*"));

		int num = Integer.parseInt(linea);
		System.out.println(num * 2);

	}

	public static void main(String[] args) throws IOException {
		// entradaClasica();
		entradaNumeros();

	}

}
