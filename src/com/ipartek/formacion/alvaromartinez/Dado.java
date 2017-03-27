package com.ipartek.formacion.alvaromartinez;

public class Dado {

	public static void main(String[] args) {
		
		//Variable engtera numero
		int numeroAleatorio = 1;
		/*variable tipo array para guardar la list de los voluntarios.
		 * los arrays comienzan por la posicion 0 siempre.
		 * En este caso inicializamos el array con 4 nombres
		 */
		//guardar en una variable tipo string una posicion del array
		String[] aVoluntarios = {

				"Manolo",	//posicion 0
				"Juan",		//posicion 1
				"Manolito",	//posicion 2
				"Paloma"	//posicion 3
		};
		
		//Mostramos la persona voluntaria		
		String voluntario = aVoluntarios[numeroAleatorio];
		
		System.out.println("El voluntario es: " + voluntario );
		
		
		System.out.println();
		System.out.println();
		//for(int i=0; i< aVoluntarios.length;i++)
		
	}

}
