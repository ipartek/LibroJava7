package com.ipartek.formacion.odeiolaso;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		int numeroSugerido = 0, numero = (int) Math.floor(Math.random() * 1000);
		// System.out.println(numero);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; numeroSugerido != numero; i++) {
			System.out.println("Introduce un numero entre 1 y 1000:");

			try {
				numeroSugerido = Integer.parseInt(sc.nextLine());

				if (numeroSugerido == numero) {
					System.out.println("¡¡¡Enhorabuena has acertado!!!\n    Ha sido al " + i + "º intento");
				} else if (numeroSugerido > numero)
					System.out.println("El numero introducido es mayor que el numero seleccionado");
				else if (numeroSugerido < numero)
					System.out.println("El numero introducido es menor que el numero seleccionado");

			} catch (NumberFormatException e) {
				System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN NUMERO!!!!!!!");
			}

		}
		sc.close();
	}

}
