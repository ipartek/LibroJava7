package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.util.Scanner;

public class AgnoBisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un año:");
		int agno = Integer.parseInt(sc.nextLine());
		if (agno % 4 == 0 && agno % 100 != 0) {
			System.out.println(agno + " es un año bisiesto");
		} else if (agno % 400 == 0) {
			System.out.println(agno + " es un año bisiesto");
		} else
			System.out.println(agno + " no es un año bisiesto");

		sc.close();

	}

}
