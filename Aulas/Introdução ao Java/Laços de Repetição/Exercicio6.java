package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio6 {

/*	
6-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, cont = 0, media;
		
		do {
			
			System.out.println("Digite um n�mero");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				cont++;
				soma = soma + numero;
			}
			
		}
		while(numero != 0);		
		
		media = soma / cont;
		
		System.out.println("A m�dia dos n�meros multiplos de 3 digitado �:\n" + media);
		
		ler.close();
	}

}
