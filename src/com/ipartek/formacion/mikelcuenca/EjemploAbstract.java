package com.ipartek.formacion.mikelcuenca;

public class EjemploAbstract {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Number numero; // se puede declarar pero no instanciar
		Number[] numeros;
		numeros = new Number[2]; // se puede declarar e inicializar el array, no los elementos
		numeros[0] = new Double(5.3);
		numeros[1] = new Integer(3);

		// numeros[0] = new Number(); da error porque no se puede instanciar una clase abstracta.

		for (Number n : numeros) {
			System.out.println(n.intValue());
			System.out.println(n.doubleValue());
		}
	}

}
