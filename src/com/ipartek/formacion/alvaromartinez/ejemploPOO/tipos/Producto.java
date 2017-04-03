package com.ipartek.formacion.alvaromartinez.ejemploPOO.tipos;

public class Producto {

	// atributos
	private int id;
	private String articulo;
	private double precio;

	// constructores
	public Producto() {
		super();
		this.setId(0);
		this.setArticulo("NINGÚN ARTÍCULO");
		this.setPrecio(0);
	}

	public Producto(int id, String articulo, double precio) {
		super();
		this.setId(id);
		this.setArticulo(articulo);
		this.setPrecio(precio);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// mostrar producto

	@Override
	public String toString() {
		return "Producto [ id=" + id + ", articulo=" + articulo + ", precio=" + precio + " € ]";
	}

}
