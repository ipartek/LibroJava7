package com.ipartek.formacion.danilozano.ejemplopoo.programa;

import com.ipartek.formacion.danilozano.Persona;
import com.ipartek.formacion.danilozano.ejemplopoo.tipos.Empresa;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;
		Persona director = new Persona(1, "javier lete");
		ipartek = new Empresa("ipartek", director);
		System.out.println(ipartek);
		System.out.println(ipartek.getDirector().getNombre());
	}

}
