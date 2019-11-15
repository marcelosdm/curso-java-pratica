package com.curso.java.associacao;

import java.util.List;

public class Curso {

	private String nome;
	private Faculdade faculdade;
	private List<Aluno> alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Faculdade getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}
