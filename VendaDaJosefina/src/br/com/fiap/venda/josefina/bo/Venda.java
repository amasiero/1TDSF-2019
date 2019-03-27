package br.com.fiap.venda.josefina.bo;

public class Venda {

	private String vendedor;
	private Produto produto;
	private String cliente;

	public Venda(String vendedor, Produto produto, String cliente) {
		this.vendedor = vendedor;
		this.produto = produto;
		this.cliente = cliente;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	

}
