package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioSete {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Sistema de Equações Lineares");
		
		System.out.println("Digite o coeficiente a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o coeficiente b: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o coeficiente e: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o coeficiente d: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o coeficiente e: ");
		e = ler.nextDouble();
		
		System.out.println("Digite o coeficiente f: ");
		f = ler.nextDouble();
		
		x = ( (c*e) - (b*f) / (a*e) - (b*d) );

		y = ( (a*f) - (c*d) / (a*e) - (b*d) );
		
		System.out.println("O Valor de x é: " + x);
		System.out.println("O Valor de y é: " + y);
		
		ler.close();
	}

}
