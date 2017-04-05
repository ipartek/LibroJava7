package com.ipartek.formacion.danilozano;

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

	private static void ejemploArrayList() {
		System.out.println("*****ARRAYLIST*****");
		// arraylist (importar java.util.ArrayList)
		ArrayList<String> al;// declarar variable de tipo string
		al = new ArrayList<String>();// arraylist al creada
		al.add("uno");// Un elemento añadido dentro del arraylist
		al.add("otro");// Se pueden añadir todos los elementos que queramos...

		System.out.println("coleccion inicial");
		for (String dato : al)
			// Recorrer la coleccion
			System.out.println(dato);

		System.out.println("\ndato de la posicion 1");
		System.out.println(al.get(1));// obtener un elemento de la coleccion en
										// este caso el de la posicion 1
		System.out.println("\ndato posicion 0 despues de modificarlo");
		al.set(0, "cambiado");// cambiamos el elemento 0 de lacoleccion
		System.out.println(al.get(0));// y mostramos el cambio por pantalla

		System.out.println(al);// Mostrar los datos del arraylist

		al.add(1, "intruso");// insertar en la posicion 1 un elemento
		System.out.println("\nisertamos elemento en la posicion 1");
		System.out.println(al);

		al.remove(0);// borrar elemento en la posicion 0
		System.out.println("\nborrar el elemento 0");
		System.out.println(al);

		System.out.println("\ncreamos un iterador");
		Iterator<String> i = al.iterator();// crear un iterador

		// System.out.println(i.next());// con next muestra el siguiente
		// System.out.println(i.hasNext());// hasnext pregunta si tiene
		// siguiente

		while (i.hasNext())
			// mostrar todo el arraylist preguntando si tiene siguiente

			System.out.println(i.next());

	}

	private static void ejemploHashSet() {
		HashSet<String> hs = new HashSet<String>();// Declarar y crear un
													// hashSet

		hs.add("uno");
		hs.add("dos");
		hs.add("uno");
		// el hasset no permite elementos iguales, si hay alguno lo ignora
		System.out.println(hs);

	}

	private static void ejemploHashMap() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();// crear y
																		// declarar
																		// un
																		// hashmap
		hm.put("uno", 1);// meter elementos en hashmap, primero la clave y luego
							// el valor
		hm.put("cinco", 5);
		System.out.println(hm);

		System.out.println(hm.get("cinco"));// pedir el valor de la clave
											// "cinco"
		// ejemplo diccionario
		HashMap<String, String> diccionario = new HashMap<String, String>();

		diccionario.put("casa", "Home");
		diccionario.put("perro", "dog");

		System.out.println(diccionario);
		final int Ingles = 0, Euskera = 1;
		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();
		// diccionario con resultados en array
		diccionario2.put("casa", new String[] { "home", "etxe" });
		diccionario2.put("perro", new String[] { "dog", "txakur" });

		System.out.println(diccionario2.get("perro")[Euskera]);
		System.out.println(diccionario2.get("perro")[Ingles]);
		// diccionario con hashmap dentro de otro hashmap

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();

		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();

		traducciones.put(Ingles, "dog");
		traducciones.put(Euskera, "txakur");

		traducciones = new HashMap<Integer, String>();

		traducciones.put(Ingles, "home");
		traducciones.put(Euskera, "etxe");

		diccionario3.put("casa", traducciones);
		diccionario3.put("perro", traducciones);

		System.out.println(diccionario3.get("casa").get(Ingles));
		System.out.println(diccionario3.get("perro").get(Ingles));

		// usar el for
		String[] idiomas = new String[] { "Ingles", "Euskera" };

		for (String palabraorigen : diccionario3.keySet()) {
			System.out.println(palabraorigen.toUpperCase());

			for (int idioma : diccionario3.get(palabraorigen).keySet())
				System.out.println(String.format("%s: %s", idiomas[idioma], diccionario3.get(palabraorigen).get(idioma)));
		}

	}

}
