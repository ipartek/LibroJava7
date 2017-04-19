package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] numeros = new int[5];// declarar un array de tipo entero de 5 elementos.

		Scanner datos = new Scanner(System.in);
		System.out.println("INTRODUCE 5 NUMEROS: ");

		// para que que aparezca el orde de los elementos:
		for (int a = 0; a < numeros.length; a++) {// para que vaya recorriendo numero a numero hasta llegue al final del array.
			System.out.printf("Numero %d:", a);
			System.out.println(String.format("Numero %d:", a));// este es igual que el anterior pero con string.format. Me sale seguido al anterior.
			numeros[a] = datos.nextInt();
		}// for

		// multiplicar cada valor por 2:
		for (int i = 0; i < numeros.length; i++) {// recorreme los datos desde el 0 has el final.
			int resultado = numeros[i] * 2;// creas una variable "resultado" donde se guarda el valor. Le dices que recoga los valores de "numeros" y que empieza desde el valor 0 hasta el final y los multiplique por 2.
			System.out.println("El resultado de la multiplicacion es: " + resultado);// mostrar el resultado.
		}// for
		int suma = 0;
		for (int c = 0; c < numeros.length; c++) {
			int dato1 = numeros[c];
			if (dato1 % 2 == 0) {// si los valores introducidos anteriormente en la variable i divididos entre 2 y el resultado sea 0.
				suma = suma + dato1;// es lo mismo que suma+=dato1, a suma le incrementas el valor de dato1 y se guarda de nuevo en la variable suma.Acumular.
			}// if
		}// for
		System.out.println("Suma de los elementos pares: " + suma);
		datos.close();
	}// main
}
