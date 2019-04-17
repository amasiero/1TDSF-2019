package com.andreymasiero.fiap.valet.bean;

public class Veiculo {
	private String placa;
	private String modelo;
	private String marca;
	
	public Veiculo(String placa, String modelo, String marca) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
