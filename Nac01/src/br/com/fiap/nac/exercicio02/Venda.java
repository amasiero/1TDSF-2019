package br.com.fiap.nac.exercicio02;

public class Venda {

	private Produto produto;
	private int quantidade;
	private double valorVenda;
	
	public Venda(Produto produto, int quantidade, double valorVenda) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
}
