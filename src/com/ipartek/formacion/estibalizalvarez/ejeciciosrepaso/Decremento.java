package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class Decremento {

	public static void main(String[] args) {
		int num1;
		int num2 = 5;
		int num3 = 8;
		System.out.println("Primeros valores:");
		System.out.println("Numero 3:" + num3 + "\nNumero 2:" + num2);

		System.out.println("\nSegundos Valores:");
		num3--;// reduce en uno el valor de num3.
		System.out.println("El numero3 nuevo es: " + num3);// muestrame el numero 3.

		System.out.println("\nTerceros Valores");
		num1 = num2--;// a num1 se le asigna el valor de num2, y en num2 se le reduce en uno y queda grabado el numero reducido.
		System.out.println("Numero1: " + num1 + "\nNumero2: " + num2);

		System.out.println("\nCuartos Valores");
		num1 = --num3;// a num1 le copia el valor de num3 y a num3 se le reduce en 2 el valor.
		System.out.println("Numero1: " + num1 + "\nNumero3: " + num3);
	}
}
