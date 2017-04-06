package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.PuntoNombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {

		PuntoNombre ptn;
		ptn = new PuntoNombre();

		System.out.println(ptn);

		ptn.setX(5);
		ptn.setY(7);
		ptn.setNombre("Ipartek");

		System.out.println(ptn.getNombre());

		Punto p;
		p = ptn; // porque todo PuntoNombre es un Punto

		// p.getNombre();

		PuntoNombre ptn2;
		ptn2 = (PuntoNombre) p; // casteo porque todo Punto
								// no es un PuntoNombre

		System.out.println(ptn2.getNombre());

		// Punto p2 = new Punto();
		//
		// ptn2 = (PuntoNombre) p2;
		//
		// System.out.println(ptn2.getNombre());

		Punto pt = new Punto();
		@SuppressWarnings("unused")
		PuntoNombre ptn3; // = new PuntoNombre();
		// ptn3 = (PuntoNombre) pt;
		//
		// System.out.println(ptn3.getNombre());

		System.out.println("Es p una instancia de PuntoNombre? " + (p instanceof PuntoNombre));
		System.out.println("Es p una instancia de PuntoNombre? " + (pt instanceof PuntoNombre));

		p.setX(2000);
		System.out.println(ptn.getX());

		System.out.println(((PuntoNombre) p).getNombre());// ojo a los paréntesis.
		// tiene prioridad el operador punto sobre el casteo.

		if (p instanceof PuntoNombre) {
			System.out.println((ptn2.getNombre()));
		}
	}

}
