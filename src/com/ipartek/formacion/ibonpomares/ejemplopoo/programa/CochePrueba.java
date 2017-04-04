package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Coche;
import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Rueda;

public class CochePrueba {

	public static void main(String[] args) {
		
		
		Coche c = new Coche();
		Rueda[] ruedas = new Rueda[4];
		
		for(int i = 0; i < ruedas.length; i++){
			ruedas[i] = new Rueda(15.0,12.0);
			
		}

		c.setRuedas(ruedas);
		
		//ruedas[Coche.DELANTERA_IZQUIERDA] = new Rueda(12.0, 10.0);
		c.setRueda(new Rueda(10.0 , 8.0), c.DELANTERA_DERECHA);
		
		//c.setRuedas();
		
		System.out.println(c.toString());

	}

}
