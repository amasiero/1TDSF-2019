
public class Aluno {
	
	private String nome;
	private int cpf;
	private int rm;
	private Endereco endereco;
	
	public Aluno(String pNome, int pCpf, int pRm) {
		nome = pNome;
		cpf = pCpf;
		rm = pRm;
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
	
	public void setRm(int pRm) {
		rm = pRm;
	}
	
	public int getRm() {
		return rm;
	}
	
	public void setEndereco(Endereco pEndereco) {
		endereco = pEndereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

}
