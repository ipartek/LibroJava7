package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class SuperficieCuadrado {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);//le estoy pidiendo meter datos por pantalla.
		int lado;
		int superficie;
		System.out.println("El lado del cuadrado mide: ");
		lado=teclado.nextInt();//si no haces este paso, a "lado" le tienes que dar valor, ya que con este paso su le pides que introduzca el valor de el lado del cuadrado.
		superficie=lado*lado;
		System.out.println("La superficie del cuadrado es: "+ superficie);
	}

}
//