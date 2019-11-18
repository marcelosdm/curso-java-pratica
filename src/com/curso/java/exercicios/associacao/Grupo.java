package com.curso.java.exercicios.associacao;

import java.util.List;

public class Grupo {

	private int id;
	private String descricao;
	private List<Produto> produtos;
	
	public Grupo() {
		
	}

	public Grupo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


}
