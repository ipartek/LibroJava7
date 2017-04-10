package com.ipartek.formacion.javierlete;

import java.util.Arrays;

enum Color {
	ROJO(1), VERDE(2), AZUL(3);

	private int i;

	public int getInt() {
		return i;
	}

	private Color(int i) {
		this.i = i;
	}
}

public class Enumeraciones {

	public static void main(String[] args) {
		Color c;
		c = Color.AZUL;
		System.out.println(Arrays.toString(Color.values()));
		System.out.println(c.ordinal());
		System.out.println(c.getInt());
	}

}
