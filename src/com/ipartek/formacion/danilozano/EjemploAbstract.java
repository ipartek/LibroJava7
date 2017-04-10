package com.ipartek.formacion.danilozano;

public class EjemploAbstract {

	public static void main(String[] args) {

		// Number es una clase abtract

		Number[] numeros = new Number[2];// se puede declarar un array
		// numeros[0]=new Number();//no se puede instanciar
		numeros[0] = new Double(5.3);
		numeros[1] = new Integer(3);

		for (Number numero : numeros)
			System.out.println(numero.doubleValue());

	}

}
