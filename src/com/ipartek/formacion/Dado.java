package com.ipartek.formacion;

public class Dado {

	public static void main(String[] args) {
		
		//TODO buscar en google como generar numero aleatorio
		// variable entera para numeros
		int numeroAletario = (int) (Math.random()*3);
		
		/*
		 * varible de tipo Array para guardar la lista de voluntarios.
		 * Los arrays comienzan por la posicion 0 siempre.
		 * En este caso inicializamos el array con 4 nombres de tipo String 
		 * 
		 * */
		String[] aVoluntarios = {
									"Manolo",  // posicion 0
									"Juan",    // posicion 1
									"Manolito",// posicion 2
									"Paloma"   // posicion 3
								};		
		
		//guardar en una variable tipo String una posicion del Array
		String voluntario = aVoluntarios[numeroAletario];
		
		//mostramos por consola la persona voluntaria
		System.out.println("El volutario es:" + voluntario );
		
		System.out.println("");
		System.out.println("Listado de Voluntarios:");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i < aVoluntarios.length; i++){
			
			System.out.println( (i+1) + ". " + aVoluntarios[i]  );
		}
		//end for
		
		
		
		
		
		

	}

}
