package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Arrays;

import com.ipartek.formacion.ibonpomares.ejemplopoo.programa.CarritoPrueba;

public class Carrito {

	
	private Double precioTotal;
	private Double ivaSobrePrecioTotal;
	private Double precioTotalConIva;
	private int numeroDeArticulos;
	
	
	public Carrito() {
		super();
		
	}

	public Carrito(int id,String nombre, Double precio) {
		super();
		
	}
	
	public Carrito(Double precioTotal, Double ivaSobrePrecioTotal, Double precioTotalConIva, int numeroDeArticulos, Producto[] producto) {
		super();
		this.precioTotal = precioTotal;
		this.ivaSobrePrecioTotal = ivaSobrePrecioTotal;
		this.precioTotalConIva = precioTotalConIva;
		this.numeroDeArticulos = numeroDeArticulos;
		this.producto = producto;
	}



	
	ArrayList<Producto> aProductos = new ArrayList<Producto>();
	
	private Producto[] producto = new Producto[3];
	
	public Producto[] getProductos(){
	
		return producto;
	}
	

	public void setProductos(Producto[] producto){
		
		this.producto = producto;
	}

	public Double getPrecioTotal() {
		
		for (int i = 0; i < aProductos.size(); i++) {
			//
			//precioTotal += producto.;
		}
		
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Double getIvaSobrePrecioTotal() {
		return ivaSobrePrecioTotal;
	}

	public void setIvaSobrePrecioTotal(Double ivaSobrePrecioTotal) {
		this.ivaSobrePrecioTotal = ivaSobrePrecioTotal;
	}

	public Double getPrecioTotalConIva() {
		return precioTotalConIva;
	}

	public void setPrecioTotalConIva(Double precioTotalConIva) {
		this.precioTotalConIva = precioTotalConIva;
	}

	public int getNumeroDeArticulos() {
		return numeroDeArticulos;
	}

	public void setNumeroDeArticulos(int numeroDeArticulos) {
		this.numeroDeArticulos = numeroDeArticulos;
	}

	
	public void addProducto(int id, String nombre, Double precio) {
		
//		ArrayList<Producto> aProductos = new ArrayList<Producto>();
//		 aProductos.add(addProducto(id, nombre, precio));

	}
	
	public void add(Producto producto) {
		
		 aProductos.add(producto);
		
	}	

	@Override
	public String toString() {
		return "Carrito [precioTotal=" + precioTotal + ", ivaSobrePrecioTotal=" + ivaSobrePrecioTotal + ", precioTotalConIva=" + precioTotalConIva + ", numeroDeArticulos=" + numeroDeArticulos
				+ ", producto=" + Arrays.toString(producto) + "]";
	}

		
	
	
	
	
	
	
}
