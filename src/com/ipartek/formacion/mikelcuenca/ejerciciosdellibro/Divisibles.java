package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

public class Divisibles {

	public static void main(String[] args) {

		int numero = 0;
		int suma = 0;

		for (numero = 100; numero <= 150; numero++) {
			if (numero % 3 == 0 && numero % 7 == 0) {
				System.out.println(numero + "");
				suma += numero;
			}
		}
		System.out.println("La suma de todos ellos es");
		System.out.println(suma);

	}

}
