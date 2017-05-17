package com.ipartek.formacion.javierlete.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 1234);

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // AUTOFLUSH

		System.out.println(br.readLine());
		System.out.println(br.readLine());

		pw.println("Javier Lete");

		System.out.println(br.readLine());

		pw.close();
		br.close();
		s.close();
	}

}
