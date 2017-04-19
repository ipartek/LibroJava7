package com.ipartek.formacion.javierlete;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;

public class Ficheros {

	public static void main(String[] args) {
		objetos();
		texto();
	}

	private static final String FICHERO_OBJETOS = "C:\\JAVA\\objetos.dat";

	public static void objetos() {
		Date d = new Date();

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(FICHERO_OBJETOS));

			oos.writeObject(d);
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (oos != null) {
					oos.flush();
					oos.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println(e.getMessage());
			}
		}

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream(FICHERO_OBJETOS));

			Date d2 = (Date) ois.readObject();

			System.out.println(d2);
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra la clase");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println(e.getMessage());
			}
		}

	}

	private static final String FICHERO = "C:\\JAVA\\ejemplo.txt"; // "C:\nuevos\trabajos.txt";

	public static void texto() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(FICHERO);

			pw.println("Uno");
			pw.println("Dos");

		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
		} finally {
			pw.flush();
			pw.close();
			pw = null;
		}

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FICHERO));

			String linea;

			while ((linea = br.readLine()) != null)
				System.out.println(linea);

		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
			}
			br = null;
		}
	}

}
