package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

public class ContratoEspecial implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("Cláusula 1 de contrato especial");
	}

	@Override
	public int clausula2(String s) {
		System.out.println("Cláusula2 " + s);
		return s.length();
	}
}
