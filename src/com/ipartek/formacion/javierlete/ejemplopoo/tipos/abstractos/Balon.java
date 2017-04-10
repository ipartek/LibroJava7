package com.ipartek.formacion.javierlete.ejemplopoo.tipos.abstractos;

public class Balon extends ObjetoDeporte implements Rodable {

	@Override
	public void rodar() {
		System.out.println("Balón rodando");
	}

}
