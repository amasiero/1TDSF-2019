
public class Conta {
	private String tipo;
	private Pessoa titular;
	private double saldo;
	private String senha;
	private int codigo;
	
	
	public Conta(String pTipo, Pessoa pTitular, String pSenha, int pCodigo) {
		tipo = pTipo;
		titular = pTitular;
		senha = pSenha;
		codigo = pCodigo;
	}
	
	public void setTitular(Pessoa pTitular) {
		titular = pTitular;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
	
	public void setTipo(String pTipo) {
		tipo = pTipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double pSaldo) {
		saldo = pSaldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String pSenha) {
		senha = pSenha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int pCodigo) {
		codigo = pCodigo;
	}
	
}
