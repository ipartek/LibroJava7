package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

public class Primos {

	public static void main(String[] args) {
		boolean esPrimo = true;
		for (int i = 2; i < 25; i++) {
			esPrimo = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					esPrimo = false;
			}
			if (esPrimo)
				System.out.print(i + " ");

		}
	}
}
