package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Punto;
import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Punto_Nombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		Punto_Nombre ptn;
		ptn = new Punto_Nombre();

		System.out.println(ptn);

		ptn.setX(5);
		ptn.setY(7);
		ptn.setNombre("Ipartek");

		System.out.println(ptn.getNombre());

		Punto p;
		p = ptn;

		Punto_Nombre ptn2;
		ptn2 = (Punto_Nombre) p;

		System.out.println(ptn2.getNombre());

		Punto pt = new Punto();

		System.out.println(p instanceof Punto_Nombre);
		System.out.println(pt instanceof Punto_Nombre);

		p.setX(2000);
		System.out.println(ptn.getX());

		System.out.println(((Punto_Nombre) p).getNombre());

	}

}
