package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		PuntoNombre ptn;
		ptn = new PuntoNombre();

		System.out.println(ptn);

		ptn.setX(5);// la variable ptn le introduce el valor 5 a la x de punto.
		ptn.setY(7);// la variable ptn le introduce el valor 7 a la y de punto
		ptn.setNombre("Ipartek");// la variable ptn le da valor impartek a la varialbe nombre de puntonombre.

		System.out.println(ptn.getNombre());//

		Punto p;// creas una variable p de la clase Punto.
		p = ptn;// que el valor de ptn pase a p.

		// p.getNombre();

		if (p instanceof PuntoNombre) {// instanceof: instancia. le esta preguntando a P si tiene las caracteristicas de puntonombre.
			PuntoNombre ptn2;// creas una variable ptn2 de puntonombre.
			ptn2 = (PuntoNombre) p;// que p se puede guardar en ptn2 porque p esta dentro de puntonombre. Ya que punto nombre no esta dentro de punto.
			System.out.println(ptn2.getNombre());// pide el nombre de ptn2 que es de puntonombre.
		}

		Punto pt = new Punto();// creas nuevo objeto de punto diferente al anterior punto. nunca puede ser un puntonombre.
		// PuntoNombre ptn3; // = new PuntoNombre();
		// ptn3 = (PuntoNombre) pt;

		// System.out.println(ptn3.getNombre());

		System.out.println(p instanceof PuntoNombre);// si pertenece.
		System.out.println(pt instanceof PuntoNombre);// no es de puntonombre, sino solo de el punto nuevo.

		p.setX(2000);//
		System.out.println(ptn.getX());//

		System.out.println(((PuntoNombre) p).getNombre());//
		// System.out.println((PuntoNombre)p.getNombre());

		System.out.println(((PuntoNombre) p).getNombre());//
	}

}
