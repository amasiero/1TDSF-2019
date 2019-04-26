package com.andreymasiero.fiap.heranca;

public class Matricial extends Impressora{
	
	public Matricial (String marca, int voltagem) {
		super(marca, voltagem);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo como Matricial...");
	}

}
