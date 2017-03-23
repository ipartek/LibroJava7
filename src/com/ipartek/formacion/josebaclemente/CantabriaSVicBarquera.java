package com.ipartek.formacion.josebaclemente;

public class CantabriaSVicBarquera {

	public static void main(String[] args) {
		
		String [] playas = {"Playa de Sable",
						  "Playa de Cobreces",
						  "Playa de Oyambre",
						  "Playa de Gerra",
						  "Playa de Meron",
						  "Playa de Linera",
						  "Playa de Tina Menor",
						  "Playa de Mendia"};

	
		System.out.println("Las Playas de Cantabria son:");
	
		for (int i=0; i < playas.length; i++){
		
		System.out.println((i+1)+"." + playas [i]);
		
	}
}
}