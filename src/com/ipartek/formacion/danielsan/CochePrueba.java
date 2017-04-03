package com.ipartek.formacion.danielsan;

public class CochePrueba {

	public static void main(String[] args) {
		Coche coche = new Coche();

		Rueda[] ruedas = new Rueda[4];

		for (int i = 0; i < ruedas.length; i++)
			ruedas[i] = new Rueda(15.0, 12.0);

		ruedas[Coche.DELANTERA_IZQUIERDA] = new Rueda(12.0, 10.0);

		coche.setRuedas(ruedas);

		coche.setRuedas(new Rueda(10.0, 8.0), Coche.DELANTERA_DERECHA);

		System.out.println(coche.getRueda(Coche.DELANTERA_DERECHA));
		System.out.println(coche.getRueda(Coche.DELANTERA_IZQUIERDA));
		System.out.println(coche.getRueda(Coche.TRASERA_DERECHA));
		System.out.println(coche.getRueda(Coche.TRASERA_IZQUIERDA));
		// System.out.println(coche);
	}
}
