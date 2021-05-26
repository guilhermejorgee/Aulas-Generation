package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioCinco {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, resultado;
		
		System.out.println("Digite a nota da prova 1:");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a nota da prova 2:");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite a nota da prova 3:");
		nota3 = ler.nextDouble();
		
		resultado = ( (nota1*2) + (nota2*3) + (nota3*5) ) / 10;
		
		
		System.out.println("Sua média é: " + resultado);
		
		ler.close();
	}

}
