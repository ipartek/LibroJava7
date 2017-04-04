package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.ipartek.formacion.ibonpomares.ejemplopoo.programa.CarritoPrueba;

public class Carrito {
	
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	public final static double IVA = 0.21;
	
	private double precioTotal;
	private double ivaSobrePrecioTotal;
	private double precioTotalConIva;
	private int numeroDeArticulos;
	
	
	public Carrito() {
		super();
		
	}

	public Carrito(int id,String nombre, double precio) {
		super();
		
	}
	
	public Carrito(double precioTotal, double ivaSobrePrecioTotal, double precioTotalConIva, int numeroDeArticulos, Producto[] producto) {
		super();
		this.precioTotal = precioTotal;
		this.ivaSobrePrecioTotal = ivaSobrePrecioTotal;
		this.precioTotalConIva = precioTotalConIva;
		this.numeroDeArticulos = numeroDeArticulos;
		//this.producto = producto;
	}



	
	
	
//	private Producto[] producto = new Producto[3];
//	
//	public Producto[] getProductos(){
//	
//		return producto;
//	}
//
//	public void setProductos(Producto[] producto){
//		
//		this.producto = producto;
//	}

	
	public double getPrecioTotal() {
		
		for (int i = 0; i <= aProductos.size(); i++) {
			
			for(Producto p : aProductos) {
				precioTotal +=  p.getPrecio();
			
			}
		
		}return precioTotal;
	}
	
	public String getPrecioTotal(int decimales){
		return String.format("%."+ decimales + "f",getPrecioTotal());
	}

	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getIvaSobrePrecioTotal() {
		
		
		return getPrecioTotal() * IVA;
	}

	public void setIvaSobrePrecioTotal(double ivaSobrePrecioTotal) {
		this.ivaSobrePrecioTotal = ivaSobrePrecioTotal;
	}

	public double getPrecioTotalConIva() {
		
		//return getPrecioTotal() + getIvaSobrePrecioTotal();
		return getPrecioTotal() * (IVA + 1);
	}

	public void setPrecioTotalConIva(double precioTotalConIva) {
		this.precioTotalConIva = precioTotalConIva;
	}

	public int getNumeroDeArticulos() {
		
		//numeroDeArticulos = aProductos.size();
		return aProductos.size();
	}

	public void setNumeroDeArticulos(int numeroDeArticulos) {
		this.numeroDeArticulos = numeroDeArticulos;
	}

	
	public void addProducto(int id, String nombre, double precio) {
		
//		ArrayList<Producto> aProductos = new ArrayList<Producto>();
//		 aProductos.add(addProducto(id, nombre, precio));

	}
	
	
	ArrayList<Producto> aProductos = new ArrayList<Producto>();
	
	public void add(Producto producto) {
		
		 aProductos.add(producto);
		
	}	

	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	
	
	public String toString(boolean conFormato){
//version sin optimizar		
		//1 String s = "";
		StringBuffer sb = new StringBuffer();
		
		for(Producto p : aProductos){
			//1 s = s + p.toString(conFormato) + "\n";	
			//2 s = new StringBuffer(s).append(p.toString(conFormato)).append("\n").toString();//Es igual que la linea anterior
			sb.append(p.toString(conFormato));
			sb.append('\n');
			}
	//1 return s;//"---Carrito--- "+ aProductos.toString();
		return sb.toString();
	}
	
	public String toStringCutre(boolean conFormato){
		//version sin optimizar		
				String s = "";
				StringBuffer sb = new StringBuffer();
				
				for(Producto p : aProductos){
					s = s + p.toString(conFormato) + "\n";	
				
					}
			return s;//"---Carrito--- "+ aProductos.toString();
				
			}
	
	
	
	
}
