package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int[] mi_array = new int[Integer.parseInt(sc.nextLine())];
		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("Introduce el elemento numero " + (i + 1) + " del array");
			mi_array[i] = Integer.parseInt(sc.nextLine());
		}

		for (int e : mi_array)
			System.out.println(e);

		sc.close();

		int max = mi_array[1];
		int min = mi_array[mi_array.length - 1];
		int sum = 0;

		for (int e : mi_array) {
			if (e > max) {
				max = e;
			}
			;
		}
		System.out.println("El elemento mayor es " + max);

		for (int e : mi_array) {
			if (e < min) {
				min = e;
			}

		}
		System.out.println("El elemento menor es " + min);

		for (int e : mi_array) {
			sum += e;
		}
		System.out.println("La suma de todos los elementos es " + sum);

	}
}
