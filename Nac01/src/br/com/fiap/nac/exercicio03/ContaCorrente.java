package br.com.fiap.nac.exercicio03;

public class ContaCorrente {
	
	private Pessoa titular;
	private int numero;
	private double saldo;
	
	public ContaCorrente(Pessoa titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	public ContaCorrente(Pessoa titular, int numero, double saldo) {
		this(titular, numero);
		this.saldo = saldo;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
