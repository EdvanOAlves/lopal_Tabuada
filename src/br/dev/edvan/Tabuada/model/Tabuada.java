package br.dev.edvan.Tabuada.model;

public class Tabuada {
	// Declarando variáveis
	private double multiplicando;
	private double multiplicadorMinimo;
	private double multiplicadorMaximo;
//	private double intervalo;

	// Constructor
	public Tabuada(double multiplicando, double multiplicadorMinimo, double multiplicadorMaximo) {
		setMultiplicando(multiplicando);
		setMultiplicadorMinimo(multiplicadorMinimo);
		setMultiplicadorMaximo(multiplicadorMaximo);
//		setIntervalo(intervalo);

	}

	// set e get do multiplicando
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	// set e get do multiplicadorMinimo
	public void setMultiplicadorMinimo(double multiplicadorMinimo) {
		this.multiplicadorMinimo = multiplicadorMinimo;
	}

	public double getMultiplicadorMinimo() {
		return multiplicadorMinimo;
	}

	// set e get do multiplicadorMaximo
	public void setMultiplicadorMaximo(double multiplicadorMaximo) {
		this.multiplicadorMaximo = multiplicadorMaximo;
	}

	public double getMultiplicadorMaximo() {
		return multiplicadorMaximo;
	}

	// get e set do intervalo

//	public double getIntervalo() {
//		return intervalo;
//	}
//
//	public void setIntervalo(double intervalo) {
//		this.intervalo = intervalo;
//	}

	// Retornar a tabuada com os cálculos
	public String[] mostrarTabuada() {
		if (multiplicadorMinimo > multiplicadorMaximo) {
			double troca = multiplicadorMinimo;
			multiplicadorMinimo = multiplicadorMaximo;
			multiplicadorMaximo = troca;
		}
		
		int tamanhoTabuada = (int) (multiplicadorMaximo - multiplicadorMinimo +1);
		String[] tabuada = new String[tamanhoTabuada];

//		System.out.println("===========================");
//		System.out.println("TABUADA DO " + multiplicando);
//		System.out.println("---------------------------");

		double produto;
		int i = 0;
		while (i < tamanhoTabuada) { // loop
			produto = multiplicando * multiplicadorMinimo; //Cálculo
			tabuada[i] = (multiplicando + " X " + multiplicadorMinimo + "=" + produto);
			multiplicadorMinimo++;
			i++;

		}
		return tabuada;
	}
	

}
