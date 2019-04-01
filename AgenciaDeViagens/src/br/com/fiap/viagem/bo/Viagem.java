package br.com.fiap.viagem.bo; 

public class Viagem {
	private String destino;
	int dias;
	double preco;
	
	public Viagem(String destino) {
		this.destino = destino;
	}
	
	public Viagem(String destino, int dias) {
		this(destino);
		this.dias = dias;
	}
	
	public Viagem(String destino, int dias, double preco) {
		this(destino, dias);
		this.preco = preco;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getDestino() {
		return destino;
	}
}








