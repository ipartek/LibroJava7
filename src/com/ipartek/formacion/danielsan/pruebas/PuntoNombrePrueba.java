package com.ipartek.formacion.danielsan.pruebas;

import com.ipartek.formacion.danielsan.Punto;
import com.ipartek.formacion.danielsan.PuntoNombre;

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
		p = ptn;

		// p.getNombre();
		System.out.println("Paso" + p);

		if (p instanceof PuntoNombre) {
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p;
			System.out.println(ptn2.getNombre());
			System.out.println(ptn2);
		}

		Punto pt = new Punto();
		// PuntoNombre ptn3;
		// ptn3 = (PuntoNombre) pt; // ¡¡¡MAAAAL!!!
		// System.out.println(ptn3.getNombre());

		System.out.println(p instanceof PuntoNombre);
		System.out.println(pt instanceof PuntoNombre);

		System.out.println(ptn.getX());
		p.setX(2000);
		System.out.println(ptn.getX());

		System.out.println(((PuntoNombre) p).getNombre());

	}

}
