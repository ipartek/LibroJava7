package com.ipartek.formacion.danilozano;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int cont = 10;
		int intentos = 0;

		double n = Math.random() * 100;
		int numero = (int) n;
		int numeroIntroducido = 0;
		while (numeroIntroducido != numero) {
			System.out.println("Introduce un numero del 0 al 100 \n tienes " + cont + " intentos");

			Scanner sc = new Scanner(System.in);
			numeroIntroducido = sc.nextInt();

			cont--;
			intentos++;
			if (cont == 0) {

				break;
			} else if (numeroIntroducido < numero) {
				System.out.println("El numero es mayor");
				System.out.println("Siga intentadolo te quedan " + cont + "intentos");
			} else if (numeroIntroducido > numero) {
				System.out.println("El numero es menor");
				System.out.println("Siga intentadolo");

			}

		}

		if (cont != 0) {
			System.out.println("has acertado en " + intentos + " intentos");
		} else if (cont == 0) {
			System.out.println("te as quedado sin intentos\n El numerto oculto era: " + numero);
		}
	}
}
