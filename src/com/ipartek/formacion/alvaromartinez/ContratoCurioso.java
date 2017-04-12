package com.ipartek.formacion.alvaromartinez;

public class ContratoCurioso implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("Esta es una cláusula curiosa");

	}

	@Override
	public int clausula2(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Me has pasado un texto cuando queria un número");
			// e.printStackTrace();
		}
		return i;
	}
}
