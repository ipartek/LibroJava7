package com.ipartek.formacion.javierlete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploEscritorio {

	public static void main(String[] args) {
		JTextField jtf;
		JButton jb;
		JLabel jl;

		JFrame jf = new JFrame("Prueba");

		JPanel p = new JPanel();

		jf.add(p);

		p.add(jtf = new JTextField(10));
		p.add(jb = new JButton("Saludar"));
		p.add(jl = new JLabel("Resultado"));

		jf.setSize(300, 300);

		jf.setVisible(true);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("Hola, " + jtf.getText());
			}
		});
	}

}
