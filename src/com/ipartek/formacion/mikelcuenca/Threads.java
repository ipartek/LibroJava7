package com.ipartek.formacion.mikelcuenca;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Corredor;

public class Threads {

	public static void main(String[] args) {

		Corredor corredor1 = new Corredor(1);
		Corredor corredor2 = new Corredor(2);

		Thread t1 = new Thread(corredor1);
		Thread t2 = new Thread(corredor2);

		t1.start(); // corredor1.run();
		t2.start(); // corredor2.run();

		boolean finCarrera = false;

		while (!finCarrera) {
			System.out.println("Corredor " + corredor1.getDorsal() + ": " + corredor1.getPosicion());
			System.out.println("Corredor " + corredor2.getDorsal() + ": " + corredor2.getPosicion());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

			finCarrera = corredor1.getPosicion() >= 9 || corredor2.getPosicion() >= 9;
		}

		corredor1.parar();
		corredor2.parar();

		int ganador = corredor1.getPosicion() >= 9 ? corredor1.getDorsal() : corredor2.getDorsal();

		System.out.println("FIN DE CARRERA");
		System.out.println("Ganador: " + ganador);
	}

}
