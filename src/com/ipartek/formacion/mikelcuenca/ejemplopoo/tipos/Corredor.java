package com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos;

public class Corredor implements Runnable {// extends Thread {

	int dorsal, posicion;
	boolean seguirCorriendo = true;

	public Corredor(int dorsal) {
		this.dorsal = dorsal;
	}

	public void parar() {
		seguirCorriendo = false;
	}

	public int getPosicion() {
		return posicion;

	}

	public int getDorsal() {
		return dorsal;
	}

	public void run() {
		for (posicion = 0; posicion < 10 && seguirCorriendo; posicion++) {
			System.out.println("DENTRO " + dorsal + ": " + posicion);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {

			}
		}
	}
}
