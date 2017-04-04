package com.ipartek.formacion.inakijimenez.tipos;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> carrito = new ArrayList<>();

	public void add(Producto producto) {
		carrito.add(producto);
	}

	@Override
	public String toString() {
		return toString(false);
	}

	public String toString(boolean conFormato) {
		String carro = "";
		for (Producto producto : carrito) {
			carro = carro + producto.toString(conFormato);
		}
		return "Carrito\n" + carro;
	}

	public int getNumeroArticulos() {
		return carrito.size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0.0;
		for (Producto producto : carrito) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public double getIvaSobrePrecioTotal() {
		return getPrecioTotal() * 0.21;
	}

	public double getPrecioTotalConIva() {
		return (getPrecioTotal() + getIvaSobrePrecioTotal());
	}

}
