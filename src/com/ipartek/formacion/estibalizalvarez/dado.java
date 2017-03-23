package com.ipartek.formacion.estibalizalvarez;

public class dado {

	public static void main(String[] args) {
		//TUDU Buscar en google como general un numero Aleatorio.
		//variable entera para numeros
		int numeroAleatorio =1;
		
		/*Varialbe de tipo Array para guardar la lista de voluntarios los arrays comienzan en 0 siempre.
		 * En este caso inicializamos el array con 4 nombres de tipo string*/
		
		String[] aVoluntarios= {
						"manolo",//posicion 0
						"juan",//posicion 1
						"Manolito",//posicion 2
						"paloma"// posicion 3
		};
		//guardar en una valable tipo string una posicion del array
		String voluntario = aVoluntarios[numeroAleatorio];
		
		//mostramos por connsola la persona voluntaria
		System.out.println("El voluntario es:" + voluntario );
		
		System.out.println("");
		// TODO Auto-generated method stub

	}

}
