package com.ipartek.formacion.josurrutia;

public class AsturiasGijon {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] GijonPlayas = {"Rodiles", "El Mongol", "Playa Espa�a", "Ensenada De La Conejera",
								"El Faro", "Playa De La Isla", "Playa De La Griega", "Cabo Lastres",
								"R�a De Rodiles", "Playa De La �ora", "Playa De Pe�arrubia",
								"Playa De Cervig�n", "La Roca", "Playa De San Lorenzo",
								"Pico De San Pedro", "Playa De Poniente", "Playa De Xivares",
								"Playa Del Tranqueru", "Playa De Carranques", "Playa De Palemera",
								"La Llastra", "Playa De Luanco", "San Xu�n" };

		
		System.out.println("Listado de todas las playas de Asturias Gijon");
		System.out.println("-------------------------------");
		for(int i=0; i<GijonPlayas.length; i++){
			
			System.out.println(i+1+". "+GijonPlayas[i]);
			
		}
	}

}
