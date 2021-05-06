package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio6 {

/*	
6-	Escrever um programa que receba vários números inteiros no teclado.
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, cont = 0, media;
		
		do {
			
			System.out.println("Digite um número");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				cont++;
				soma = soma + numero;
			}
			
		}
		while(numero != 0);		
		
		media = soma / cont;
		
		System.out.println("A média dos números multiplos de 3 digitado é:\n" + media);
		
		ler.close();
	}

}
