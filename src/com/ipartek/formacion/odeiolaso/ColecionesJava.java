package com.ipartek.formacion.odeiolaso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ColecionesJava {

	public static void main(String[] args) {

		// ejemploArrayList();
		//
		// ejemploHashSet();

		ejemploHashMap();

	}

	private static void ejemploHashMap() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("UNO", 1); // Versiones anteriores a Java 5: hm.put("UNO", new Integer(1));
		hm.put("CINCO", 5);

		System.out.println(hm);

		System.out.println(hm.get("CINCO"));

		HashMap<String, String> diccionario = new HashMap<String, String>();

		diccionario.put("Casa", "Home");
		diccionario.put("Perro", "Dog");

		System.out.println(diccionario);

		final int INGLES = 0, EUSKERA = 1;

		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();

		diccionario2.put("Casa", new String[] { "Home", "Etxie" });
		diccionario2.put("Perro", new String[] { "Dog", "Txakurre" });

		System.out.println(diccionario2);

		System.out.println(diccionario2.get("Perro")[EUSKERA]);
		System.out.println(diccionario2.get("Perro")[INGLES]);

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakurre");

		diccionario3.put("Perro", traducciones);

		traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Home");
		traducciones.put(EUSKERA, "Etxie");

		diccionario3.put("Casa", traducciones);

		System.out.println(diccionario3.get("Casa").get(EUSKERA));

		String[] idiomas = new String[] { "Ingles", "Euskerie" };

		for (String palabraOrigen : diccionario3.keySet()) {
			System.out.println(palabraOrigen.toUpperCase());

			for (int idioma : diccionario3.get(palabraOrigen).keySet()) {
				System.out.println(String.format("%s : %s", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));
			}

		}

	}

	private static void ejemploHashSet() {
		HashSet<String> hs = new HashSet<String>();

		hs.add("Uno");
		hs.add("Dos");
		hs.add("Uno");

		System.out.println(hs);

		ArrayList<String> al = new ArrayList<String>();

		al.add("Uno");
		al.add("Dos");
		al.add("Uno");

		System.out.println(al);

	}

	private static void ejemploArrayList() {
		ArrayList<String> al;
		al = new ArrayList<String>(); // arr = new String[TAMAÑO];

		al.add("Uno"); // arr[0] = "Uno";
		al.add("Otro"); // arr[0] = "Otro";

		System.out.println("Collecion inicial");

		for (String dato : al)
			// for(String dato: arr)
			System.out.println(dato); // System.out.println(dato;

		System.out.println("\n Dato de la posicion 1");

		System.out.println(al.get(1)); // System.out.println(arr[1]);

		System.out.println("\n Modificar la posicion 0");

		al.set(0, "Cambiado");

		System.out.println(al);

		System.out.println("\n Insertar en la posicion 1");

		al.add(1, "Intruso");

		System.out.println(al);

		System.out.println("\n Borrar la posicion 0");

		al.remove(0);

		System.out.println(al);

		Iterator<String> i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
			System.out.println(i.hasNext());
		}

		// System.out.println(Integer.toBinaryString(-6));
		// System.out.println(String.format("%32", Integer.toBinaryString(-6 >> 2)));
		// System.out.println(String.format("%32", Integer.toBinaryString(-6 >>> 2)));
	}

}
