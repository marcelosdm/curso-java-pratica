package com.curso.java.exercicios.associacao;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoCadastros {
	
	Loja loja = new Loja();
	Endereco endereco = new Endereco();
	Setor setor = new Setor();
	Produto produto = new Produto();
	Grupo grupo = new Grupo();	
	
	
	List<Produto> produtos = new ArrayList<>();
	List<Setor> setores = new ArrayList<>();
	
	public void imprimeInfoLoja(Loja loja) {
		
		produtos.add(produto);
		setores.add(setor);
		
		System.out.println("Dados da loja:");
		System.out.println(String.format("Loja: %s - CNPJ: %s", 
				loja.getRazaoSocial(), 
				loja.getCnpj()));
		System.out.println(String.format("Endereço: %s, %s - %s", 
				loja.getEndereco().getRua(), 
				loja.getEndereco().getNumero(),
				loja.getEndereco().getComplemento()));
		
		System.out.println("-----------------------------");
		
		System.out.println("Contatos da loja:");
		for (Setor setor : loja.getSetores()) {
			System.out.println(String.format("Setor: %s - Telefone: %s", 
					setor.getDescricao(), 
					setor.getTelefone()));
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("Produtos: ");
		
		if(produtos.contains("Moto G 8")) {
			System.out.println("Produto repetido");
		} else {
			for(Produto produto : loja.getProdutos()) {
				System.out.println("Produto: " + produto.getDescricao());
			}
		}
		
	}
	
		
}

