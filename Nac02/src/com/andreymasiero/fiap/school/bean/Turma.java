package com.andreymasiero.fiap.school.bean;

public class Turma {
	
	private String codigo;
	private Professor professor;
	private Estudante[] estudantes;
	private String[] materiais;
	private int posMateriais = -1;
	private int posEstudantes = -1;
	
	public Turma(String codigo) {
		this.codigo = codigo;
		this.materiais = new String[10];
	}
	
	public Turma(String codigo, int capacidadeMateriais) {
		this(codigo);
		this.materiais = new String[capacidadeMateriais];
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public String[] getMateriais() {
		return materiais;
	}

	public void setMateriais(String[] materiais) {
		this.materiais = materiais;
	}
	
	public void calcularTodasMedias() {
		// for(int i = 0; i < estudantes.length; i++) {
		// 		Estudante e = estudantes[i];
		for (Estudante e : estudantes) { // forEach
			e.calcularMedia();
		}
	}
	
	public double calcularMediaGeral() {
		double mediaGeral = 0.0;
		
		for (Estudante e : estudantes) {
			mediaGeral += e.getMedia();
		}
		
		return mediaGeral / (posEstudantes + 1);
	}
	
	public void adicionarEstudante(Estudante estudante) {
		this.estudantes[++posEstudantes] = estudante;
	}
	
	public Estudante removerPorRm(int rm) {
		// TODO: implementar o método removerPorRm
		return null;
	}
	
	public void cadastrarMaterial(String material) {
		this.materiais[++posMateriais] = material;
	}
	
	public Estudante[] listarEstudantes() {
		return estudantes;
	}
}




