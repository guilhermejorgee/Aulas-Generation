package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final double distribuidora = 0.28, imposto = 0.45;
		
		double pcusto, custo, total;
		
		System.out.println("Digite o custo de f�brica do veiculo");
		custo = ler.nextDouble();
		
		pcusto = ((custo * distribuidora) + custo);

		total = ((pcusto * imposto) + pcusto);

		System.out.println("O custo total do veiculo �: " + total);
		
		ler.close();

	}

}
