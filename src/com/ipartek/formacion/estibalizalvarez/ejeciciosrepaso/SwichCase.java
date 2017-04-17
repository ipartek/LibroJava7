package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {
		
	System.out.println("PARA SABER CUANTOS DIAS TIENE EL MES:");
		Scanner teclado=new Scanner(System.in);//pedir datos por teclado.
		int mes;//variable tipo numero entero llamada mes.
		System.out.println("Numero de mes:");
		mes=teclado.nextInt();//para meter por teclado el dato del mes.
		switch(mes){
		case 1:
			System.out.println("Enero tiene 31 dias.");
			break;
		case 2:
			System.out.println("Febrero tiene 28 dias.");
			break;
		case 3:
			System.out.println("Marzo tiene 31 dias.");
			break;
		case 4:
			System.out.println("Abril tiene 30 dias.");
			break;
		case 5:
			System.out.println("Mayo tiene 31 dias.");
			break;
		case 6:
			System.out.println("Junio tiene 30 dias.");
			break;
		case 7:
			System.out.println("Julio tiene 31 dias.");
			break;
		case 8:
			System.out.println("Agosto tiene 31 dias.");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 dias.");
			break;
		case 10:
			System.out.println("Octubre tiene 31 dias.");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 dias.");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 dias.");
			break;
		default:
		System.out.println("El mes introducido no existe. Solo hay 12 meses al año o todavia no te has enterado, jejejejejeje...");
		/*Tambien se puede hacer de otra manera:
		 * swich (mes){
		 *case1: case3: case5: case7: case 8: case 10: case 12:
		 *System.out.println("Este mes tiene 31 dias.");
		 *break;
		 *case4: case 6: case9: case 11:
		 *System.out.println("Este mes tiene 30 dias.");
		 *break;
		 *case 2:
		 *System.out.println("Este mes tiene 28 dias.Excepto cuando es bisiesto tiene 29 dias.")
		 *break;
		 *default:
		 *System.out.println("Ese me no existe, solo hay 12 meses al año o no te has enterado jejejejeje.....")
		 * */
		}//switch.
					
	}//main

}//SwichCase
 