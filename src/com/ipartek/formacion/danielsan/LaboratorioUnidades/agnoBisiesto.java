package com.ipartek.formacion.danielsan.LaboratorioUnidades;

import java.util.Scanner;

public class agnoBisiesto {

	private static final String REG_EXP_AGNO = "\\d{1,5}";

	public static void main(String[] args) {
		// Variables y metodos para recojer datos por teclado.
		@SuppressWarnings("resource")
		Scanner agnoIntroducido = new Scanner(System.in);
		int agnoAEstudiar = 0;
		String comprobacionagno;
		boolean bisiestoSiNo;

		do {
			System.out.println("Introduce el año a conprobar.");
			comprobacionagno = agnoIntroducido.nextLine();
			if (!comprobacionagno.matches(REG_EXP_AGNO)) {
				System.out.println("Debes poner un numero entero.");
			} else {
				agnoAEstudiar = Integer.parseInt(comprobacionagno);
			}

		} while (!comprobacionagno.matches(REG_EXP_AGNO));

		// Mandamos el año al metodo que nos reconoce si es bisiesto.
		bisiestoSiNo = getComprobarBisiesto(agnoAEstudiar);
		// Mandamos el año al metodo toString.
		System.out.println(getRespuestasBisiestos(bisiestoSiNo, agnoAEstudiar));
	}

	public static boolean getComprobarBisiesto(int agno) {
		if ((agno % 4 == 0 && !(agno % 200 == 0)) || agno % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String getRespuestasBisiestos(boolean bisiesto, int agnoAEstudiar) {
		if (bisiesto) {
			return "El año " + agnoAEstudiar + " es un año bisiesto.";
		} else {
			return "El año " + agnoAEstudiar + " no es un año bisiesto.";
		}
	}
}
