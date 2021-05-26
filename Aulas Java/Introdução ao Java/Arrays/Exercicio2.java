package br.com.generation.arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] numero = new int[6];
		
		String pares = "";
		String impares = "";
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i<6; i++) {
			
			System.out.println("Escreva um número:");
			numero[i] = ler.nextInt();
			
			if(numero[i] % 2 == 0) {
				somaPares = somaPares + numero[i];
				pares = pares + " " + numero[i];
			}
			else {
				somaImpares = somaImpares + numero[i];
				impares = impares + " " + numero[i];
			}
			
		}
		
		System.out.println();
		
		System.out.println("Numeros pares digitados:" + pares);
		System.out.println("Soma numeros pares digitados: "+ somaPares);
		System.out.println();
		System.out.println("Numeros impares digitados:" + impares);
		System.out.println("Soma numeros pares digitados: "+ somaImpares);
		
		ler.close();
		

	}

}
