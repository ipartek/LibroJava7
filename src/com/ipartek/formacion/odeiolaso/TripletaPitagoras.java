package com.ipartek.formacion.odeiolaso;

public class TripletaPitagoras {

	public static void main(String[] args) {

		for (int hipotenusa = 1; hipotenusa <= 25; hipotenusa++) {
			for (int kateto1 = 1; kateto1 < hipotenusa; kateto1++) {
				for (int kateto2 = 1; kateto2 < hipotenusa; kateto2++) {
					// hipo = ((kateto1 * kateto1) + (kateto2 * kateto2)) / hipotenusa;
					if (kateto1 * kateto1 + kateto2 * kateto2 == hipotenusa * hipotenusa)
						System.out.println(hipotenusa + ", " + kateto1 + ", " + kateto2);
				}

			}

		}

	}

}
