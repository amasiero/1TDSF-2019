package com.andreymasiero.fiap.textos;

import java.util.Scanner;

public class Texto {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		Scanner scan = new Scanner(System.in);
		String nomeCompleto = scan.nextLine();
		String[] nomes = nomeCompleto.split(",");
		String primeiroNome = nomes[0];
		System.out.println("Bom dia, " + primeiroNome);
		scan.close();
		
//		String texto = "O rato roeu a roupa do rei de roma";
//		int pPosicao = texto.toUpperCase().indexOf("R");
//		int uPosicao = texto.toUpperCase().lastIndexOf("R");
//		System.out.println(pPosicao);
//		System.out.println(uPosicao);
//		 
//		String[] palavras = texto.split(" ");
//		int registro = 0;
//		while (registro < palavras.length) {
//			System.out.println(palavras[registro]);
//			registro++;
//		}
//		
//		String pedaco = texto.toUpperCase().substring(uPosicao);
//		System.out.println(pedaco);
//		String maisUmPedaco = texto.substring(pPosicao, uPosicao);
//		System.out.println(maisUmPedaco);
//		
//		String
		
		
//		String palavra1 = "Java";
//		System.out.println(palavra1);
//		
//		String palavra2 = "eh Muito Legal!";
//		System.out.println(palavra2);
//		
//		String fraseCompleta = palavra1 + " " + palavra2;
//		System.out.println(fraseCompleta);
//		
//		fraseCompleta += "\nYup!!!!";
//		System.out.println(fraseCompleta);
//		
//		palavra1 = palavra1.concat(" ").concat(palavra2);
//		System.out.println(palavra1);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(palavra1);
//		sb.append("\t|\t");
//		sb.append(palavra2);
//		String stringConstruida = sb.toString();
//		System.out.println(stringConstruida);
		
		
		
	}
}
