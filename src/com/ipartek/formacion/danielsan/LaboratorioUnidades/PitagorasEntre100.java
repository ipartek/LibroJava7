package com.ipartek.formacion.danielsan.LaboratorioUnidades;

public class PitagorasEntre100 {

	public static void main(String[] args) {
		int cont = 0;
		for (int x = 1; x <= 100; x++) {
			for (int y = 1; y <= 100; y++) {
				for (int z = 1; z <= 100; z++) {
					if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) == z) {
						System.out.println("Los catetos : " + x + " y " + y + " y la hipotenusa " + z + " cumplen el teorema.");
						cont++;
					}
				}
			}
		}
		System.out.println(cont);
	}

}
