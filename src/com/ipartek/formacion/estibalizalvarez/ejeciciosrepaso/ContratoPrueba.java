package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

public class ContratoPrueba {// programa.

	public static void main(String[] args) {
		Contrato c;//
		c = new ContratoEspecial();//

		c.clausula1();// esta llamando a la clausula 1 de contrato especial.
		System.out.println(c.clausula2("Prueba"));// aqui llama a la clausula 2 de contrato especial, y te imprime el texto prueba y clausula 2, y en la clausula 2 te devuelve la longitud de el String s que es prueba.

	}

}
