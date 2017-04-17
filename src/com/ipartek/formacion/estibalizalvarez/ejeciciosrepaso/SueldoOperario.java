package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);//para introducir datos en pantalla.
		int horasTrabajadas;
		double precioHora;
		double sueldo;
		
		System.out.println("El precio de la hora es: ");
		precioHora=teclado.nextDouble(); //aqui le estas pidiendo directamente el precio de la hora.
		
		
		System.out.println("Horas trabajadas: ");
		horasTrabajadas=teclado.nextInt();//Para que te salga lo que tu has tecleado por pantalla.
		
		sueldo=horasTrabajadas*precioHora;//he hecho la operacion para saber el sueldo.
		System.out.println("Mi sueldo es: "+ sueldo+"€.");//sale el resultado de la operacion anterior recogida en la variable "sueldo".
		
	}//main

}//SueldoOperario
