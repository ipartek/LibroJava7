package com.ipartek.formacion.javierlete;

import com.ipartek.formacion.javierlete.ejemplopoo.tipos.Corredor;

public class Threads {

	public static void main(String[] args) {
		Corredor c1 = new Corredor(1);
		Corredor c2 = new Corredor(2);

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);

		t1.start(); // c1.run();
		t2.start(); // c2.run();

		boolean finCarrera = false;

		while (!finCarrera) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

			System.out.println("Corredor" + c1.getDorsal() + ": " + c1.getPosicion());
			System.out.println("Corredor" + c2.getDorsal() + ": " + c2.getPosicion());

			finCarrera = c1.getPosicion() >= 9 || c2.getPosicion() >= 9;
		}

		c1.parar();
		c2.parar();

		int ganador = c1.getPosicion() >= 9 ? c1.getDorsal() : c2.getDorsal();

		System.out.println("FIN CARRERA");

		System.out.println("Ganador: " + ganador);
	}
}
