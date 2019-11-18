package com.curso.java.exercicios.associacao;

import java.util.List;

public class Loja {

	private int id;
	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	private List<Produto> produtos;
	private List<Setor> setores;

	public Loja() {

	}

	public Loja(int id, String cnpj, String razaoSocial) {
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public Loja(int id, String cnpj, String razaoSocial, Endereco endereco, List<Produto> produtos,
			List<Setor> setores) {
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.produtos = produtos;
		this.setores = setores;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
