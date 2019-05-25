package com.andreymasiero.fiap.school.bean;

public class Professor extends Pessoa{
	
	private String senha;
	private Turma[] turmas;
	
	public Professor(int id, String nome, String senha) {
		super(id, nome);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}
	
	public boolean validarSenha(String senha) {
		return this.senha.equals(senha);
	}
	
	public void atribuirNota(Estudante estudante, Nota nota) {
		estudante.adicionarNota(nota);
	}
	
	public void cadastrarMaterial(Turma turma, String conteudo) {
		turma.cadastrarMaterial(conteudo);
	}
	
	public String fecharDiario(Turma turma) {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
}






