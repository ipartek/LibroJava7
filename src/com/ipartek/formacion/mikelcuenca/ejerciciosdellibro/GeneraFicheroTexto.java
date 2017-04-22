package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GeneraFicheroTexto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre;

		try {
			FileWriter flS = new FileWriter("Agenda.txt");
			BufferedWriter fS = new BufferedWriter(flS);

			do {
				System.out.print("Introduce un nombre (Intro para terminar): ");
				nombre = sc.nextLine();
				if (nombre.length() > 0) {
					System.out.print("Teléfono: ");
					String telefono = sc.nextLine();
					fS.write(nombre + ", " + telefono);
					fS.newLine();
				}
			} while (nombre.length() > 0);
			fS.close();

		} catch (IOException e) {
			System.out.println("Error en el fichero");
		}

	}

}
