package com.ipartek.formacion.danielsan.LaboratorioUnidades;

public class PrimosMenorDe100 {

	public static void main(String[] args) {
		for (int x = 1, z; x < 100; x++) {
			z = 0;
			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					z = 1;
					break;
				}
			}
			if (z == 0) {
				System.out.print(x + " ");
			}
		}
	}

}
