package com.curso.java;

public class PessoaTeste {

	/**
	 * Este metódo imprime informações de pessoa.
	 */
	public void imprimirPessoa() {
		Pessoa pessoa = new Pessoa();

		pessoa.setId(10);
		pessoa.setCpf("00000000000");
		pessoa.setNome("Marcelo");

		System.out.println(String.format("[%s] - Meu nome é %s e meu cpf é %s", pessoa.getId(), pessoa.getNome(),
				pessoa.getCpf()));

	}

	/**
	 * Este metódo imprime os dados de pessoa passados por parâmetros
	 * 
	 * @param pessoa
	 */
	public void imprimirPessoa(Pessoa pessoa) {
		System.out.println(String.format("[%s] - Meu nome é %s e meu cpf é %s", pessoa.getId(), pessoa.getNome(),
				pessoa.getCpf()));
	}

	/**
	 * Este metódo retorna uma pessoa
	 * 
	 * @return
	 */
	public Pessoa retornaPessoa() {

		Pessoa pessoa = new Pessoa();

		pessoa.setId(12);
		pessoa.setCpf("1231231231231");
		pessoa.setNome("João");

		if (1 == 1) {
			return pessoa;
		}else if(1==1){
			return pessoa;
		}else {
			return pessoa;
		}

	}
}
