package br.com.generation.adicionais;

/* 1-	Faça um programa que receba três
 *  inteiros e diga qual deles é o maior.
 */

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int num1, num2, num3, maior = 0;
		
		System.out.println("Digite o primeiro número");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número");
		num3 = ler.nextInt();
		
		if(num1 > maior ) {
			maior = num1;
		}
		if(num2 > maior){
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		
		ler.close();
	}
	
	
	

}
