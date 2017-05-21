package com.ipartek.formacion.mikelcuenca.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(1234); // esta es la orden de abrir y reservar un puerto

		System.out.println("SERVIDOR A LA ESCUCHA");

		Socket s = ss.accept(); // esta es la orden de aceptar comunicaciones que lleguen a este puerto

		System.out.println("CONEXION RECIBIDA");

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // super importante el true en el autoflush

		pw.println("Bienvenido al servidor MAYUSCULADOR");
		pw.println("Welcome to the MAYUSCULATOR server");
		pw.println("Escribe un texto para que te lo pase a mayúsculas");
		pw.println("Escribe Q para salir");

		String texto = "";

		while (!texto.equalsIgnoreCase("Q")) {

			texto = br.readLine();
			System.out.println("TEXTO RECIBIDO: " + texto);

			pw.println(texto.toUpperCase());

		}
		pw.close();
		br.close();
		s.close();
		ss.close();

	}

}
