package com.ipartek.formacion.alvaromartinez;

public class ContratoCurioso implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("Esta es una cl�usula curiosa");

	}

	@Override
	public int clausula2(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Me has pasado un texto cuando queria un n�mero");
			// e.printStackTrace();
		}
		return i;
	}
}
