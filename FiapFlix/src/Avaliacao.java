
public class Avaliacao {
	private Perfil perfil;
	private double nota;
	private String comentario;
	
	public Avaliacao(Perfil pPerfil, double pNota, String pComentario) {
		perfil = pPerfil;
		nota = pNota;
		comentario = pComentario;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
