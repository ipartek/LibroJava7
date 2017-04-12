package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class RentaSimple {

	public static void main(String[] args) {
		double capital;// creas una variable de tipo double.
		capital = 100.00;// das valor a una variable.
		double interes;// creas una variable de tipo double.
		interes = 5.5;// das valor a una variable.
		double rentasimple;// creas una variable de tipo double.
		rentasimple = capital * interes / 100;// multiplicas el capital por el interes% y resultado va a la variable rentaSimple. el interes se divide entre 100
		System.out.println("Renta Simple: " + rentasimple + "€");

		capital += rentasimple;// le incrementas a capital el valor de rentasimple.
		System.out.println("El nuevo capital es: " + capital);

	}

}
