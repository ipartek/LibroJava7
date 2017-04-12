package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class IfElse {

	public static void main(String[] args) {

		int edad1;
		int edad2;
		edad1 = 15;
		edad2 = 19;
		if (edad1 >= 18)
			System.out.println("Edad1: " + edad1 + "Puede Votar.");
		else
			System.out.println("Edad1: " + edad1 + " No puede votar.");
		if (edad2 >= 18)
			System.out.println("Edad2: " + edad2 + " Puede Votar.");
		else
			System.out.println("No puede votar.");

	}

}
