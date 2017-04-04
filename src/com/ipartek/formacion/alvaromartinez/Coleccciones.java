package com.ipartek.formacion.alvaromartinez;

import java.util.ArrayList;

public class Coleccciones {

	public static void main(String[] args) {

		ArrayList<String> al; // declaras un arraylist en esta ocasion de
								// Strings
		al = new ArrayList<String>(); // inicializas el array

		al.add("UNO");
		al.add("OTRO");
		System.out.println("Coleccion inicial");
		for (String dato : al) { // for(String dato: arr)
			System.out.println(dato); // System.out.println(arr[1]);
		}
		System.out.println("\nDato de la posicion 1");
		System.out.println(al.get(1)); // System.out.pritln(arr[1];

		al.set(0, "Cambiado");
		System.out.println("\nModificar la posicion 0");

		System.out.println(al);

		al.add(1, "Intruso");

		System.out.println("\nInsertar en la posición 1");

		System.out.println(al);

		al.remove(0);

		System.out.println(al);

		// System.out.println(Integer.toBinaryString(-6));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >>
		// 2)));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6
		// >>> 2)));

	}
}