package com.curso.pratica.controller;

import java.util.ArrayList;
import java.util.List;

import com.curso.pratica.model.Pessoa;

public class ListaPessoasController {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(1, "Marcelo", "Melo", 33, "11111111111", 2);
		Pessoa pessoa2 = new Pessoa(2, "Lívia", "Oliveira", 37, "22222222222", 2);
		Pessoa pessoa3 = new Pessoa(3, "Vinicius", "Melo", 0, "33333333333", 2);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Pessoa: " + pessoa.getNome());
		}
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() > 18) {
				System.out.println(pessoa.getNome());
			}
		}
	}

	
	
	
}
