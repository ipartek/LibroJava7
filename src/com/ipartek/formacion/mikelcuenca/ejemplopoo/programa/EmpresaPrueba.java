package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {

		Empresa empresaGenerica = new Empresa(2, 3);

		System.out.println(empresaGenerica);

		empresaGenerica.nombrarJunta();

		System.out.println(empresaGenerica);

		System.out.println(empresaGenerica.getDirector().getNombre());

		empresaGenerica.setPersonaJunta(1, new Persona(16, "Mikel"));

		System.out.println(empresaGenerica);
		System.out.println(empresaGenerica.getJunta()[1].getNombre());
	}

}
