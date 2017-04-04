package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;


import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Empresa1;
import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Persona;

public class EmpresaPrueba {

	public static void main(String[] args) {
		
		
		Empresa1 ipartek;
		//ipartek = new Empresa1("ipartek", new Persona(1, "Ibon"));
//creamos un director para despues `pasarselo
		Persona director = new Persona(1,"Ibon");
		ipartek = new Empresa1("ipartek", director);

		System.out.println(ipartek);
		
		ipartek.getDirector().setNombre("Cambio de nombre de direcctor");

		System.out.println(ipartek);

		Persona directorNuevo = new Persona(2, "Segundo director");

		ipartek.setDirector(directorNuevo);
		System.out.println(ipartek.getDirector().getNombre().toUpperCase());
		
		
		ipartek.setPersonaJunta(director, 0);
		ipartek.setPersonaJunta(directorNuevo, 1);

		System.out.println(ipartek.getPersonaJunta(1).getNombre());
		System.out.println(ipartek);
		
		
		ipartek.addPersona(new Persona(3, "Desconocido"));
		ipartek.addPersona(new Persona(4, "Pepote"));
		ipartek.addPersona(new Persona(4, "Manolo"));
		
		System.out.println(ipartek);
		
	}

}
