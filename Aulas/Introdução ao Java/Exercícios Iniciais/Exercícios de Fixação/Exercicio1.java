package br.com.generation.adicionais;

/* 1-	Fa�a um programa que receba tr�s
 *  inteiros e diga qual deles � o maior.
 */

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int num1, num2, num3, maior = 0;
		
		System.out.println("Digite o primeiro n�mero");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
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
