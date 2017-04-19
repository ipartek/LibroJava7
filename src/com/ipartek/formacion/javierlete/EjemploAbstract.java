package com.ipartek.formacion.javierlete;

public class EjemploAbstract {

	public static void main(String[] args) {
		Number[] numeros = new Number[2];

		// numeros[0] = new Number();
		numeros[0] = new Double(5.3);
		numeros[1] = new Integer(3);

		for (Number numero : numeros)
			System.out.println(numero.doubleValue());
	}

}
