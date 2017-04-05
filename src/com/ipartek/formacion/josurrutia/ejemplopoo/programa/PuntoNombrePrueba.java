package com.ipartek.formacion.josurrutia.ejemplopoo.programa;

import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.josurrutia.ejemplopoo.tipos.PuntoNombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		// declarar variable
		PuntoNombre ptn;
		// crear objeto
		ptn = new PuntoNombre();

		System.out.println(ptn);

		ptn.setX(5);
		ptn.setY(7);

		ptn.setNombre("Ipartek");

		System.out.println(ptn.getNombre());

		Punto p;
		p = ptn;

		// p.getNombre();
		// System.out.println(p);

		if (p instanceof PuntoNombre) {
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p;
			System.out.println(ptn2.getNombre());
		}

		System.out.println(((PuntoNombre) p).getNombre());

		Punto pt = new Punto();
		PuntoNombre ptn3;
		// ptn3 = (PuntoNombre) pt;

		// System.out.println(ptn3.getNombre());

		System.out.println(p instanceof PuntoNombre);
		System.out.println(pt instanceof PuntoNombre);

		p.setX(2000);
		System.out.println(ptn.getX());

	}
}
