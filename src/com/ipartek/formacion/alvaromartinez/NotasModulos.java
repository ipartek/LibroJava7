package com.ipartek.formacion.alvaromartinez;

public class NotasModulos {

	public static void main(String[] args) {

		System.out.format("RESUMEN DE NOTAS\n");

		String[] arrayUF = { "UF1465", "UF1466", "UF1467", "UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406",
				"MEDIA", "NOTA MÁXIMA", "NOTA MÍNIMA" };

		float media = 0, maxima = 0, minima = 10;
		float[] arrayNOTAS = { 6.5f, 8.9f, 5.0f, 7.5f, 5.0f, 10.0f, 7.5f, 7.2f, 8.8f };

		for (int i = 0; i < arrayNOTAS.length; i++) {
			System.out.println(i + 1 + "." + arrayUF[i] + ": " + arrayNOTAS[i]);

			media = media + arrayNOTAS[i] / arrayNOTAS.length; // arrayNotas.length;

		}
		System.out.println("MEDIA: " + media);

		for (int i = 0; i < arrayNOTAS.length; i++) {
			if (arrayNOTAS[i] > maxima) {
				maxima = arrayNOTAS[i];
			}

		}
		System.out.println("MÁXIMA NOTA: " + maxima);

		for (int j = 0; j < arrayNOTAS.length; j++) {
			if (arrayNOTAS[j] < minima) {
				minima = arrayNOTAS[j];
			}

		}
		System.out.println("MÍNIMA NOTA: " + minima);
	}
}
