package br.com.generation.repeticao;

import java.util.Scanner;

/*	2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, impar = 0, par = 0;
		
		String pares = "", impares = "";

		for(int i = 1; i<=10; ) {
			
			System.out.println("Digite um n�mero");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par++;
				
				pares = numero + " " + pares;
			}
			else {
				impar++;
				
				impares = numero + " " + impares;
			}
			
			i++;
			
		}
		
		System.out.println("Quantidade de n�meros pares: " + par + " - Numeros digitados: " + pares);
		
		System.out.println("Quantidade de n�meros impares: " + impar +  " - Numeros digitados: " + impares);

		ler.close();
	}
	


}
