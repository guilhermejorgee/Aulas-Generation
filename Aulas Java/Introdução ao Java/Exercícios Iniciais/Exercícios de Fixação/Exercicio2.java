package br.com.generation.adicionais;

import java.util.Scanner;

/* 2-	Faça um programa que entre com três números e coloque em ordem crescente.*/

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3;
		
		
		System.out.println("Digite o numero 1:");
		num1 = ler.nextDouble();
		
		System.out.println("Digite o numero 2:");
		num2 = ler.nextDouble();
		
		System.out.println("Digite o numero 3:");
		num3 = ler.nextDouble();
		

		if(num1 > num2 && num1 > num3) {
			if(num2 > num3){
				System.out.println(num3 + " " + num2 + " " + num1);
			}
			else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		}
		else if(num2 > num1 && num2 > num3){
			if(num1 > num3){
				System.out.println(num3 + " " + num1 + " " + num2);
			}
			else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		}
		else {
			if(num1 > num2){
				System.out.println(num2 + " " + num1 + " " + num3);
			}
			else {
				System.out.println(num1 + " " + num2 + " " + num3);
			}
		}
	
		ler.close();
}
	
}
	
