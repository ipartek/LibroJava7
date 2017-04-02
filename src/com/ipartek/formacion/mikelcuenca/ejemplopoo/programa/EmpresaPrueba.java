package com.ipartek.formacion.mikelcuenca.ejemplopoo.programa;

import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Empresa;
import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Persona;
import com.ipartek.formacion.mikelcuenca.ejemplopoo.tipos.Trabajador;
import javax.swing.*;

public class EmpresaPrueba {

	public static void main(String[] args) {

		Empresa empresaGenerica = new Empresa(JOptionPane.showInputDialog("Introduce el nombre de una empresa"));

		System.out.println(empresaGenerica);
		
		Empresa empresa2 = new Empresa(JOptionPane.showInputDialog("Introduce el nombre de otra empresa"));
		
		System.out.println(empresa2);

		int numeroMiembrosJunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de miembros de la junta de " + empresa2.getNombre()));
		
		for (int i = 0; i < numeroMiembrosJunta; i++){
			
			empresa2.addPersonaJunta(new Persona(JOptionPane.showInputDialog("Introduce el nombre del miembro de la junta número " + (i+1) + " de " + empresa2.getNombre())));
			
		}
		
		empresa2.setDirector(new Persona(JOptionPane.showInputDialog("Introduce el nombre del director de " + empresa2.getNombre())));
		
		int numeroInicialTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de trabajadores de " + empresa2.getNombre()));		
		
		for (int i = 0; i < numeroInicialTrabajadores; i++) {
			
			empresa2.addTrabajador(new Trabajador(JOptionPane.showInputDialog("Introduce el nombre del trabajador número " + (i+1) + " de " + empresa2.getNombre())));
			
		}
		
		System.out.println(empresa2);
			
	}

}
