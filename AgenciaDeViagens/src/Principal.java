import java.util.Scanner;

import br.com.fiap.viagem.bo.Viagem;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu destino: ");
		String destino = scan.nextLine();
		
		Viagem v = new Viagem(destino);
		System.out.println("Seu destino eh " + v.getDestino());
		
		Viagem v2 = new Viagem("Praga");
		System.out.println("Seu destino eh " + v2.getDestino());
		
		scan.close();
	}
}