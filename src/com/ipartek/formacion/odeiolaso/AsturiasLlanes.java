package com.ipartek.formacion.odeiolaso;

public class AsturiasLlanes {
	
	public static void main(String[] args) {
		
		String[] aPlayas = {
									"Ribadesella", 
									"La Rosca", 
									"Playa De Vidiago", 
									"Playa De Andrín", 
									"Playa De Ballota", 
									"Playa De San Martín", 
									"Playa De Niembro", 
									"Playa De Torimbia", 
									"Playa De San Antolin", 
									"Playa De Santa Marina", 
									"Playa De Vega", 
									"Playa Arenal De Morris", 
									"Playa Espasa"
								};
	
		
		System.out.println("Listado de playas Llanes Asturias:");
		System.out.println("------------------------------------");

		for (int i=0; i < aPlayas.length; i++){
			System.out.println((i+1) + ". " + aPlayas[i]);
		}
		

	}

}
