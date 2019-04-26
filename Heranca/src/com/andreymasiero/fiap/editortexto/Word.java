package com.andreymasiero.fiap.editortexto;

import com.andreymasiero.fiap.heranca.Impressora;
import com.andreymasiero.fiap.heranca.JatoDeTinta;
import com.andreymasiero.fiap.heranca.Laser;
import com.andreymasiero.fiap.heranca.Matricial;

public class Word {
	
	public static void main(String[] args) {
		Impressora[] impressoras = new Impressora[3]; 
		impressoras[0] = new JatoDeTinta("HP", 110, 4);
		impressoras[1] = new Matricial("Brother", 220);
		impressoras[2] = new Laser("Epson", 110);
		
		for(int i = 0; i < impressoras.length; i++) {
//		int i = 0;
//		while(i < impressoras.length) {
			impressoras[i].imprimir();
			System.out.println(impressoras[i].toString());
//			i++;
		}
	
	}
	
}




