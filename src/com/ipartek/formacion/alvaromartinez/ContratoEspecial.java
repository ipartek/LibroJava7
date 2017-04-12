package com.ipartek.formacion.alvaromartinez;

public class ContratoEspecial implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("Cláusula 1 de contrato especial");

	}

	@Override
	public int clausula2(String s) {
		System.out.println("Cláusula 2 :" + s);
		return s.length();
	}

}
