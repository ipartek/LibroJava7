package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Coche;

public class CocheTestChapucero {

	public static void main(String[] args) {

		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("Ferrari", 600, 0);
		System.out.println(ferrari.toString());

		ferrari.setPotencia(900);
		ferrari.setNuevo(false);
		System.out.println(ferrari.toString());

	}

}
