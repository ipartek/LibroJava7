package com.ipartek.formacion.javierlete.ejemplopoo.programa.abstractos;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.Contrato;
import com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos.ContratoCurioso;

public class ContratoPrueba {

	public static void main(String[] args) {
		Contrato c; // ContratoEspecial c;
		c = new ContratoCurioso(); // new ContratoEspecial();

		c.clausula1();
		System.out.println(c.clausula2("Prueba"));
	}

}
