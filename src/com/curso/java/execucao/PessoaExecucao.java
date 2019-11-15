package com.curso.java.execucao;

import com.curso.java.Pessoa;
import com.curso.java.PessoaTeste;

public class PessoaExecucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaTeste pessoaTeste = new PessoaTeste();
		pessoaTeste.imprimirPessoa();
		
		Pessoa pessoa = new Pessoa();

		pessoa.setId(10);
		pessoa.setCpf("00000000000");
		pessoa.setNome("Vinicius");
		
		pessoaTeste.imprimirPessoa(pessoa);
		
		Pessoa pessoaB = pessoaTeste.retornaPessoa();
		
		if(pessoaB != null) {
			System.out.println("É diferente de nulo");
			pessoaTeste.imprimirPessoa(pessoaB);
		}else {
			System.out.println("É nulo");
		}

	}

}
