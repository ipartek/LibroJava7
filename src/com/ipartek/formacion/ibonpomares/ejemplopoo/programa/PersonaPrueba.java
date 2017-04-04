package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import java.util.Date;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		//PRIMERO
		p1.setId(5);
		p1.setNombre("Ibon");
		
		
		//SEGUNDO
		System.out.println(String.format("ID: %d, NOMBRE:  %s", p1.getId(), p1.getNombre()));
		
		//TERCERO
		p1.setFechaNacimiento(new Date("1970/12/10"));
		
		//CUARTO
		System.out.println(p1.aTexto());  //ID: 1 NOMBRE: Ibon, FECHA
		
		
		
		
		
		
	}

}
