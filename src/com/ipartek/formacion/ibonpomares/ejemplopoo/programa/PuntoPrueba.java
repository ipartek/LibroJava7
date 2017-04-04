package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {
		
		
		Punto pt1;
		pt1 = new Punto();
		
		//pt1.x = 5;
		//pt1.y = 7;
		
		pt1.setX(5);
		pt1.setY(7);
		
		// 						dato1  y dato 2//%s String
//		System.out.println(String.format("P(%d,%d)", pt1.x , pt1.y));
//		System.out.println("P(" + pt1.x + "," + pt1.y + ")");
		
		System.out.println(String.format("P(%d,%d)", pt1.getX() , pt1.getY()));
		System.out.println(String.format("P(%1.2f,%1.2f)", pt1.getXDouble() , pt1.getYDouble()));
		System.out.println("P(" + pt1.getX() + "," + pt1.getY() + ")");
		
		//creamos otro punto de double
		
		Punto pt2 = new Punto();

		pt2.setX(43.234565);
		pt2.setY(-3.234234);
		//                           datod FLOAT POINT (DOUBLE)
		System.out.println(String.format("P(%f,%f)", pt2.getXDouble() , pt2.getYDouble()));
		
		
		Punto pt3 = new Punto();
		
		System.out.println(String.format("P(%f,%f)", pt3.getXDouble() , pt3.getYDouble()));
		
	}

}
