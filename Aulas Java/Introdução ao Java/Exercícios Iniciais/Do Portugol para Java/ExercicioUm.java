package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String args[]) {
	
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, calculo, anoBissexto;
		
		System.out.println("Digite quantos anos você tem");
		anos = ler.nextInt();
		
		System.out.println("Digite quantos meses completos ja se passou desde seu aniversário\\n(Contando a partir do dia do seu aniversário) ");
		meses = ler.nextInt();
		
		System.out.println("Caso tenha sobrado alguns dias posterior ao ultimo mês completo,\ninforme a quantidade de dias aqui:");
		dias = ler.nextInt();
		
		anoBissexto = (anos/4);
		
		calculo = (anos*365) + (meses*30) + dias + anoBissexto;
		
		System.out.printf("Você tem " + calculo + " dias de vida.");
		
		ler.close();
	}

}
