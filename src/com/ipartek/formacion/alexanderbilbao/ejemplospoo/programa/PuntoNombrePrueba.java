package com.ipartek.formacion.alexanderbilbao.ejemplospoo.programa;

import com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.alexanderbilbao.ejemplopoo.tipos.PuntoNombre;

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

		Object o = ptn;

		System.out.println(ptn instanceof Object); // SIEMPRE ES TRUE

		// System.out.println(o.toString());
		// System.out.println(ptn.toString());
		System.out.println(o);
		System.out.println(ptn);

		Object otro = new Punto(1, 2);
		System.out.println(otro);

		otro = new PuntoNombre();
		System.out.println(otro);

		Punto pt1 = new Punto(5, 7);
		Punto pt2 = new Punto(3, 2);

		Punto total = Punto.sumar(pt1, pt2); // pt1.sumar(pt2);
		Punto total2 = pt1.sumar(pt2);

		System.out.println(total);
		System.out.println(total2);

		System.out.println(pt2.sumar(pt2));

		// PuntoNombre puntoNombre = new PuntoNombre(2, 4, "Javi");
	}

}
