package com.ipartek.formacion.joseba.poo.tipos;

public class CochePrueba {

	public static void main(String[] args) {

		Cochenuevo coche = new Cochenuevo();
		Rueda[] ruedas = new Rueda[4];

		for (int i = 0; i < ruedas.length; i++) {
			ruedas[i] = new Rueda(15.0, 12.0);
			System.out.println(ruedas[i]);
		}
		coche.setRuedas(ruedas);
		coche.setNuevo(true);
		coche.setMarca("ferrari");
		coche.setAntiguedad(5);
		coche.setPotencia(400);
		coche.setPrecio(4000);

		ruedas[Cochenuevo.DELANTERA_IZQUIERDA] = new Rueda(12.0, 10.0);

		coche.setRuedas(ruedas);

		coche.setRueda(new Rueda(10.0, 8.0), Cochenuevo.DELANTERA_DERECHA);

		System.out.println(coche.getRueda(Cochenuevo.TRASERA_DERECHA));

		System.out.println(coche);

	}
}
