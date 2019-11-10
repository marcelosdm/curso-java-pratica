package com.curso.pratica.controller;

import com.curso.pratica.model.Pessoa;

public class PessoaController {

	/**
	 * Método para impressão de pessoas com responsabilidade de criação
	 */
	public void imprimePessoa() {
		Pessoa pessoa = new Pessoa(1, "Marcelo", "Melo", 33, "11111111111", 1);
		
		System.out.println(String.format("[%s] Nome: %s %s - Idade: %s - CPF: %s | ID Endereço: [%s]", 
				pessoa.getId(), pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdade(), pessoa.getCpf(), pessoa.getIdEndereco()));
		
	}
	
	/**
	 * Variação do mesmo método, mas que imprime a pessoa que for passada por parâmetro, sem ter a responsabilidade
	 * do próprio método criar a pessoa
	 */
	public void imprimePessoa(Pessoa pessoa) {
		System.out.println(String.format("[%s] Nome: %s %s - Idade: %s - CPF: %s | ID Endereço: [%s]", 
				pessoa.getId(), pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdade(), pessoa.getCpf(), pessoa.getIdEndereco()));
		
	}
}
