package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.ArrayList;

public class Colecciones {

	public static void main(String[] args) {
		ejemploArrayList();

	}

	public static void ejemploArrayList() {
		ArrayList<String> al; // String[] arr;
		al = new ArrayList<String>(); // arr = new String[TAMA�O];

		al.add("Uno"); // arr[ULTIMO+1] = "Uno";
		al.add("Otro"); // arr[ULTIMO+1] = "Otro";

		System.out.println("Colecci�n inicial:");

		for (String dato : al)
			// for(String dato: arr)
			System.out.println(dato); // System.out.println(dato);

		System.out.println("\nDato de la posici�n 1:");
		System.out.println(al.get(1)); // System.out.println(arr[1]);

		al.set(0, "Cambiado"); // arr[0] = "Cambiado";

		System.out.println("\nModificar la posici�n 0:");

		System.out.println(al);

		al.add(1, "Intruso");

		System.out.println("\nInsertar en la posici�n 1:");

		System.out.println(al);

		al.remove(0);

		System.out.println(al);//

		// System.out.println(Integer.toBinaryString(-6));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >> 2)));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >>> 2)));
	}

}
