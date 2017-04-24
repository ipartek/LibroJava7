package com.ipartek.formacion.odeiolaso.ejemplos;

public class PruebaAndyOr {

	public static void main(String[] args) {

		boolean var;
		var = a() && b();
		System.out.println(var);

		var = b() || a();

		double a, b, c;

		a = 54454656.6546546565;
		b = 65458458344.595495959;
		c = a / b;
		System.out.println(c);
	}

	private static boolean b() {
		System.out.println("En B");
		return true;
	}

	private static boolean a() {
		System.out.println("En A");
		return false;
	}

}
