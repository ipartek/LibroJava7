package com.ipartek.formacion.danielsan;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> Producto = new ArrayList<Producto>();
	private final double IVA=0.21;

	//Constructores
	public Carrito(ArrayList<com.ipartek.formacion.danielsan.Producto> producto) {
		super();
		Producto = producto;
	}
	
	public Carrito() {
		super();
	}


	//Setters y Getters
	public ArrayList<Producto> getProducto() {
		return Producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		Producto = producto;
	}
	
	//Metodos
	public int getNumeroDeArticulos()	{
		return Producto.size();
	}
	public double getPrecioTotal(){
		double Precio=0;
		for(int i=0; i < Producto.size();i++){
			Precio=Precio + Producto.get(i).getPrecio();
		}
		return Precio;
	}
	public double getIvaSobrePrecioTotal(){
		double Precio=getPrecioTotal();
		return Precio*IVA;
	}
	public double getPrecioTotalConIva(){
		double Precio=getPrecioTotal();
		Precio=Precio+(Precio*IVA);
		return Precio;
	}
	public void add (Producto producto)  {
		getProducto().add(producto);
	}
	
	//ToString
	@Override
	public String toString() {
		return "Carrito [Producto=" + Producto + "]";
	}
}
