package br.com.generation.arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		
		int cont = 0;	
		
		
		for(int l = 0; l<matriz.length; l++) {
		
			for(int c = 0; c<matriz[l].length; c++) {
				
				System.out.println("Escreva um número ");
				matriz[l][c] = entrada.nextDouble();
				
				if(matriz[l][c] > 10) {
					cont++;
				}
				
			}
		}

		System.out.println("A quantidade de números maiores que 10 presentes na matriz é: "+ cont);
		
		entrada.close();
}
	
}
