
public class Conta {
	private Perfil perfil;
	private String plano;
	private String pagamento;
	private String login;
	private String senha;
	
	public Conta(Perfil pPerfil, String pPlano, String pPagamento, String pLogin, String pSenha) {
		perfil = pPerfil;
		plano = pPlano;
		pagamento = pPagamento;
		login = pLogin;
		senha = pSenha;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
