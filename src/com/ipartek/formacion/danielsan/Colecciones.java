package com.ipartek.formacion.danielsan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Colecciones {
	public static void main(String[] args) {
		// ejemploArrayList();
		// ejemploHastSet();
		ejemploHashMap();
	}

	private static void ejemploHashMap() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Versiones anteriores a Java 5: hm.put("Uno", new Integer(1));
		hm.put("Uno", 1);
		hm.put("Dos", 2);
		hm.put("Tres", 3);
		hm.put("Cuatro", 4);
		hm.put("Cinco", 5);

		System.out.println(hm);

		System.out.println(hm.get("Cuatro"));

		HashMap<String, String> diccionario = new HashMap<String, String>();

		diccionario.put("Casa", "Home");
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");

		System.out.println(diccionario);

		// De varios idiomas
		final int INGLES = 0, EUSKERA = 1;
		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();
		diccionario2.put("Casa", new String[] { "Home", "Etxe" });
		diccionario2.put("Perro", new String[] { "Dog", "Txakurra" });
		diccionario2.put("Gato", new String[] { "Cat", "Katua" });

		System.out.println(diccionario2);

		System.out.println(diccionario2.get("Perro")[EUSKERA]);
		System.out.println(diccionario2.get("Perro")[INGLES]);

		// Liando la perdiz

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakur");
		diccionario3.put("Perro", traducciones);
		System.out.println(diccionario3);

		traducciones = new HashMap<Integer, String>();
		traducciones.put(INGLES, "Home");
		traducciones.put(EUSKERA, "Etxe");
		diccionario3.put("Casa", traducciones);
		System.out.println(diccionario3);

		traducciones = new HashMap<Integer, String>();
		// traducciones.put(INGLES, "Cat");
		traducciones.put(EUSKERA, "Katua");
		diccionario3.put("Gato", traducciones);

		System.out.println(diccionario3.get("Casa").get(INGLES));

		String[] idiomas = new String[] { "Ingles", "Euskera" };
		for (String palabraOrigen : diccionario3.keySet()) {
			System.out.println(palabraOrigen.toUpperCase());
			for (int idioma : diccionario3.get(palabraOrigen).keySet()) {
				System.out.println(String.format("%s : %s ", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));
			}
		}
	}

	private static void ejemploHastSet() {
		HashSet<String> hs = new HashSet<>();
		hs.add("Uno");
		hs.add("Dos");
		hs.add("Tres");
		hs.add("Uno");
		System.out.println(hs);

		ArrayList<String> al = new ArrayList<String>();
		al.add("Uno");
		al.add("Dos");
		al.add("Tres");
		al.add("Uno");
		System.out.println(al);
	}

	private static void ejemploArrayList() {
		ArrayList<String> al;
		al = new ArrayList<String>();

		// Añadimos elementos
		al.add("Uno");
		al.add("Dos");
		al.add("Tres");
		al.add("Cuatro");

		System.out.println(al);

		for (String dato : al) {
			System.out.println(dato);
		}

		System.out.println(al.get(1));

		al.set(1, "Dos cambiado");

		System.out.println(al.get(1));
		System.out.println(al.toString());

		al.add(4, "Cinco Nuevo");
		System.out.println(al);

		al.remove(0);

		System.out.println(al);

		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + ":  ");
			System.out.println(i.hasNext());
		}
		// System.out.println(i.hasNext());

		System.out.println(al.toArray()[3]);

		String[] arr = new String[4];
		System.out.println(Arrays.toString(arr));
	}
}
