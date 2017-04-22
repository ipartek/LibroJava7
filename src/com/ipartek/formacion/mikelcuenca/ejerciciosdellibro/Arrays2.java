package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] mi_array = new int[5];

		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("Introduce el elemento numero " + (i + 1));
			mi_array[i] = Integer.parseInt(sc.nextLine());

		}

		sc.close();

		for (int e : mi_array) {
			System.out.println(e * 2);
		}

		int suma_pares = 0;

		for (int e : mi_array) {
			if (e % 2 == 0) {
				suma_pares += e;
			}

		}
		System.out.println(suma_pares);

	}

}
