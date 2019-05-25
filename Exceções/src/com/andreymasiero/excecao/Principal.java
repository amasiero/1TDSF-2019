package com.andreymasiero.excecao;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void metodo2() {
		System.out.println("Iniciando método 2...");
		int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		try {
			for(int i = 0; i <= 10; i++) System.out.println(v[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finalizando método 2...");
	}

	public static void metodo1() {
		System.out.println("Iniciando método 1...");
		metodo2();
		System.out.println("Finalizando método 1...");
	}

	public static void main(String[] args) throws FiapException, SQLException {
		System.out.println("Iniciando método main...");
//		metodo1();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if (x < y) throw new FiapException("X não pode ser maior que Y.");
		System.out.println("Finalizando método main...");
	}
}





