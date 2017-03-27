package com.ipartek.formacion.danielsan;

public class GaliciaMuros {

	public static void main(String[] args) {
		
		//Array listado de playas
		String[] PlayasGaliciaMuros = {
				" Playa do Rostro",
				" Playa Mar do Fora",
				" Playa de Carnota",
				" Playas de Suresco",
				" Playa de Larino",
				" Playa de Arealonga",
				" Playa Aguieira",
				" Playa de Cabeiro",
				" Playa de Barona",
				"Playa de Queiruga",
				"Playa de Portinos",
				"Rio Sieira"
		};
		
		//Mostramos por consola las playas	
		System.out.println("Listado de playas:");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		
		//for para mostrar la lista
		for (int i=0; i!=PlayasGaliciaMuros.length; i++) {
			System.out.println((i+1) + ". " + PlayasGaliciaMuros[i]);
		}//End FOR

	}

}
