package com.andreymasiero.fiap.valet.bo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.andreymasiero.fiap.valet.bean.Veiculo;

public class Valet {

	private final double PRECO_BASE = 4;
	private final double PRECO_ADICIONAL = 2.5;
	private final long TEMPO_MINIMO = 3;
	
	private Veiculo veiculo;
	private Date entrada;
	private Date saida;
	private double valor;
	
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Valet(Veiculo veiculo) {
		this.veiculo = veiculo;
		this.entrada = new Date();
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void registrarEntrada(String marca, String modelo, String placa) {
		this.veiculo = new Veiculo(marca, modelo, placa);
		this.entrada = new Date();
	}

	public String registrarEntrada(Veiculo veiculo) {
		this.veiculo = veiculo;
		this.entrada = new Date();
		return this.veiculo.getMarca() + " " + this.veiculo.getModelo() + "\nPlaca: " + this.veiculo.getPlaca()
				+ "\nHorário de Entrada: " + df.format(this.entrada);
	}
	
	public String registrarSaida(Veiculo veiculo) {
		this.saida = new Date();
		this.valor = this.calcularPagamento(this.entrada, this.saida);
		
		return null;
	}
	
	public double calcularPagamento(Date entrada, Date saida) {
		double preco = 0.0;
		
		long tempoPermanecia = (saida.getTime() - entrada.getTime()) / 1000 / 60;
		long horas = tempoPermanecia / 60;
		long minutos = tempoPermanecia % 60;
		
		if (this.temHorasAdicionais(this.qtdeHorasAdicionais(horas))) {
			preco = this.PRECO_BASE;
			preco = preco + this.qtdeHorasAdicionais(horas)  * this.PRECO_ADICIONAL;
			if (minutos > 0) {
				preco = preco + this.PRECO_ADICIONAL;
			}
		} else {
			preco = this.PRECO_BASE;			
		}
		
		return preco;
	}
	
	public long qtdeHorasAdicionais(long horas) {
		return horas - this.TEMPO_MINIMO;
	}
	
	public boolean temHorasAdicionais(long horasAdicionais) {
		return horasAdicionais > 0;
	}


}
