package com.ipartek.formacion.javierlete.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1234);

		System.out.println("SERVIDOR ARRANCADO");

		Socket s = ss.accept();

		System.out.println("CONEXION RECIBIDA");

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // AUTOFLUSH

		pw.println("Bienvenido al servidor MAYUSCULADOR");
		pw.println("Welcome to MAYUSCULATOR server");

		String texto = br.readLine();

		System.out.println("TEXTO RECIBIDO: " + texto);

		pw.println(texto.toUpperCase());

		pw.close();
		br.close();
		s.close();
		ss.close();
	}

}
