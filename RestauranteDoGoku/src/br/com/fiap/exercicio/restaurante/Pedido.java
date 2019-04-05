package br.com.fiap.exercicio.restaurante;

public class Pedido {
	private String pedido;
	private double valor;
	private boolean pendente;
	
	public Pedido(String pedido, double valor) {
		this.pedido = pedido;
		this.valor = valor;
		this.pendente = true;
	}
	
	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPedidoPendente() {
		return pendente;
	}

	public void setPedidoPendente(boolean pendente) {
		this.pendente = pendente;
	}
}
