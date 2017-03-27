package com.ipartek.formacion.danilozano;

public class figurasAjedrez {

	public static void main(String[] args) {

		String[][] ajedrez = new String[8][8];

		ajedrez[0][0] = "T";
		ajedrez[0][1] = "C";
		ajedrez[0][2] = "A";
		ajedrez[0][3] = "D";
		ajedrez[0][4] = "R";
		ajedrez[0][5] = "A";
		ajedrez[0][6] = "C";
		ajedrez[0][7] = "T";

		ajedrez[7][0] = "T";
		ajedrez[7][1] = "C";
		ajedrez[7][2] = "A";
		ajedrez[7][3] = "R";
		ajedrez[7][4] = "D";
		ajedrez[7][5] = "A";
		ajedrez[7][6] = "C";
		ajedrez[7][7] = "T";

		for (int i = 1; i < 7; i = i + 5) {
			for (int j = 0; j < ajedrez.length; j++) {
				ajedrez[i][j] = "P";
			}
		}
		for (int i = 0; i < ajedrez.length; i++) {
			for (int j = 0; j < ajedrez.length; j++) {
				if (ajedrez[i][j] == null) {
					ajedrez[i][j] = "0";
				}
				System.out.print(ajedrez[i][j]);
			}
			System.out.println();
		}
	}
}
