package com.ipartek.formacion.ibonpomares.ejemplopoo.programa;

import com.ipartek.formacion.ibonpomares.ejemplopoo.tipos.Coche;

public class CocheTestChapucero {

	public static void main(String[] args) {
		
		
		
		Coche c1 = new Coche();
		//System.out.println(c1.toString());
		
		Coche ferrari = new Coche("Ferrari", 600);
		//System.out.println(ferrari.toString());
		
		//ferrari.setMarca("FerrariCAMBIADO");
		ferrari.setPotencia(655);
		ferrari.setNuevo(false);
		//System.out.println(ferrari.toString());
		
		
		
		int precio = 0;
		
		Coche c2 = new Coche("BMW", 200 , 3);
		c2.getMarca();
		c2.getPotencia();
		c2.isNuevo();
		c2.getAno();
		c2.getPrecio();
		
		if(c2.getAno() == 0 ){
			
			precio = c2.getPrecio() * 5;
		}else if(c2.getAno() == 1){
			precio = c2.getPrecio() * 3;
		}else if(c2.getAno() >= 2){
			precio = c2.getPrecio() * 1;
		}
		
		
		
		System.out.println("Coche [marca=" + c2.getMarca() + ", potencia=" + c2.getPotencia() + ", nuevo=" + c2.isNuevo() + ", año =" + c2.getAno() + " Precio=" + precio + "]");
		
		
		
		
		
	
	}

}
