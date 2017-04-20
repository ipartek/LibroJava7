package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class ContratoEspecial implements Contrato {// implemanta el contrato

	@Override
	public void clausula1() {// metodo implementado
		// throw new RuntimeExpection("PENDIENTE");// este manera de que esto esta pendiente de hacer.
		System.out.println("Clausula 1 de contrato especial:");

	}

	@Override
	public int clausula2(String s) {// metodo implementado. devuelve un int que recibe un string.
		// throw new RuntimeExpection("PENDIENTE");// el throw interrumpe el metodo.
		System.out.println("Clausula 2:" + s);//
		return s.length();// te devuelve la longitud del string.

	}

}
