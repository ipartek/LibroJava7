package com.ipartek.formacion.odeiolaso.ejemplopoo.programa;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.Coche;

public class CocheTestTxapuzero {

	public static void main(String[] args) {

		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("Ferrari", 600);
		System.out.println(ferrari.toString());

		ferrari.setPotencia(900);
		ferrari.setNuevo(false);
		System.out.println(ferrari);
	}

}
