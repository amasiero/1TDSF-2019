package br.com.fiap.nac.exercicio02;

public class Produto {
	private String descricao;
	private int quantidadeAtual;
	private int quantidadeMinima;
	private int quantidadeMaxima;
	private double precoVenda;
	
	public Produto(String descricao, int quantidadeAtual, int quantidadeMinima, int quantidadeMaxima,
			double precoVenda) {
		this.descricao = descricao;
		this.quantidadeAtual = quantidadeAtual;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeMaxima = quantidadeMaxima;
		this.precoVenda = precoVenda;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	
	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}
	
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
	
	public void setQuantidadeMaxima(int quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
}
