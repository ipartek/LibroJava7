package com.ipartek.formacion.mikelcuenca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Colecciones {

	public static void main(String[] args) {

		// ejemploArrayList();
		// ejemploHashSet();
		ejemploHashMap();

	}

	// ARRAYLIST

	private static void ejemploArrayList() {
		ArrayList<String> al;
		al = new ArrayList<String>();

		al.add("Uno");
		al.add("Otro");

		for (String dato : al) {

			System.out.println(dato);

		}

		System.out.println(al.get(0));

		al.set(1, "cambiado");

		System.out.println(al.get(1));

		al.add(1, "cambiado nuevamente");

		System.out.println(al);

		al.remove(0);

		System.out.println(al);

		Iterator<String> i = al.iterator();

		while (i.hasNext())
			System.out.println(i.next());

	}

	// HASHSET

	private static void ejemploHashSet() {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Uno");
		hs.add("Dos");
		hs.add("Uno"); // al ser un SET ignora los elementos repetidos y no los mete

		System.out.println(hs);

		System.out.println(hs.contains("Uno"));

		Iterator<String> i = hs.iterator();

		while (i.hasNext())
			System.out.println(i.next());

	}

	// HASHMAP

	private static void ejemploHashMap() {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Versiones anteriores a Java 5; hm.put("UNO", new Integer(1));

		hm.put("UNO", 1);
		hm.put("CINCO", 5);
		hm.put("TRES", 3);
		hm.put("DOS", 2);
		hm.put("SIETE", 7);
		hm.put("CUATRO", 4);

		System.out.println(hm);

		System.out.println(hm.get("CINCO"));

		HashMap<String, String> diccionarioIngles = new HashMap<String, String>();

		diccionarioIngles.put("Casa", "Home");
		diccionarioIngles.put("Perro", "Dog");
		diccionarioIngles.put("Gato", "Cat");
		diccionarioIngles.put("Coche", "Car");

		System.out.println(diccionarioIngles.get("Perro"));
		System.out.println(diccionarioIngles);

		final int INGLES = 0, EUSKERA = 1;

		HashMap<String, String[]> diccionarioMultiple = new HashMap<String, String[]>();

		diccionarioMultiple.put("Casa", new String[] { "Home", "Etxe" });
		diccionarioMultiple.put("Perro", new String[] { "Dog", "Txakur" });

		System.out.println(diccionarioMultiple);

		System.out.println(diccionarioMultiple.get("Perro")[EUSKERA]);
		System.out.println(diccionarioMultiple.get("Perro")[INGLES]);

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakur");

		diccionario3.put("Perro", traducciones);

		traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Home");
		traducciones.put(EUSKERA, "Etxe");

		diccionario3.put("Casa", traducciones);

		System.out.println(diccionario3.get("Casa").get(INGLES));

		String[] idiomas = new String[] { "Inglés", "Euskera" };

		for (String palabraOrigen : diccionario3.keySet()) {

			System.out.println(palabraOrigen.toUpperCase());

			for (int idioma : diccionario3.get(palabraOrigen).keySet())
				System.out.println(String.format("%s: %s", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));

		}

	}

}
