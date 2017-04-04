package com.ipartek.formacion.ibonpomares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones {

	public static void main(String[] args) {
		
		//ejemploArrayList();
		//ejemploHasSet();
		ejemploHashMap();
		
	}
	
	
	public static void ejemploArrayList() {
		
		//ArrayList<String> al = new ArrayList<String>();
		//se puede hacer de las dos maneras
		ArrayList<String> al;
		al = new ArrayList<String>();
		//introducimos datos a mano
		al.add("Uno");
		al.add("Dos");
		
		
		//System.out.println(al);
		
		Scanner sc;
		sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
		System.out.println("\n Añade algo al ArrayList:");	
		String anadido = sc.next();
		
		al.add(anadido);
		}
		
		
		
		//Este for se recorre el arrayList y muestro sus datos uno a uno
		System.out.println("\n Muestra todos los datos del arraylist");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		//hace lo mismo que el for anterior
//		for(String dato : al){
//			System.out.println(dato);
//		}
		System.out.println("\n Muestrame la posicion 1 del ArrayList");
		//sacar dato en concreo del ArrayList (en este caso la posicion 1)
		System.out.println(al.get(1));
		//cambiar algo que este en una posicion
		al.set(0, "Uno cambiado");
		System.out.println("\n Cambiamos la posicion 0 por otro texto");
		System.out.println(al);
		
		//borrar un dato
		System.out.println("\n Borrado la posicion 2");
		System.out.println(al.remove(2));
		System.out.println(al);
		
		//Introducir un dato en el ArrayList
		System.out.println("\n Introducimos un dato en la posicion 1");
		al.add(1, "Dato introducido");
		System.out.println(al);
		
		
		//iterator
		System.out.println("\n Utilizando iterator() para mostrar todos los datos del arrayList");
		
		//nos muestra el contenido del arraylist
		Iterator<String> it = al.iterator();

		while (it.hasNext()){
			System.out.println(it.next());
		}

		
	}
		
	
		private static void ejemploHasSet() {
			
			HashSet<String> hs = new HashSet<String>();
		
			hs.add("Primero");
			hs.add("Segundo");
			hs.add("Tercero");
		
			System.out.println(hs);
		
		}

		private static void ejemploHashMap() {
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			// Versiones anteriores a Java 5    ===>>>  hm.put("UNO", new Integer(1));
			//el texto es la clave
			hm.put("UNO", 1);
			hm.put("CINCO", 5);
		
			System.out.println(hm);
			//MUESTRAME EL VALOR, DE CLAVE "CINCO"  (Mostrara 5)
			System.out.println(hm.get("CINCO"));
		
			System.out.println("HASHMAP DICCIONARIO");
			HashMap<String, String> diccionario = new HashMap<String, String>();
			diccionario.put("casa", "home");
			diccionario.put("perro", "dog");
			diccionario.put("coche", "car");
			
			System.out.println(diccionario.get("casa"));
			
			
			
			final int INGLES = 0, EUSKERA = 1;
			
			System.out.println("HASHMAP DICCIONARIO2");
			HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();
			diccionario2.put("casa", new String[]{"home","etxea"});
			diccionario2.put("perro", new String[]{"dog","txakurra"});
			
			System.out.println(diccionario2.get("perro")[EUSKERA]);
			System.out.println(diccionario2.get("perro")[INGLES]);
			System.out.println(diccionario.get("perro"));
			
			
			
			
			
			HashMap<String, HashMap<Integer, String>>  diccionario3 = new HashMap<String, HashMap<Integer,String>>();
			HashMap<Integer, String> traducciones = new HashMap<Integer, String>();
			
			traducciones.put(INGLES, "dog");
			traducciones.put(EUSKERA, "txakurra");
			diccionario3.put("perro", traducciones);
			
			traducciones = new HashMap<Integer, String>();
			
			traducciones.put(INGLES, "home");
			traducciones.put(EUSKERA, "etxea");
			diccionario3.put("casa", traducciones);
			
			System.out.println(diccionario3.get("casa").get(INGLES));
			
			
			String[] idiomas = new String[] {"Ingles", "Euskera"};
			
			for (String palabraOrigen: diccionario3.keySet()) {
				System.out.println(palabraOrigen.toUpperCase());
				
				for(Integer idioma : diccionario3.get(palabraOrigen).keySet()){
					System.out.println(String.format("%s: %s", idiomas[idioma], diccionario3.get(palabraOrigen).get(idioma)));
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
}
