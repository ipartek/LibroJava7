package com.ipartek.formacion.mikelcuenca.ejerciciosdellibro;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiculoPrueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		String modelo = "";
		do {
			System.out.println("Introduce el modelo del veh�culo. Si escribes\n\"Fin\" finalizar� el programa e imprimir� los modelos introducidos");

			modelo = sc.nextLine();

			if (!modelo.equals("Fin")) {

				vehiculos.add(new Vehiculo(modelo));
			}

		} while (!modelo.equals("Fin"));

		sc.close();

		for (Vehiculo v : vehiculos) {
			System.out.println(v.imprimir());
		}

	}
}
