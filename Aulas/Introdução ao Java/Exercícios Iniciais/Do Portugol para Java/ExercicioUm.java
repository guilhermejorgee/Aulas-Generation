package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String args[]) {
	
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, calculo, anoBissexto;
		
		System.out.println("Digite quantos anos voc� tem");
		anos = ler.nextInt();
		
		System.out.println("Digite quantos meses completos ja se passou desde seu anivers�rio\\n(Contando a partir do dia do seu anivers�rio) ");
		meses = ler.nextInt();
		
		System.out.println("Caso tenha sobrado alguns dias posterior ao ultimo m�s completo,\ninforme a quantidade de dias aqui:");
		dias = ler.nextInt();
		
		anoBissexto = (anos/4);
		
		calculo = (anos*365) + (meses*30) + dias + anoBissexto;
		
		System.out.printf("Voc� tem " + calculo + " dias de vida.");
		
		ler.close();
	}

}
