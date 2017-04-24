package com.ipartek.formacion.odeiolaso.ejemplopoo.programa;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeMap;

import com.ipartek.formacion.odeiolaso.ejemplopoo.tipos.ProductoStock;

public class Facturacion {

	public static void main(String[] args) {

		TreeMap<Integer, ProductoStock> productos = new TreeMap<Integer, ProductoStock>();

		Scanner sc = new Scanner(System.in);
		
		int 21variable = 0;

		int idProd = 0, stock;
		String nombre, descripcion, otro;
		BigDecimal precio;

		forglo: for (int i = 0, p = 0, producto = 0; true;) {

			switch (i) {
			case 0:

				try {

					if (p == 0) {
						System.out.println("Introduce el identificador de producto :");

						idProd = Integer.parseInt(sc.nextLine());

						if (productos.get(idProd) == null)
							productos.put(idProd, new ProductoStock());

						productos.get(idProd).setId(idProd);// Preg Como hacdr set aqui

						p = 1;
					} else if (p == 1) {
						System.out.println("Introduce el Nombre de producto :");

						nombre = sc.nextLine();

						productos.get(idProd).setNombre(nombre);
						p = 2;
					} else if (p == 2) {
						System.out.println("Introduce la Descripcion de producto :");

						descripcion = sc.nextLine();

						productos.get(idProd).setDescripcion(descripcion);
						
						p = 3;
					} else if (p == 3) {
						System.out.println("Introduce el Stock de producto :");

						stock = Integer.parseInt(sc.nextLine());

						p = 4;
					} else if (p == 4) {
						System.out.println("Introduce el Precio de producto :");

						precio = new BigDecimal(sc.nextLine());

						productos.get(idProd).setPrecio(precio);
						p = 5;
					} else {

						System.out.println("¿Desea hacer otra operacion? (Si/No)");

						otro = sc.nextLine();

						if (otro.equals("Si") || otro.equals("si") || otro.equals("S") || otro.equals("s") || otro.equals("SI") || otro.equals("Y"))
							p = 0;
						else if (otro.equals("No") || otro.equals("no") || otro.equals("N") || otro.equals("n") || otro.equals("NO"))
							i = 1;
						else
							System.out.println("¡¡¡¡¡¡¡NO TE ENTIENDO HIJO DE PUTA, ESCRIBE ALGO LEGIBLE !!!!!!!");
					}

				} catch (NumberFormatException e) {
					System.out.println("¡¡¡¡¡¡¡NO HAS INTRODUCIDO UN NUMERO!!!!!!!");
				}

				break;
			case 1:
				System.out.println(productos);
				i = 2;
				break;
			case 2:

				break;
			case 3:
				break forglo;

			default:
				break;
			}

		}
		sc.close();
	}
}
