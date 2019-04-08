package br.com.fiap.exercicio.restaurante;

public class Pedido {
	private String descricao;
	private double valor;
	private boolean pendente;
	
	public Pedido(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
		this.pendente = true;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPendente() {
		return pendente;
	}

	public void setPendente(boolean pendente) {
		this.pendente = pendente;
	}
}











