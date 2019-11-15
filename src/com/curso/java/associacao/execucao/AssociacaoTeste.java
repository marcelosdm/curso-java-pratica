package com.curso.java.associacao.execucao;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.associacao.Aluno;
import com.curso.java.associacao.Curso;
import com.curso.java.associacao.Faculdade;


public class AssociacaoTeste {

	public static void main(String[] args) {
	
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<>();
		
		Curso curso = new Curso();
		curso.setNome("Curso de Java");
		
		Curso curso3 = new Curso();
		curso3.setNome("Curso de Python");
		
		
		Aluno aluno = new Aluno();
		
		aluno.setId(10);
		aluno.setNome("Marcelo");
		aluno.setCurso(curso);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setId(10);
		aluno2.setNome("Vinicius");
		aluno2.setCurso(curso);
		
		alunos.add(aluno);
		alunos.add(aluno2);
		
		curso.setAlunos(alunos);
		curso3.setAlunos(alunos);
		
		cursos.add(curso);
		cursos.add(curso3);
		
		Faculdade faculdade = new Faculdade();
		
		faculdade.setEndereco("Rua 10");
		faculdade.setNome("Unifran");
		faculdade.setCursos(cursos);
		
		curso.setFaculdade(faculdade);
		
		aluno.setCurso(curso3);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Id: " + aluno.getId());
		System.out.println("Curso: " + aluno.getCurso().getNome());
		
		System.out.println("-------------------");
		System.out.println("Curso: " +  curso.getNome());
		System.out.println("Faculdade: " +  curso.getFaculdade().getNome());
		
		for (Aluno aluno3 : curso.getAlunos()) {
			System.out.println("Aluno: " + aluno3.getNome());
		}
		
		
		System.out.println("-----------------");
		System.out.println("Faculdade: " +  faculdade.getNome());
		System.out.println("Faculdade: " +  faculdade.getEndereco());
		
		for(Curso curso2 : faculdade.getCursos()) {
			
			System.out.println("-----------");
			System.out.println("Curso: " +  curso2.getNome());
			
			for(Aluno aluno4 : curso2.getAlunos()) {
				System.out.println("Alunos: " + aluno4.getNome());
			}
		}
		


	}

}
