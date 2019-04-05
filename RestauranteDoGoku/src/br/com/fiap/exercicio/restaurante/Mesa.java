package br.com.fiap.exercicio.restaurante;

public class Mesa {
	private String cliente;
	private Pedido ultimoPedido;
	private double valorTotal;
	
	public Mesa(String cliente, Pedido ultimoPedido) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
	}
	
	public Mesa(String cliente, Pedido ultimoPedido, double valorTotal) {
		this(cliente, ultimoPedido);
		this.valorTotal = valorTotal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Pedido getUltimoPedido() {
		return ultimoPedido;
	}

	public void setUltimoPedido(Pedido ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

		public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
