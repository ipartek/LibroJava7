package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Empresa;
import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;
		ipartek = new Empresa("Ipartek", new Persona(1,
				"Álvaro Martínez Albalá"));

		ipartek.setDireccion("Calle: Los Mimbres, 10º,1ºB");
		ipartek.setPoblacion("Bilbao");

		System.out.println(ipartek);

		// System.out.println(ipartek.getDirector().getNombre().toUpperCase());

	}

}
