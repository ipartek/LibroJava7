package com.ipartek.formacion.joseba.poo.tipospruebas;

import java.util.Date;

import com.ipartek.formacion.joseba.poo.tipos.Persona;

public class PersonaPruebas {

	public static void main(String[] args) {
		// Primero
		Persona p1 = new Persona();

		p1.setId(5);
		p1.setNombre("Joseba");

		System.out.println(String.format("ID: %d,Nombre:%s", p1.getId(), p1.getNombre()));

		// Segundo
		p1 = new Persona(1, "Javier");
		// Tercero

		p1.setFechaNacimiento(new Date("1970/10/20"));

		// Cuarto

		System.out.println(p1.aTexto()); // ID: 1, Nombre: Joseba, Mar Oct 20 00:00:00 CET
											// 1970
	}

}
