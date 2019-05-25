package com.andreymasiero.fiap.school.bean;

public class Estudante extends Pessoa{
	
	private Nota[] notas;
	private double media;
	private int posicao = -1;
	
	public Estudante(int rm, String nome) {
		super(rm, nome);
		this.notas = new Nota[2];
	}

	public int getRm() {
		return id;
	}

	public void setRm(int rm) {
		this.id = rm;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		this.calcularMedia();
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public int menorNota() {
//		if (this.notas[0].getValor() < this.notas[1].getValor()) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		return this.notas[0].getValor() < this.notas[1].getValor() ? 0 : 1;
	}
	
	public boolean estahAprovado() {
		return this.media >= 6;
	}
	
	public void calcularMedia() {
		double somaDasNotas = 0.0;
		int somaDosPesos = 0;
		for (int i = 0; i < this.notas.length; i++) {
			Nota n = notas[i];
			somaDasNotas += (n.getPeso() * n.getValor());
			somaDosPesos += n.getPeso();
		}
		
		this.setMedia(somaDasNotas / somaDosPesos); 
	}
	
	public void adicionarNota(Nota novaNota) {
		this.notas[++posicao] = novaNota;
	}
	
}










