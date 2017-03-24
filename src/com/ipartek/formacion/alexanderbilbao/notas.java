package com.ipartek.formacion.alexanderbilbao;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float maxinota = 0;
		float minnota = 10;
		String[] uf = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2178", "UF2179", "UF2180" };
		float[] notas = { 6.5f, 8.9f, 5.0f, 7.5f, 5.0f, 10, 7.5f, 7.2f, 8.8f };
		String[] fecha = { "11/04/2017", "05/05/2017", "26/05/2017", "08/06/2017", "29/06/2017", "20/07/2017", "06/09/2017", "21/09/2017", "29/09/2017"

		};
		int cont = 1;
		float media3 = 0;
		float mediacompleta = 0;
		for (int i = 0; i < uf.length; i++) {

			System.out.printf(fecha[i] + "\t");
			System.out.printf(uf[i] + "\t");
			System.out.println(notas[i]);

			if (notas[i] > maxinota) {
				maxinota = notas[i];
			}

			if (notas[i] < minnota) {
				minnota = notas[i];
			}
			media3 = media3 + notas[i];
			mediacompleta = mediacompleta + notas[i];
			if (cont == 3) {
				System.out.println("La nota media es: ");
				System.out.println(media3 / 3);
				cont = 0;
				media3 = 0;
			}

			cont++;
		}
		System.out.println("La nota media total es: " + mediacompleta / 9);
		System.out.println("La nota mas alta es: " + maxinota);
		System.out.println("La nota mas baja es: " + minnota);
		// System.out.println("La nota media es: " + intmedia2);

	}

}
