package com.ipartek.formacion.danilozano.ejemplopoo.programa;

import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.danilozano.ejemplopoo.tipos.PuntoNombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		// Herencias

		PuntoNombre ptn;// deja declarar variable de la clase con herencia
		ptn = new PuntoNombre();// deja crear una variable

		System.out.println(ptn);

		ptn.setX(5);// deja modificar los valores heredados desde la clase
					// puntonombre.
		ptn.setY(7);
		ptn.setNombre("Ipartek");

		System.out.println(ptn.getNombre());

		// ////////////////////////////////////////////////////
		// /////////ejemplos//////////////////////
		// ///////////////////////////////////////////////////
		Punto p;// se crea variable referenciandola clase punto
		p = ptn;

		// p.getNombre(); no funciona porque hace referencia a punto y
		// en la clase punto no hay metodo getNombre.estaria en puntonombre.
		// las herencias se hacen hacia arriba

		if (p instanceof PuntoNombre) {// se utiliza para ejecutar solo si esta
										// instanciado
			PuntoNombre ptn2;// se crea nueva variable
			ptn2 = (PuntoNombre) p;// se hace cast para decir en que clase esta.
			System.out.println(ptn2.getNombre());// ahora si funciona porque
		} // puntonombre si tiene metodo
			// getNombre

		Punto pt = new Punto();
		PuntoNombre ptn3;
		// ptn3 = (PuntoNombre) pt;
		// System.out.println(ptn3.getNombre());//no funciona

		System.out.println(p instanceof PuntoNombre);// se utiliza para
														// preguntar si es
														// instancia de esa
														// clase
		System.out.println(pt instanceof PuntoNombre);//

		p.setX(2000);// se modifica la x desde la variable p
		System.out.println(ptn.getX());// se muestra el cambio llamando la x
										// desde la variable ptn

	}

}
