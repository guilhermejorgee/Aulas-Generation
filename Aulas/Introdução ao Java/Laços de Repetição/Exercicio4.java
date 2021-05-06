package br.com.generation.repeticao;

import java.util.Scanner;

/*
4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das
pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se
a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler
os dados de 150 pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.

*/

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contador = 0, idade, sexo, temperamento, calmas = 0, mulheresN = 0, homensA = 0;
		int outrosC = 0, nerv40 = 0, calm18 = 0;
		
		
		
		while(contador < 150) {
			
			System.out.println("Informe sua idade:");
			idade = ler.nextInt();
			
			
			System.out.println("Informe seu sexo\n[1]Feminino - [2]Masculino - [3]Outros: ");
			sexo = ler.nextInt();
			
			System.out.println("Voc� se considera uma pessoa:\n[1]Calma - [2]Nervosa - [3]Agressiva: ");
			temperamento = ler.nextInt();
			
			if(temperamento == 1) {
				calmas++;
			}
			if(sexo == 1 && temperamento == 2) {
				mulheresN++;
			}
			if(sexo == 2 && temperamento == 3) {
				homensA++;
			}
			if(sexo == 3 && temperamento == 1) {
				outrosC++;
			}
			if(idade > 40 && temperamento == 2) {
				nerv40++;
			}
			if(idade < 18 && temperamento == 1) {
				calm18++;
			}
			
			contador++;
		}
		
		System.out.println("n�mero de pessoas calmas "+ calmas); 
		System.out.println("o n�mero de mulheres nervosas "+ mulheresN); 
		System.out.println("o n�mero de homens agressivos "+ homensA); 
		System.out.println("o n�mero de outros calmos "+ outrosC);
		System.out.println("o n�mero de pessoas nervosas com mais de 40 anos "+ nerv40); 
		System.out.println("o n�mero de pessoas calmas com menos de 18 anos "+ calm18);

		ler.close();
	}

}
