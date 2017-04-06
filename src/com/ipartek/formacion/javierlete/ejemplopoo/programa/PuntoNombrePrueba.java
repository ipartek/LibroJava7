package com.ipartek.formacion.javierlete.ejemplopoo.programa;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.PuntoNombre;

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

		if (p instanceof PuntoNombre) {
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p;
			System.out.println(ptn2.getNombre());
		}

		Punto pt = new Punto();
		// PuntoNombre ptn3; // = new PuntoNombre();
		// ptn3 = (PuntoNombre) pt;

		// System.out.println(ptn3.getNombre());

		System.out.println(p instanceof PuntoNombre);
		System.out.println(pt instanceof PuntoNombre);

		p.setX(2000);
		System.out.println(ptn.getX());

		System.out.println(((PuntoNombre) p).getNombre());
		// System.out.println((PuntoNombre)p.getNombre());

		System.out.println(((PuntoNombre) p).getNombre());
	}

}
