package com.ipartek.formacion.joseba.poo.tipos;

import javax.swing.JOptionPane;

public class Cochetestchapucero {

	private static char[] precio;

	public static void main(String[] args) {

		Coche c = new Coche();

		System.out.println(c.toString());

		Coche ferrari = new Coche("ferrari", 600);
		System.out.println(ferrari.toString());

		// Cambiar potencia 900 y que no sea nuevo

		ferrari.setNuevo(false);
		ferrari.setPotencia(900);
		System.out.println(ferrari);

		Coche e = new Coche("ferrari", 600);
		System.out.println(JOptionPane.showInputDialog("Cuanta antiguedad tiene el coche?"));

		System.out.println(e.toString());
	}

}
