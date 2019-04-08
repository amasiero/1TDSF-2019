package br.com.fiap.exercicio.restaurante;

public class Mesa {
	private String cliente;
	private Pedido ultimoPedido;
	private double valorTotal;

	public Mesa(String cliente, Pedido ultimoPedido) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
		this.valorTotal = ultimoPedido.getValor();
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

	// Regras de Negocio

	public void registrarPedido(Pedido pedido) {
		this.ultimoPedido = pedido;
		this.valorTotal = this.valorTotal + pedido.getValor();
	}

	public void entregarPedido() {
		this.ultimoPedido.setPendente(false);
	}

	public String fecharConta() {
		if (this.ultimoPedido.isPendente()) {
			// A condição acima pode ser realizada da seguinte maneira (this.ultimoPedido.isPendente() == false)
			// Porém, não esqueça de inverter os códigos dos blocos para continuar com o mesmo comportamento
			return "O pedido " + this.ultimoPedido.getDescricao() + " estah pendente.";
		} else {
			String relatorio = "Obrigado " + this.cliente + "\n";
			// O sinal de mais igual executa a mesma operação do código abaixo
			// relatorio = relatorio + "O valor da sua conta eh R$ " + this.valorTotal;
			relatorio += "O valor da sua conta eh R$ " + this.valorTotal + "\n";
			relatorio += "A taxa sugerida de serviço eh R$ " + (this.valorTotal * 0.1);
			return relatorio;
		}

	}
}
