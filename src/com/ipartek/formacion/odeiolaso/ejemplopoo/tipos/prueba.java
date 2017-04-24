package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

public class prueba {

	public static void main(String[] args) {
		int valor = 5;
		cambiarValor(valor);
		System.out.println(valor);
	}

	public static void cambiarValor(int valor) {
		valor = valor * 2;
	}

}
