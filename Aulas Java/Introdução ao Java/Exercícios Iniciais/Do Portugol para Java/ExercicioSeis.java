package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioSeis {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1, y1, x2, y2, d;
		
		System.out.println("Este é um programa para calcular dois pontos quaisquer em um plano\nnos valores pedidos serão p(x1,y1) e p(x2,y2)");
		
		System.out.println("Escreva o valor x1 do P:");
		x1 = ler.nextDouble();
		
		System.out.println("Escreva o valor y1 do P:");
		y1 = ler.nextDouble();
		
		System.out.println("Escreva o valor x1 do P:");
		x2 = ler.nextDouble();
		
		System.out.println("Escreva o valor y2 do P:");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("Distância entre eles é de " + d);
		
		ler.close();
	}
	
	

}
