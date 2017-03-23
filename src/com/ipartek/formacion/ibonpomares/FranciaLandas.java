package com.ipartek.formacion.ibonpomares;

public class FranciaLandas {

	public static void main(String[] args) {
		
		int playaAleatoria = (int) (Math.random()*5);
		
		String [] aPlayas = {"Anglet","Hossegor","Berhara Perdun",
				"Playa Milady(Biarriz)","Guetary-Parlamentia"};
		String playaSaleccionada = aPlayas[playaAleatoria];
		
		System.out.println("---------------------------------");
		System.out.println("--Listado de playas de Francia:--");
		System.out.println("---------------------------------");
		
		
		for (int i = 0; i < aPlayas.length; i++) {
			
			System.out.println((i +1 )+". "+ aPlayas[i]);
			
		}
		System.out.println("");
		System.out.println("Numero de playas: " + aPlayas.length);
		System.out.println("Playa aleatoria: " + playaSaleccionada);
		

	}

}
