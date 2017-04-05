package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.PuntoNombre;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		PuntoNombre ptn;
		ptn = new PuntoNombre();
		
		System.out.println(ptn);
		
		ptn.setX(6);
		ptn.setY(3);
		
		ptn.setNombre("Ipartek");
		ptn.setNombre(ptn.getNombre());
		
		
		Punto p;
		p = ptn;
		//p.getNombre();
		
		if(p instanceof PuntoNombre){
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p;
			System.out.println(ptn2.getNombre());
		}
		
		
		Punto pt = new Punto();
		
		//PuntoNombre ptn3;
		//ptn3 = (PuntoNombre) pt;
		
		//System.out.println(ptn3.getNombre());
		
	
		System.out.println(pt instanceof PuntoNombre);
		
		
		p.setX(2000);
		System.out.println(ptn.getX());
		
		//considera la "p" de la clase Punto, de PuntoNombre
		System.out.println((((PuntoNombre)p).getNombre()));
	}

}
