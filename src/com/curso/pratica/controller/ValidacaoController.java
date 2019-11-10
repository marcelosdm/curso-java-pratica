package com.curso.pratica.controller;

import com.curso.pratica.model.Endereco;
import com.curso.pratica.model.Pessoa;

public class ValidacaoController {


	Pessoa pessoa = new Pessoa();
	Endereco endereco = new Endereco();
	
	/**
	 * Método para validar o endereço da Pessoa
	 * @param pessoa
	 * @param endereco
	 */
	public void validaDados(Pessoa pessoa, Endereco endereco) {
		if(pessoa.getIdEndereco() == endereco.getId()) {
			System.out.println(String.format("Olá, %s! Seus dados estão válidos! "
					+ "Seu endereço é: %s %s, %s - %s", 
					pessoa.getNome(), endereco.getLogradouro(), endereco.getNome(),
					endereco.getNumero(), endereco.getBairro()));
		} else {
			System.out.println("Olá %s! Não foi encontrado endereço para seu cadastro.");
		}
	}
}
