package com.ipartek.formacion.joseba.poo.tipospruebas;

import com.ipartek.formacion.joseba.poo.tipos.Punto;
import com.ipartek.formacion.joseba.poo.tipos.PuntoNombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		PuntoNombre ptn;
		ptn = new PuntoNombre(); // Aqui coge de los dos archivos

		System.out.println(ptn);

		ptn.setX(5);
		ptn.setY(7);
		ptn.setNombre("Ipartek");
		System.out.println(ptn.getNombre());

		Punto p; // Coge los metodos y variables de los archivos de punto
		p = ptn; // Asigna el valor que en este caso son las caracteristicas

		/*
		 * Coge los metodos y variables de los archivos de puntoNombre
		 * 
		 * Coge las opciones de PuntoNombre Como ya tiene las opciones de puntonombre y
		 * puede utilizar el getNombre
		 */

		if (p instanceof PuntoNombre) {
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p;
			System.out.println(ptn2.getNombre());
		}

		Punto pt = new Punto();

		// ptn3 = (PuntoNombre) pt;
		// System.out.println(ptn3.getNombre());
		System.out.println(p instanceof PuntoNombre); /*
													 * Compruebas si tiene las opciones de
													 * PuntoNombre cuando ha hecho el new
													 */
		System.out.println(pt instanceof PuntoNombre);

		p.setX(2000);// Como p ya tiene las caracteristicas de ptn (porque tiene la misma
						// direccion),puedes cambiar los valores de sus variables y
						// remplazar el contenido
		System.out.println(ptn.getX());
	}

}
