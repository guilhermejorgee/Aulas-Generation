package br.com.generation.adicionais;

import java.util.Scanner;

/*
4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número
é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite um número: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0){
			System.out.println("Esse número é par ");
			resultado = Math.sqrt(numero);
			System.out.println("Raiz quadrada desse número:");
			System.out.println(resultado);
		}
		else {
			System.out.println("Esse número é impar ");
			resultado = Math.pow(numero, 2);
			System.out.println("Valor do número elevado ao quadrado: ");
			System.out.println(resultado);
		}

		ler.close();
	}

}
