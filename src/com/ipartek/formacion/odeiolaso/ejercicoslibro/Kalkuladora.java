package com.ipartek.formacion.odeiolaso.ejercicoslibro;

import java.math.BigDecimal;
import java.util.Scanner;

public class Kalkuladora {

	public static void main(String[] args) {

		BigDecimal num1 = new BigDecimal(0), num2 = new BigDecimal(0), resultado = new BigDecimal(0);
		double resulDiv = 0.0;
		char operador = 'x';
		String repetir, textue;
		int coma = 0;

		Scanner sc = new Scanner(System.in);

		fglobal: for (int i = 0; true;) {
			switch (i) {
			case 0:

				System.out.println("Introduce un numero :");

				try {
					textue = sc.nextLine();
					for (int j = 0; j < textue.length(); j++) {
						if (textue.trim().charAt(j) == '.')
							coma = textue.length() - j;
					}
					num1 = new BigDecimal(textue);

					i = 1;
				} catch (NumberFormatException e) {
					System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN NUMERO!!!!!!!");
				}

				break;
			case 1:

				System.out.println("Introduce un otro numero :");

				try {
					textue = sc.nextLine();
					for (int j = 0; j < textue.length(); j++) {
						if (textue.trim().charAt(j) == '.' && coma < j)
							coma = textue.length() - j;
					}

					num2 = new BigDecimal(textue);

					i = 2;
				} catch (NumberFormatException e) {
					System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN NUMERO!!!!!!!");
				}

				break;
			case 2:

				System.out.println("Introduce un el operador (+,-,*,/):");

				try {
					operador = sc.nextLine().trim().charAt(0);

					if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
						System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN OPERADOR VALIDO!!!!!!!");
					} else {
						i = 3;
					}
				} catch (NumberFormatException e) {
					System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN OPERADOR VALIDO!!!!!!!");
				}

				break;
			case 3:
				try {
					if (operador == '+') {
						resultado = sumar(num1, num2);
					} else if (operador == '-') {
						resultado = restar(num1, num2);
					} else if (operador == '*') {
						resultado = multiplicar(num1, num2);
					} else if (operador == '/') {
						resultado = dividir(num1, num2);
					} else {
						System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡HIJO DE PUTA TE VOY A MATARRRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					}

					i = 4;
				} catch (ArithmeticException e) {

					// System.out.println(e);
					System.out.println("NUMERO DEMASIADO GRANDE. COMVIRTIENDO A DOUBLE");
					System.out.println("COMVIRTIRENDO... 21%");
					System.out.println("COMVIRTIRENDO... 35%");
					System.out.println("COMVIRTIRENDO... 47%");
					System.out.println("COMVIRTIRENDO... 74%");
					resulDiv = dividirDouble(num1.doubleValue(), num2.doubleValue());
					resultado = new BigDecimal(resulDiv);
					i++;
				} catch (Exception e) {
					System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡HIJO DE PUTA ME QUIERO MORIRRRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println(e);
					i++;
				}

				break;
			case 4:
				// System.out.println(coma);
				// coma = (int) Math.pow(10, coma);
				//
				// System.out.println(coma);
				// if (operador != '/')
				// resultado = (Math.round(resultado * coma)) / coma;

				// if (operador != '/')
				// System.out.println(String.format("%f %s %f = %." + coma + "f", num1, operador, num2, resultado));
				// else
				// System.out.println(String.format("%f %s %f = %f", num1, operador, num2, resultado));

				System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);

				i = 5;
				break;
			default:
				System.out.println("¿Desea hacer otra operacion? (Si/No)");

				repetir = sc.nextLine();

				if (repetir.equals("Si") || repetir.equals("si") || repetir.equals("S") || repetir.equals("s") || repetir.equals("SI") || repetir.equals("Y"))
					i = 0;
				else
					break fglobal;
				break;
			}
		}

		sc.close();

	}

	private static BigDecimal restar(BigDecimal num, BigDecimal resta) {
		return num.subtract(resta);
	}

	private static BigDecimal sumar(BigDecimal sumario, BigDecimal sumaria) {
		return sumario.add(sumaria);
	}

	private static BigDecimal dividir(BigDecimal dividendo, BigDecimal divisor) {
		return dividendo.divide(divisor);
	}

	private static BigDecimal multiplicar(BigDecimal multiplo, BigDecimal multiplicador) {
		return multiplo.multiply(multiplicador);
	}

	private static double dividirDouble(double dividendo, double divisor) {
		return dividendo / divisor;
	}
}
