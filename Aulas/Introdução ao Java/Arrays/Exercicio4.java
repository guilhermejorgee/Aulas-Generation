package br.com.generation.arrays;

import java.util.Scanner;

/*
4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário
um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção
o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado
na própria matriz.
*/

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] adicao = new double[2][2];
		double[][] subtracao = new double[2][2];
		
		int menu = 0;
		
		
		
		for(int l = 0; l<2; l++) {
			
			for(int c = 0; c<2; c++) {
				
				System.out.println("Digite um valor para a primeira matriz");
				matriz1[l][c] = entrada.nextDouble();
				
				System.out.println("Digite um valor para a segunda matriz");
				matriz2[l][c] = entrada.nextDouble();	
	
			}
		}
			System.out.println("Escolha uma das opções\n"+
					"[1]Somar as duas matrizes\n[2]Subtrair as duas matrizes\n"
					+ "[3]Adicionar uma constante as duas matrizes\n[4]Imprimir as matrizes");
			
			menu = entrada.nextInt();

		
		if(menu == 1) {
			
			System.out.println();
			
			System.out.println("Resultado da adição das matrizes");
			
			System.out.println();
			
			for(int l = 0; l<2; l++) {
				
				for(int c = 0; c<2; c++) {
					
					adicao[l][c] = matriz1[l][c] + matriz2[l][c];										
					
					System.out.print(" | " + adicao[l][c] + " | ");
					
				}
				System.out.println();
			}
		}
		else if(menu == 2) {
			
			System.out.println();
			
			System.out.println("Resultado da subtração das matrizes");
			
			System.out.println();
					
			for(int l = 0; l<2; l++) {
						
				for(int c = 0; c<2; c++) {
							
					subtracao[l][c] = matriz1[l][c] - matriz2[l][c];					
							
					System.out.print(" | " + subtracao[l][c] + " | ");
							
				}
					System.out.println();
					}
				}
		else if(menu == 3) {
			
			int constante;
			
			System.out.println("Digite um valor que será somado com os valores na primeira coluna das duas matrizes");
			constante = entrada.nextInt();
			
			
			for(int l = 0; l<2; l++) {
				
				matriz1[l][0] = matriz1[l][0] + constante;
			
				matriz2[l][0] = matriz2[l][0] + constante;
							
			}
			
			System.out.println();
			
			System.out.println("Matriz 1");
			
			System.out.println();
			
			for(int l = 0; l<2; l++) {
				
				for(int c = 0; c<2; c++) {		
					
							
					System.out.print(" | " + matriz1[l][c] + " | ");
							
				}
					System.out.println();
					}		
			
			System.out.println();
			
			System.out.println("Matriz 2");
			
			System.out.println();
			
			for(int l = 0; l<2; l++) {
				
				for(int c = 0; c<2; c++) {		
					
							
					System.out.print(" | " + matriz2[l][c] + " | ");
							
				}
					System.out.println();
					}						
				
		}		
		else if(menu == 4) {
			
			System.out.println("Matriz 1");
			
			System.out.println();
			
			for(int l = 0; l<2; l++) {
				
				for(int c = 0; c<2; c++) {		
					
							
					System.out.print(" | " + matriz1[l][c] + " | ");
							
				}
					System.out.println();
					}		
			
			System.out.println();
			
			System.out.println("Matriz 2");
			
			System.out.println();
			
			for(int l = 0; l<2; l++) {
				
				for(int c = 0; c<2; c++) {		
					
							
					System.out.print(" | " + matriz2[l][c] + " | ");
							
				}
					System.out.println();
					}						
				
		}
		else {
			System.out.println("Opção inválida");
		}
		
		entrada.close();
		
		
	}

}
