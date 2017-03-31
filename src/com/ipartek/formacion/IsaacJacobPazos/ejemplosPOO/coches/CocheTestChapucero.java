package com.ipartek.formacion.IsaacJacobPazos.ejemplosPOO.coches;

public class CocheTestChapucero {

	public static void main(String[] args) {
		Coche c = new Coche();
		System.out.println(c.toString());

		Coche ferrari = new Coche("ferrari", 600);
		System.out.println(ferrari.toString());

		ferrari.setPotencia(900);
		ferrari.setNuevo(false);

		System.out.println(ferrari.toString());

		// ..:::::::::EJERCICIO:::::::::..
		// Crear clase nueva:
		// perro.
		// un perro tiene:
		// nombre String necesario
		// raza String def:Birrazas
		// dueño String def:noDueño
		// pulga Boolean def:false
		// Y con su correspondiente test

	}

}
