package com.curso.pratica.executa;

import com.curso.pratica.controller.EnderecoController;
import com.curso.pratica.controller.PessoaController;
import com.curso.pratica.controller.ValidacaoController;
import com.curso.pratica.model.Endereco;
import com.curso.pratica.model.Pessoa;

public class Executa {

	public static void main(String[] args) {

		PessoaController pessoaController = new PessoaController();
		EnderecoController enderecoController = new EnderecoController();
		
		Pessoa pessoa = new Pessoa(1, "Marcelo", "Melo", 33, "11111111111", 1);
		Endereco endereco = new Endereco(1, "Rua", "Arnulfo de Lima", 2385, "Vila Santa Cruz");
		
		ValidacaoController validacao = new ValidacaoController();
		
		pessoaController.imprimePessoa(pessoa);
		enderecoController.imprimeEndereco(endereco);
		
		validacao.validaDados(pessoa, endereco);
	}

}
