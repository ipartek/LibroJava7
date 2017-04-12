package com.ipartek.formacion.odeiolaso;

import java.util.ArrayList;

public class PrimosMenoresDe25 {

	public static void main(String[] args) {

		// int[] primos = null, nuevosPrimos = new int[1];
		ArrayList<Integer> primos = new ArrayList<Integer>();
		boolean primo;
		int contador = 0;

		for (int num = 2; num < 25; num++) {
			primo = true;
			for (int num2 = 2; num2 < num / 2; num2++) {
				if (num % num2 == 0)
					primo = false;
			}
			if (primo) {
				contador++;
				primos.add(num);
				// primos = new int[contador];
				// for (int i = 0; i < nuevosPrimos.length; i++) {
				// primos[i] = nuevosPrimos[i];
				// }
				// System.out.println(Arrays.toString(nuevosPrimos));
				// primos[contador - 1] = num;
				// nuevosPrimos = primos;

				// System.out.println(primos);
			}

		}
		System.out.println(primos);
	}
}
