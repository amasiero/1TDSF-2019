import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Perfil p = new Perfil("Jamiroquai", 35);
		Scanner s = new Scanner(System.in);
		String facebook = s.nextLine();
		p.setFacebook(facebook);
		System.out.println(p.getFacebook());
		s.close();
	}

}
