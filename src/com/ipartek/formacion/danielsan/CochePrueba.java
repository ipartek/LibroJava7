package com.ipartek.formacion.danielsan;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Coche;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Rueda;

public class CochePrueba {

	public static void main(String[] args) {
		Coche coche = new Coche();

		Rueda[] ruedas = new Rueda[4];

		for (int i = 0; i < ruedas.length; i++)
			ruedas[i] = new Rueda(15.0, 12.0);

		coche.setRuedas(ruedas);

		System.out.println(coche);
	}

}
