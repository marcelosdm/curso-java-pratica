package com.curso.java.exercicios.associacao;

public class Endereco {

	private int id;
	private String rua;
	private int numero;
	private String complemento;
	
	public Endereco() {
		
	}

	public Endereco(int id, String rua, int numero, String complemento) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
