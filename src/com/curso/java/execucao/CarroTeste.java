package com.curso.java.execucao;

import com.curso.java.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setNome("Gol");
		carro.setVelocidadeMaxima(250);
		
		Carro carro2 = new Carro();
		carro2.setNome("Vectra");
		carro2.setVelocidadeMaxima(200);
		
		Carro.setVelocidadeLimite(200);
		carro.imprime();
		carro2.imprime();
		
	}

}
