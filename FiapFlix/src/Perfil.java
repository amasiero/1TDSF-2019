
public class Perfil {
	private String facebook;
	private String instagram;
	private String twitter;
	private String apelido;
	private int idade;
	private byte[] avatar;
	
	public Perfil(String pApelido, int pIdade) {
		apelido = pApelido;
		idade = pIdade;
	}
	
	public void setFacebook(String pFacebook) {
		facebook = pFacebook;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setInstagram(String pInstagram) {
		instagram = pInstagram;
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	public void setTwitter(String pTwitter) {
		twitter = pTwitter;
	}
	
	public String getTwitter() {
		return twitter;
	}
	
	public void setApelido(String pApelido) {
		apelido = pApelido;
	}
	
	public String getApelido() {
		return  apelido;
	}
	
	public void setIdade(int pIdade) {
		idade = pIdade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setAvatar(byte[] pAvatar) {
		avatar = pAvatar;
	}
	
	public byte[] getAvatar() {
		return avatar;
	}
	
}










