package br.dev.edvan.Tabuada;

import javax.swing.JFrame;

import br.dev.edvan.Tabuada.gui.TelaTabuada;
import br.dev.edvan.Tabuada.model.Tabuada;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela("Tabuada DS1MA");
	}
	

}
