package com.curso.pratica.model;

public class Endereco {

	private int id;
	private String logradouro;
	private String nome;
	private int numero;
	private String bairro;

	public Endereco(int id, String logradouro, String nome, int numero, String bairro) {
		this.id = id;
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
		this.bairro = bairro;
	}

	public Endereco() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
