package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class Tallas {

	public static void main(String[] args) {
		int tallamenor = 36;
		int tallamayor = 56;
		Scanner a = new Scanner(System.in);
		System.out.println("Cual es tu talla? ");
		int talla = a.nextInt();// para meter y ver los datos introducidos.
		if (talla >= tallamenor && talla <= tallamayor)// le indicas que talla este entre dos valores.
			System.out.println("La talla exite.");
		else
			System.out.println("La talla no existe.");

		if (talla <= tallamenor) {
			System.out.println("La talla no exite.");
		} else
			System.out.println("La talla existe.");

	}

}
