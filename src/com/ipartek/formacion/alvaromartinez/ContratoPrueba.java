package com.ipartek.formacion.alvaromartinez;

public class ContratoPrueba {

	public static void main(String[] args) {
		Contrato c1, c2;
		c1 = new ContratoCurioso();
		c2 = new ContratoEspecial();

		c1.clausula1();
		System.out.println(c1.clausula2("H0L4"));

		c2.clausula1();
		System.out.println(c2.clausula2("La mejor cláusula especial"));

	}

}
