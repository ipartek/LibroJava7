package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double numero1;
		double numero2;
		String signo;

		do {
			System.out.println("Introduce el primer numero");
			numero1 = Double.parseDouble(sc.nextLine());
			System.out.println("Introduce el segundo numero");
			numero2 = Double.parseDouble(sc.nextLine());
			System.out.println("Introduce la operación a realizar");
			signo = sc.nextLine();

			switch (signo) {
			case "+":
				System.out.println(numero1 + numero2);
				break;
			case "-":
				System.out.println(numero1 - numero2);
				break;
			case "*":
				System.out.println(numero1 * numero2);
				break;
			case "/":
				System.out.println(numero1 / numero2);
				break;
			case "0":
				System.out.println("Gracias");
				break;
			}
		} while (!"0".equals(signo));

		sc.close();
	}
}
