package com.ipartek.formacion.leiremunarriz;

public class GaliciaEstacaDeBares {

	public static void main(String[] args) {

		
		String [] aGaliciaEstacaDeBares = {"Playa De San Roman", // posicion 0
				  							"Playa De Bares", // posicion 1
				  							"Playa De Picon", // posicion 2
				  							"Playa De Castro", // posicion 3
				  							"Playa De Sarrigal", // posicion 4
				  							"Playa De Eiron", // posicion 5
				  							"Playa De San Anton", // posicion 6
				 						};
		System.out.println("Las Playas de Galicia de Estaca De Bares son: ");
		
				
		for(int i=0;i< aGaliciaEstacaDeBares.length;i++){
			System.out.println((i+1) + ". " + aGaliciaEstacaDeBares[i]);
		}
		//end for

	}

}
