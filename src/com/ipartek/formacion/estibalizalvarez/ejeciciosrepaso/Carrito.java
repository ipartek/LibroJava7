package com.ipartek.formacion.estibalizalvarez.ejeciciosrepaso;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Carrito {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void add(Producto producto) {
		productos.add(producto);// añades un producto a la lista de producto.
	}

	// to.string:
	@Override
	public String toString() {
		// String s = "";
		// for (Producto p : productos)
		// s = s + p + "\n";
		// return s; // productos.toString(); es otra forma de ponerlo.
		return toString(SIN_FORMATO);
	}

	public String toString(boolean conFormato) {//
		String s = "";

		for (Producto p : productos)
			// p es una variable.

			s = s + p.toString(conFormato) + "\n";// aqui le dices el producto que tenias le sumas el nuevo.

		return s; // productos.toString(); te devuelve la s.
	}

	// estos son los get de cada variable:
	public int getNumeroDeArticulos() {

		return productos.size();// size: te cuenta el numero de productos que hay en productos.
	}

	public double getPrecioTotal() {
		double precioTotal = 0.0;
		for (Producto p : productos)
			precioTotal += p.getPrecio();

		return precioTotal;
	}

	public BigDecimal getPrecioTotalSeguro() {// Bigdecimal
		BigDecimal precioTotal = new BigDecimal(0.0);// Creas un objeto Bigdecimal.
		for (Producto p : productos)
			precioTotal = precioTotal.add(p.getPrecioSeguro());// add: al elemento precioTotal le quiero sumar PrecioSeguro.

		return precioTotal;
	}

	public final static double IVA = 0.21;// le estas diciendo que el IVA es 21%.

	public double getIvaSobrePrecioTotal() {//
		return getPrecioTotal() * IVA;// multiplica el precio total por el 21% IVA.

	}

	public double getPrecioTotalConIva() {

		return (getPrecioTotal() + getIvaSobrePrecioTotal());
	}

}
