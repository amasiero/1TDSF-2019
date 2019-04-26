package com.andreymasiero.fiap.heranca;

public abstract class Impressora {

	protected String marca;
	protected int voltagem;

	public Impressora(String marca, int voltagem) {
		this.marca = marca;
		this.voltagem = voltagem;
	}

	public void imprimir() {
		System.out.println("Imprimindo...");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

}
