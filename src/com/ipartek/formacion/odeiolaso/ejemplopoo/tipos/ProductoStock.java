package com.ipartek.formacion.odeiolaso.ejemplopoo.tipos;

import java.math.BigDecimal;

public class ProductoStock {

	int id, stock;
	String nombre, descripcion;
	BigDecimal precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " " + nombre + ", " + descripcion + ", " + precio + "€, stock: " + stock + "\n ";
	}

}
