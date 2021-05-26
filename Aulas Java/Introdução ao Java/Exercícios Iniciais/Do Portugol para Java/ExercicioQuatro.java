package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioQuatro {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		double d, r, s;
		
		System.out.println("Digite o primeiro número (A)");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo número (B)");
		b = ler.nextInt();
		
		System.out.println("Digite o terceiro número (C)");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		
		s = Math.pow((b+c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("Valor de R: " + r);
		System.out.println("Valor de S: " + s);
		System.out.println("Valor de D: " + d);
		
		ler.close();
	}

}
