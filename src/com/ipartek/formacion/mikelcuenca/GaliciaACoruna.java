package com.ipartek.formacion.mikelcuenca;

public class GaliciaACoruna {

	public static void main(String[] args){
	
		//Declaraci�n de array con todas las playas
		
		String[] aPlayas = {
								"Do�i�os",
								"Orzan",
								"Bastiagueiro",
								"Playa de Pant�n",
								"Barra�an",
								"Playa de Valdovi�o",
								"Santa Cristina",
								"Playa de A Frouxeira",
								"Playa Cano Grande",
								"Playa de Campelo",
								"Playa de Casal",
								"Playa de Ponzos",
								"Playa de Santa Comba",
								"Playa de Esmelle",
								"Playa del Chanteiro ",
								"Playa de Furnas",
								"Matadero",
								"La Derecha (Pant�n)"
			
							};

		System.out.println("");
		System.out.println("Las playas de A Coru�a son:");
		System.out.println("----------------------------------");

		
			for(int i=0; i < aPlayas.length; i++){
				
				System.out.println(i+1 + ". " + aPlayas[i] );

			};
			
							
							
	}
	
}
