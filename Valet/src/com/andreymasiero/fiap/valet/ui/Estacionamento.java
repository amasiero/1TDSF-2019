package com.andreymasiero.fiap.valet.ui;

import java.util.Scanner;

import com.andreymasiero.fiap.valet.bean.Veiculo;
import com.andreymasiero.fiap.valet.bo.Valet;

public class Estacionamento {

	public static Valet registrarVeiculo(Valet v, Scanner s) {
		System.out.print("Informe a placa: ");
		String placa = s.next();
		System.out.print("Informe o modelo: ");
		String modelo = s.next();
		System.out.print("Informe a marca: ");
		String marca = s.next();
		Veiculo veiculo = new Veiculo(placa, modelo, marca); 
		
		if(v == null) {
			v = new Valet(veiculo);
		}
		
		System.out.println(v.registrarEntrada(veiculo));
		
		return v;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean controleSistema = true;
		Valet v = null;
		
		while(controleSistema) {
			
			System.out.println("-------------------------");
			System.out.println("Digite: ");
			System.out.println("1 - Registrar Entrada ");
			System.out.println("2 - Registrar Saida ");
			System.out.println("0 - Para Sair ");
			System.out.println("-------------------------");
			
			int opcao = s.nextInt();
			
			if(opcao == 1) {
				System.out.println("Registrando entrada de veiculo");
				v = registrarVeiculo(v, s);
			}else if (opcao == 2) {
				System.out.println("Registrando saida de veiculo");
			}else if (opcao == 0) {
				System.out.println("Finalizando sistema");
				controleSistema = false;
			}else {
				System.err.println("Digite uma opcao valida!");
			}
		}
		
		s.close();
	}
}







