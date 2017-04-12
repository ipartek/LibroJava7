package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

public class ContratoCurioso implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("¡QUE CURIOSO!");
	}

	@Override
	public int clausula2(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Se ha recibido texto, y se ha devuelto el valor 0");
		}
		return i;
	}

}
