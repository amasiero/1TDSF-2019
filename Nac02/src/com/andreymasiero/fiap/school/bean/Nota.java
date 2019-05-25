package com.andreymasiero.fiap.school.bean;

public class Nota {
	private double valor;
	private int peso;
	
	public Nota(double valor) {
		this.setValor(valor);
		this.setPeso(1);
	}
	
	public Nota(double valor, int peso) {
		this(valor);
		this.setPeso(peso);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
