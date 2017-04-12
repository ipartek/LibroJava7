package com.ipartek.formacion.danielsan.LaboratorioUnidades;

public class NumerosDivisibles3y7 {

	public static void main(String[] args) {
		int suma = 0;
		for (int x = 100; x <= 150; x++) {
			if (x % 3 == 0 && x % 7 == 0) {
				System.out.print(x + " ");
				suma += x;
			}
		}
		System.out.println();
		System.out.println(suma);
	}

}
