package com.ipartek.formacion.alvaromartinez.ejemploPOO;

import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Empresa;
import com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;
		ipartek = new Empresa("Ipartek", new Persona(1,
				"�lvaro Mart�nez Albal�"));

		ipartek.setDireccion("Calle: Los Mimbres, 10�,1�B");
		ipartek.setPoblacion("Bilbao");

		System.out.println(ipartek);

		// System.out.println(ipartek.getDirector().getNombre().toUpperCase());

	}

}
