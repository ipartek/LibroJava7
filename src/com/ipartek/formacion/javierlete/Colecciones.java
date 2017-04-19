package com.ipartek.formacion.javierlete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class Colecciones {

	// https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

	public static void main(String[] args) {
		// ejemploArrayList();
		// ejemploHashSet();
		// ejemploHashMap();
		// ejemploStack(); //PILAS
		// ejemploQueue(); //COLAS
		ejemploTreeMap();
	}

	private static void ejemploTreeMap() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1, "Uno");
		tm.put(3, "Tres");
		tm.put(2, "Dos");

		System.out.println(tm.get(2));

		for (int i : tm.keySet())
			System.out.printf("%d, %s\n", i, tm.get(i));
	}

	@SuppressWarnings("unused")
	private static void ejemploQueue() {
		Queue<String> cola = new LinkedList<String>();

		cola.offer("Primero");
		cola.offer("Segundo");
		cola.offer("Tercero");

		System.out.println(cola.poll());
		System.out.println(cola.peek());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
	}

	@SuppressWarnings("unused")
	private static void ejemploStack() {
		Stack<String> pila = new Stack<String>();

		pila.push("Primer plato");
		pila.push("Segundo plato");
		pila.push("Tercer plato");

		System.out.println(pila.pop());
		System.out.println("Echamos un vistazo " + pila.peek());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
	}

	@SuppressWarnings("unused")
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

		System.out.println(diccionario.get("Perro"));

		final int INGLES = 0, EUSKERA = 1;

		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();

		diccionario2.put("Casa", new String[] { "Home", "Etxe" });
		diccionario2.put("Perro", new String[] { "Dog", "Txakur" });

		System.out.println(diccionario2);

		System.out.println(diccionario2.get("Perro")[EUSKERA]);
		System.out.println(diccionario2.get("Perro")[INGLES]);

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakur");

		diccionario3.put("Perro", traducciones);

		traducciones = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Home");
		// traducciones.put(EUSKERA, "Etxe");

		diccionario3.put("Casa", traducciones);

		System.out.println(diccionario3.get("Casa").get(INGLES));

		String[] idiomas = new String[] { "Inglés", "Euskera" };

		for (String palabraOrigen : diccionario3.keySet()) {
			System.out.println(palabraOrigen.toUpperCase());

			for (int idioma : diccionario3.get(palabraOrigen).keySet())
				System.out.println(String.format("%s: %s", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));
		}

	}

	@SuppressWarnings("unused")
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

	public static void ejemploArrayList() {
		ArrayList<String> al; // String[] arr;
		al = new ArrayList<String>(); // arr = new String[TAMAÑO];

		al.add("Uno"); // arr[ULTIMO+1] = "Uno";
		al.add("Otro"); // arr[ULTIMO+1] = "Otro";

		System.out.println("Colección inicial");

		for (String dato : al)
			// for(String dato: arr)
			System.out.println(dato); // System.out.println(dato);

		System.out.println("\nDato de la posición 1");
		System.out.println(al.get(1)); // System.out.println(arr[1]);

		al.set(0, "Cambiado"); // arr[0] = "Cambiado";

		System.out.println("\nModificar la posición 0");

		System.out.println(al);

		al.add(1, "Intruso");

		System.out.println("\nInsertar en la posición 1");

		System.out.println(al);

		al.remove(0);

		System.out.println(al);

		Iterator<String> i = al.iterator();

		while (i.hasNext())
			System.out.println(i.next());

		String[] arr = al.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));

		// System.out.println(Integer.toBinaryString(-6));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >> 2)));
		// System.out.println(String.format("%32s", Integer.toBinaryString(-6 >>> 2)));
	}
}
