package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.Arrays;

public class Coche {

	public static final int 
			DELANTERA_DERECHA = 0,
			DELANTERA_IZQUIERDA = 1,
			TRASERA_DERECHA = 2,
			TRASERA_IZQUIERDA = 3;
	
	
	
	
	
// atributos
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int ano = 0;
	private int precio = 100;
	
//si ano = 0 el precio del coche es por 5, 500
//si es de 1 año es por 3
//si es >=2 es por 1
	
	private Rueda[] ruedas = new Rueda[4];
	
	public Rueda[] getRuedas(){
	
		return ruedas;
	}
	
	public void setRuedas(Rueda[] ruedas){
		
		this.ruedas = ruedas;
	}	
	
//constructores
	
	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.ano = 0;
		this.precio = 100;
		
	}

	public Coche(String marca, int potencia) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.ano = 0;
		this.precio = 100;
	}
	public Coche(String marca, int potencia, int ano) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.ano = 0;
		this.precio = 100;
	}
	
//geters and seters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
// SALE "IS" POR QUE ES BOOLEAN
	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPrecio() {
		int result = precio;
		
		if (ano <= 0){
			result = precio * 5;
		}
		if (ano == 1){
			result = precio * 3;
		}

		return result;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + ", ano=" + ano + ", precio=" + precio + ", ruedas=" + Arrays.toString(ruedas) + "]";
	}

	
	
//	@Override
//	public String toString() {
//		return "Coche [marca=" + marca + ", potencia=" + potencia + ", nuevo=" + nuevo + ", año =" + ano + " Precio=" + precio + "]";
//	}
	
	//otras funcionalidades
	public void setRueda(Rueda rueda, int posicion){
		
		ruedas[posicion] = rueda;
		
	}

	public Rueda getRueda(int posicion){ 
		return ruedas[posicion];
	}
	
	
	
	
	
	

}
