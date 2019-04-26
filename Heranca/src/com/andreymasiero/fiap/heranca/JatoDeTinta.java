package com.andreymasiero.fiap.heranca;

public class JatoDeTinta extends Impressora{

	private boolean cheio = true;
	private int qtdeCartuchos;
	
		
	public JatoDeTinta(String marca, int voltagem, int qtdeCartuchos) {
		super(marca, voltagem);
		this.setQtdeCartuchos(qtdeCartuchos);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo como Jato de Tinta...");
	}
	
	@Override
	public String toString() {
		return "A marca da impressora eh " + this.marca + ". Ela possui "+
				this.qtdeCartuchos + " cartuchos. Sua voltagem eh de " + this.voltagem +
				"v.";
	}

	public int getQtdeCartuchos() {
		return qtdeCartuchos;
	}

	public void setQtdeCartuchos(int qtdeCartuchos) {
		this.qtdeCartuchos = qtdeCartuchos;
	}

	public boolean isCheio() {
		return cheio;
	}

	public void setCheio(boolean cheio) {
		this.cheio = cheio;
	}

}
