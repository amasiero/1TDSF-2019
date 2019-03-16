
public class Pessoa {
	private String nome;
	private int cpf;
	private int idade;
	
	public Pessoa(String pNome, int pCpf, int pIdade) {
		nome = pNome;
		cpf = pCpf;
		idade = pIdade;
	}
	
	public void setNome(String pNome) {
		nome = pNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(int pCpf) {
		cpf = pCpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setIdade(int pIdade) {
		idade = pIdade;
	}
	
	public int getIdade() {
		return idade;
	}
}
