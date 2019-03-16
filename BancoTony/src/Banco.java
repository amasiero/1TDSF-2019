
public class Banco {
	private int numero;
	private String nome;
	private Conta conta;
	
	public Banco(int pNumero, String pNome, Conta pConta) {
		numero = pNumero;
		nome = pNome;
		conta = pConta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int pNumero) {
		numero = pNumero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String pNome) {
		nome = pNome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta pConta) {
		conta = pConta;
	}
	
}
