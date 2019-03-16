
public class TesteEscolinha {

	public static void main(String[] args) {
		Aluno parangaricutirimiruaru = new Aluno();
		parangaricutirimiruaru.cpf = 1231243721;
		// Um jeito
		Endereco endereco = new Endereco();
		endereco.rua ="xpto";
		parangaricutirimiruaru.endereco = endereco;
		
		// Outro jeito
		parangaricutirimiruaru.endereco = new Endereco();
		parangaricutirimiruaru.endereco.rua = "Jose Paulino";
	}
}
