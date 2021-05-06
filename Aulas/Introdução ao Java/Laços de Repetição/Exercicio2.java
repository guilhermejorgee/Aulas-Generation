package br.com.generation.repeticao;

import java.util.Scanner;

/*	2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, impar = 0, par = 0;
		
		String pares = "", impares = "";

		for(int i = 1; i<=10; ) {
			
			System.out.println("Digite um número");
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
		
		System.out.println("Quantidade de números pares: " + par + " - Numeros digitados: " + pares);
		
		System.out.println("Quantidade de números impares: " + impar +  " - Numeros digitados: " + impares);

		ler.close();
	}
	


}
