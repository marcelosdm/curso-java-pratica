package com.curso.java.exercicios.associacao.execucao;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.exercicios.associacao.Endereco;
import com.curso.java.exercicios.associacao.Grupo;
import com.curso.java.exercicios.associacao.Loja;
import com.curso.java.exercicios.associacao.Produto;
import com.curso.java.exercicios.associacao.Setor;
import com.curso.java.exercicios.associacao.ValidacaoCadastros;

public class AssociacaoExecucao {

	public static void main(String[] args) {
		
		ValidacaoCadastros validacao = new ValidacaoCadastros();
		
		List<Produto> produtos = new ArrayList<>();
		List<Setor> setores = new ArrayList<>();
		
		
		Endereco endereco1 = new Endereco(1, "Rua Voluntários da Franca", 123, "Calçadão");
//		loja1.setEndereco(endereco1);
		
		Setor setor1 = new Setor(1, "Comercial", "3723-9999");
		Setor setor2 = new Setor(2, "Financeiro", "3723-0000");

		setores.add(setor1);
		setores.add(setor2);
//		loja1.setSetores(setores);
		
		
		Grupo grupo1 = new Grupo(1, "Eletrônicos");
		Grupo grupo2 = new Grupo(2, "Vestuário");
		
		Produto produto1 = new Produto(1, "Moto G 8", 900,"15/11/2019","Motorola");
		Produto produto2 = new Produto(2, "Calça jeans", 150, "15/11/2019", "Levi's");
		Produto produto3 = new Produto(1, "Moto G 8", 900,"15/11/2019","Motorola");

		produto1.setGrupo(grupo1);
		produto2.setGrupo(grupo2);
		produto3.setGrupo(grupo1);
		
			
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);

		Loja loja1 = new Loja(1, "11111111", "Magalu", endereco1, produtos, setores);
		
		validacao.imprimeInfoLoja(loja1);
	}
}
