package com.curso.pratica.controller;

import com.curso.pratica.model.Endereco;

public class EnderecoController {

	/**
	 * Método com responsabilidade para criação de endereços
	 */
	public void imprimeEndereco() {
		Endereco endereco = new Endereco(1, "Rua", "Arnulfo de Lima", 2385, "Vila Santa Cruz");

		System.out.println(String.format("[%s] Endereço: %s %s, %s - %s ", endereco.getId(), endereco.getLogradouro(),
				endereco.getNome(), endereco.getNumero(), endereco.getBairro()));
	}

	/**
	 * Método para impressão de endereços, conforme endereço passado por parâmetro
	 */
	public void imprimeEndereco(Endereco endereco) {
		System.out.println(String.format("[%s] Endereço: %s %s, %s - %s ", endereco.getId(), endereco.getLogradouro(),
				endereco.getNome(), endereco.getNumero(), endereco.getBairro()));
	}
}
