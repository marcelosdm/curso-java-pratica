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
		
		
		for (int i = 0; i < loja.getProdutos().size(); i++) {
			
			for (int k = i+1; k < loja.getProdutos().size(); k++) {
				if(loja.getProdutos().get(i).getDescricao() 
						== loja.getProdutos().get(k).getDescricao()) {
					System.out.println(String.format("Atenção! O produto '%s' já foi cadastrado previamente.", loja.getProdutos().get(i).getDescricao()));
				} else {
					System.out.println(loja.getProdutos().get(i).getDescricao());
				}
			}
		}
		
	}
	
		
}

