package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Producto {

	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	
	private int id;
	private String nombre;
	private double precio;
	
	private BigDecimal precioSeguro;
	
	
	public BigDecimal getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(BigDecimal precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	public Producto() {
		super();
		
	}
	
	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		setPrecio(precio);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		setPrecioSeguro(new BigDecimal(precio));
		String textoPrecio = String.format("%.2f", precio);
		textoPrecio = textoPrecio.replace(',','.');
		BigDecimal bdPrecio = new BigDecimal(textoPrecio);
		setPrecioSeguro(bdPrecio);
	}
	
	
	@Override
	public String toString() {
		//return String.format("\nProducto Id= " + id + ", Nombre= " + nombre + ", Precio= " + precio + " €");
		return toString(SIN_FORMATO);
	}
	
	public String toString(boolean conFormato) {
		if(conFormato){
		return String.format("Id: %3d, %-30s %10.2f", id , nombre, precio);
		}else{
			return "\n Id= " + id + ", Nombre= " + nombre + ", Precio= " + precio + " €";
		}		
	
	}	
	
	
	
}
