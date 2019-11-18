package com.curso.java.exercicios.associacao;

public class Produto {

	private int id;
	private String descricao;
	private long valor;
	private String dataCadastro;
	private String fornecedor;
	private Grupo grupo;
	
	public Produto() {
		
	}

	public Produto(int id, String descricao, long valor, String dataCadastro, String fornecedor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
		this.fornecedor = fornecedor;
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

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
