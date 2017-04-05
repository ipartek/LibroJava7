package com.ipartek.formacion.josurrutia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Colecciones {

	public static void main(String[] args) {
		// ejemploArrayList();
		ejemploHashSet();
		ejemploHashMap();
	}

	private static void ejemploHashMap() {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("UNO", 1);
		hm.put("CINCO", 5);

		System.out.println(hm);

		System.out.println(hm.get("CINCO"));

		HashMap<String, String> diccionario = new HashMap<String, String>();

		diccionario.put("Casa", "Home");
		diccionario.put("Perro", "Dog");

		System.out.println(diccionario);

		final int INGLES = 0, EUSKERA = 1;

		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();

		diccionario2.put("Casa", new String[] { "Home", "Etxea" });
		diccionario2.put("Perro", new String[] { "Dog", "Txakurra" });

		System.out.println(diccionario2);

		System.out.println(diccionario2.get("Perro")[EUSKERA]);
		System.out.println(diccionario2.get("Perro")[INGLES]);

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakurr");

		diccionario3.put("Perro", traducciones);

		traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Home");
		traducciones.put(EUSKERA, "Etxea");

		diccionario3.put("Casa", traducciones);

		System.out.println(diccionario3.get("Casa").get(INGLES));

		String[] idiomas = new String[] { "Ingles", "Euskera" };

		for (String palabraOrigen : diccionario3.keySet()) {
			System.out.println(palabraOrigen.toUpperCase());

			for (int idioma : diccionario3.get(palabraOrigen).keySet()) {
				System.out.println(String.format("%s: %s", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));
			}
		}

	}

	private static void ejemploHashSet() {

		HashSet<String> hs = new HashSet<>();

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

	public static void ejemploArrayList() {
		ArrayList<String> al;
		al = new ArrayList<String>(); // arr new String[TAMAÑO]

		// ArrayList<String> al = new ArrayList<String>();

		al.add("Uno"); // arr[0] = "Uno";
		al.add("Otro");// arr[1] = "Otro";

		System.out.println("Coleccion inicial");
		// TODO sakar todos los elementos de la lista de colecciones
		for (String dato : al) { // for (String dato: arr)
			System.out.println(dato); // Sustem.out.println (dato);
		}

		// TODO para sakar un elemento especifico de la lista de colecciones
		System.out.println("Dato de la posicion 1");
		System.out.println(al.get(1));

		// TODO para cambiar un elemento de la lista
		al.set(0, "Cambiado");

		// insertar nuevo elemento
		al.add(1, "Intruso");

		// TODO sakar todos los elementos de la lista de colecciones
		System.out.println("Dato despues de modificar la posicion 0");
		System.out.println(al);

		al.remove(0);

		System.out.println(al);

		Iterator<String> i = al.iterator();

		// devuelve el segundo elemento
		System.out.println(i.next());

		// devuelve un true si ai otro
		System.out.println(i.hasNext());

		// muestra todos los elementos del arrayL
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// System.out.println(Integer.toBinaryString(-6));
		// System.out.println(String.format("%16s", Integer.toBinaryString(-6 >> 2)));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >>> 2)));

	}

}