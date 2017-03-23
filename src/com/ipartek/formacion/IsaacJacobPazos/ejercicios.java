package com.ipartek.formacion.IsaacJacobPazos;

public class ejercicios {

	public static void main(String[] args) {

		// Ejercicio v1: array con las notas de las asignaturas y los nombres.
		// la interfaz se tiene que mostrar asi:
		// --------------------------------------------------------
		// 06/09/2017 UF1465 6.5
		// 21/09/2017 UF1466 8.9
		// 29/09/2017 UF1467 5.0
		// --------------------------------------------------------
		// 08/06/2017 UF2175 7.5
		// 29/06/2017 UF2176 5.0
		// 20/07/2017 UF2177 10.0
		// --------------------------------------------------------
		// 11/04/2017 UF2404 7.5
		// 05/05/2017 UF2405 7.2
		// 26/05/2017 UF2406 8.8
		// --------------------------------------------------------
		// Media x.x
		// NMaxima 10.0
		// NMinima 5.0
		// --------------------------------------------------------
		String[] NombreUnidadesFormativas = { "UF1465", "UF1466", "UF1467",
				"UF2175", "UF2176", "UF2177", "UF2404", "UF2405", "UF2406" }, FechaUnidadesFormativas = {
				"06/09/2017", "21/09/2017", "29/09/2017", "08/06/2017",
				"29/06/2017", "20/07/2017", "11/04/2017", "05/05/2017",
				"26/05/2017" };
		double[] NotasUnidadesFormativas = { 6.5, 8.9, 5.0, 7.5, 5.0, 10.0,
				7.5, 7.2, 8.8 };
		double Media = 0, MasAlta = 0, MasBaja = 10;
		System.out.println("Resumen");
		System.out.println("----------------------------------------");
		for (int i = 0; i < NombreUnidadesFormativas.length; i++) {

			System.out.println(FechaUnidadesFormativas[i] + " => "
					+ NombreUnidadesFormativas[i] + "\t"
					+ NotasUnidadesFormativas[i]);
			// System.out.format("%s => %s \t %s \n",FechaUnidadesFormativas[i],NombreUnidadesFormativas[i],NotasUnidadesFormativas[i]);//Esto
			// aun tengo que probarlo
			// Aqui yo lo haria por metodos separados pero no me voy a adelantar
			// asi que a pelo
			if (NotasUnidadesFormativas[i] > MasAlta) {// calculamos con esto si
														// es la mas alta hasta
														// ahora
				MasAlta = NotasUnidadesFormativas[i];
			}
			if (NotasUnidadesFormativas[i] < MasBaja) {// calculamos con esto si
														// es la mas baja hasta
														// ahora
				MasBaja = NotasUnidadesFormativas[i];
			}
			Media += NotasUnidadesFormativas[i];
			if ((i + 1) % 3 == 0) {
				System.out.println("----------------------------------------");
			}
		}
		Media /= NotasUnidadesFormativas.length;
		System.out.println("La mayor nota conseguida ha sido: " + MasAlta);
		System.out.println("La menor nota conseguida ha sido: " + MasBaja);
		System.out.println("La media de todas las notas ha sido: " + Media);
	}

}
