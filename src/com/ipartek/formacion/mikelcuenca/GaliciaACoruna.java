package com.ipartek.formacion.mikelcuenca;

public class GaliciaACoruna {

	public static void main(String[] args){
	
		//Declaración de array con todas las playas
		
		String[] aPlayas = {
								"Doñiños",
								"Orzan",
								"Bastiagueiro",
								"Playa de Pantín",
								"Barrañan",
								"Playa de Valdoviño",
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
								"La Derecha (Pantín)"
			
							};

		System.out.println("");
		System.out.println("Las playas de A Coruña son:");
		System.out.println("----------------------------------");

		
			for(int i=0; i < aPlayas.length; i++){
				
				System.out.println(i+1 + ". " + aPlayas[i] );

			};
			
							
							
	}
	
}
