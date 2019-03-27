package br.com.fiap.venda.josefina.bo;

public class Produto {

	private String descricao;
	private int quantidade;
	private String unidade;
	private double valor;

	public Produto(String descricao, int quantidade, String unidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



}
