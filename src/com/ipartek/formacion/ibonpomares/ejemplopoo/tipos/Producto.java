package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

public class Producto {

	
	private int id;
	private String nombre;
	private Double precio;
	
	
	
	
	public Producto() {
		super();
		
	}
	
	public Producto(int id, String nombre, Double precio) {
		super();
		this.id = 0;
		this.nombre = nombre;
		this.precio = precio;
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
