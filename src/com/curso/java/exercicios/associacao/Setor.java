package com.curso.java.exercicios.associacao;

public class Setor {

	private int id;
	private String descricao;
	private String telefone;
	private Loja loja;
	
	public Setor() {
		
	}

	public Setor(int id, String descricao, String telefone) {
		this.id = id;
		this.descricao = descricao;
		this.telefone = telefone;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
