package br.com.generation.adicionais;

import java.util.Scanner;

/*
4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero
� par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0){
			System.out.println("Esse n�mero � par ");
			resultado = Math.sqrt(numero);
			System.out.println("Raiz quadrada desse n�mero:");
			System.out.println(resultado);
		}
		else {
			System.out.println("Esse n�mero � impar ");
			resultado = Math.pow(numero, 2);
			System.out.println("Valor do n�mero elevado ao quadrado: ");
			System.out.println(resultado);
		}

		ler.close();
	}

}
