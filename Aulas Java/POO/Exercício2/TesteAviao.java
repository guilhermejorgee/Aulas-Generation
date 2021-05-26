package br.com.exerciciospoo;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome do avi�o");
		String nomeAviao = ler.nextLine(); 
		aviao.setNome(nomeAviao);
		
		System.out.println("Informe o modelo do avi�o");
		String modeloAviao = ler.nextLine(); 
		aviao.setModelo(modeloAviao);
		
		System.out.println("Informe a origem do voo");
		String origemAviao = ler.nextLine(); 
		aviao.setOrigem(origemAviao);
		
		System.out.println("Informe o destino do voo");
		String destinoAviao = ler.nextLine(); 
		aviao.setDestino(destinoAviao);
		
		System.out.println("Informe a velocidade m�dia da viagem (km/h)");
		int velocidadeAviao = ler.nextInt(); 
		aviao.setVelocidade(velocidadeAviao);
		
		System.out.println("Informe o tempo de viagem(horas)");
		int tempoAviao = ler.nextInt(); 
		aviao.setTempoViagem(tempoAviao);
		
		System.out.println("Informe o consumo de litros por km");
		int litrosAviao = ler.nextInt(); 
		aviao.setLitros(litrosAviao);
		
		System.out.println("O nome do seu avi�o �: "+ aviao.getNome());
		System.out.println("O modelo do seu avi�o �: "+ aviao.getModelo());
		System.out.println("A origem do voo �: "+ aviao.getOrigem());
		System.out.println("A velocidade m�dia da viagem foi de: "+ aviao.getVelocidade() +"km/h");
		System.out.println("O tempo de viagem foi de: "+ aviao.getTempoViagem()+" horas");
		System.out.println("O consumo de litros do avi�o por km � de: "+ aviao.getLitros());
		System.out.println("Quantidade de litros necess�ria foi de "+ aviao.litrosNecessarios());
		
		
		ler.close();
		


	}

}
