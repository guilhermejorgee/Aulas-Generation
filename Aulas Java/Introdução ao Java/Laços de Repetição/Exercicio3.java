package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio3 {

/*
3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas
com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa
termina quando idade for =-99. (WHILE)
*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, menor = 0, maior = 0;
		
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		
		
		while(idade != -99) {					
			
			if(idade < 21) {
				menor++;
			}
			else if(idade > 50) {
				maior++;
			}
			
			System.out.println("Digite sua idade");
			idade = ler.nextInt();
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + menor);
		
		System.out.println("Total de pessoas com mais de 50 anos: " + maior);
		
		ler.close();
	}

}
