package br.com.generation.repeticao;

import java.util.Scanner;

/*
5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
No final, mostre a soma dos números digitados.(DO...WHILE)

*/

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			
			System.out.println("Digite um número");
			numero = ler.nextInt();
			
			soma = soma + numero;
			
		}
		while(numero != 0);
		
		System.out.println("A soma dos números digitado é "+ soma);
		
		ler.close();
	}

}
