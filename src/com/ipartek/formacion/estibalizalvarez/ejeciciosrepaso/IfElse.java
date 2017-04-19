package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int tallaMayor = 50;
		int tallaMenor = 36;

		System.out.println("Comprobacion de si exite o no la talla deseada.");
		Scanner dato = new Scanner(System.in);//
		System.out.println("Indicame tu talla: ");
		int talla = dato.nextInt();

		if (talla >= tallaMenor && talla <= tallaMayor)// esto es para compara entre dos valores.
			// && es y, >= mayor o igual, <= menor o igual.
			System.out.println("La talla existe.");
		else
			System.out.println("La talla no existe.");

		// Si yo hago dos if me pasa por las dos condiciones y no sabes cual es la correcta.
		// if(talla>=tallaMayor)
		// System.out.println("La talla no existe.");
		// else
		// System.out.println("La talla existe.");
		dato.close();// si dato no lo vas a volver a utilizar lo tienes que cerrar de esta manera.

	}

}
