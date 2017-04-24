package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

public class Prueba2 implements Driveable {

	public boolean startEngine() {
		if (notTooCold)
			engineRunning = true;

	}

	public void stopEngine() {
		engineRunning = false;
	}

	public float accelerate(float acc) {

	}

	public boolean turn(Direction dir) {

	}

}
