package com.ipartek.formacion.josurrutia;

public class Notas {

	private static void ExamenesFechasNotas(){
		float max, min, media= 0;
		
		String[] arrayUF = { "UF1465", "UF1466", "UF1467",
							 "UF2175", "UF2176", "UF2177",
							 "UF2404", "UF2405", "UF2406" };
		
		float[] arrayNotas = { 6.5f, 8.9f, 5.0f,
							   7.5f, 5.0f, 10.0f,
							   7.5f, 7.2f, 8.8f};
		max = arrayNotas[0];
		min = arrayNotas[0];
		
		String[] arrayFechas = {"26/09/2017", "21/09/217", "29/09/2017",
								"08/06/2017", "29/06/2017", "20/07/2017", 
								"11/04/2017", "05/05/2017", "26/05/2017"};
		
		System.out.println("\n\tResumen");
		System.out.println("-------------------------------");
		
		for(int i=0; i<arrayUF.length && i<arrayNotas.length && i<arrayFechas.length; i++){
				System.out.println(arrayFechas[i] + "\t" + arrayUF[i] + "\t " + arrayNotas[i]);
					if(i==2 || i==5 ){
						System.out.println("-------------------------------");
					}	
					media+=arrayNotas[i]; 
					
					if(arrayNotas[i]>max){
						max=arrayNotas[i];  
			        }
			        if(arrayNotas[i]<min){
			        	min=arrayNotas[i];
			        }  
		}
		System.out.println("-------------------------------");
		System.out.println("MEDIA :\t" + Math.round(media/arrayNotas.length));
		System.out.println("Tu nota mas alta es :\t"+max );
		System.out.println("Tu nota mas baja es :\t"+min);
		}
	
	public static void main(String[] args) {
		ExamenesFechasNotas();

	}
}
