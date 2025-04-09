package br.dev.edvan.Tabuada.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	//
	//					ATRIBUTOS
	//
	
	//Comunicação com o usário e Inputs
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private String tituloDaTela;
	
	//Botões para executar os métodos
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	//Exibição e navegação dos resultados
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	
	//
	//					MÉTODOS
	//
	
	public void criarTela(String tituloDaTela) {
		//recebebendo os atributos
		this.tituloDaTela= tituloDaTela;
		
		//Instanciando e configurando o JFrame
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false); 
		
		
		//Criando referencias para os Bounds
		int labelX = 5;
		int labelWidth = 150;
		
		int textX = 195; 
		int textWidth = 50;
		
		//Criando text labels para a janela
		tela.setLayout(null);
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(labelX, 20, labelWidth, 30);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Multiplicador Mínimo:");
		labelMinMultiplicador.setBounds(labelX, 60, labelWidth, 30);
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Multiplicador Máximo:");
		labelMaxMultiplicador.setBounds(labelX, 100, labelWidth, 30);
		
		
		//Criando text fields para a janela
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(textX, 20, textWidth, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(textX, 60, textWidth, 30);

		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(textX, 100, textWidth, 30);
		
		
		//Criando botões para a janela
		buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBounds(labelX, 150, 100, 50);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds ((textX-50), 150, 100, 50);
		
		//Obtendo referência do Container
		Container container = tela.getContentPane();
		
		//Adicionando elementos na janela
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		
		
		//tornando a tela visível
		tela.setVisible(true);
	}
	
	private void exibirTabuada() {
		
	}

	private void limparTabuada() {
		
	}

}
