package br.dev.edvan.Tabuada;

import javax.swing.JFrame;

import br.dev.edvan.Tabuada.model.Tabuada;

public class Main {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada Desenvolvimento de Sistemas 1MA");
		tela.setSize(500, 600);
		tela.setVisible(true);
		
		System.out.println("Hello world!");
		Tabuada tabuada = new Tabuada(7, 25, 15, 1);
		tabuada.mostrarTabuada();

	}
	

}
