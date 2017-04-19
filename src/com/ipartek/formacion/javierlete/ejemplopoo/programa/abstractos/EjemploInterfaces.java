package com.ipartek.formacion.javierlete.ejemplopoo.programa.abstractos;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.Balon;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.Naranja;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.Rodable;

public class EjemploInterfaces {

	public static void main(String[] args) {
		Rodable[] rodables = new Rodable[2];

		rodables[0] = new Naranja();
		rodables[1] = new Balon();

		for (Rodable rodable : rodables)
			rodable.rodar();
	}
}
