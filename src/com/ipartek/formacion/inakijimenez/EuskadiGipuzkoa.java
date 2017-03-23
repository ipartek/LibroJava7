package com.ipartek.formacion.inakijimenez;

public class EuskadiGipuzkoa {

	public static void main(String[] args) {
		
		String [] aPlayas = {
				"Zarautz",
				"Orio",
				"Playa de la Zurriola",
				"Agiti",
				"Fuenterrabia",
				"Itzurun",
				"Playa de Ondarreta (Tenis)",
				"Playa de Ondarreta (Pikua)",
				"Playa de Gaztape",
				"Orrua (Roca Puta)",
				"Playa de San Telmo",
				"Playa de Santiago",
				"Punta Pitxarri",
				"Playa de Karraspio",
				"Playa de la Concha",
				"Deba",
				"Karramarro",		
				
		};
		
		System.out.println("Las playas de Gipuzkoa en Euskadi son: ");
		
		for (int i=0; i < aPlayas.length; i++){
			
			System.out.println((i+1) + ".- " + aPlayas[i]);
			

		}

	}

}
