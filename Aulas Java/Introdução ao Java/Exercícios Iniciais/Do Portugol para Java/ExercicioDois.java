package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioDois {


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, calculo;
		
		int diasCompletos, mesesCompletos, anosCompletos, diasRestantes;
		
		System.out.println("Digite quantos anos você tem");
		anos = ler.nextInt();
		
		System.out.println("Digite quantos meses completos ja se passou desde seu aniversário\\n(Contando a partir do dia do seu aniversário) ");
		meses = ler.nextInt();
		
		System.out.println("Caso tenha sobrado alguns dias posterior ao ultimo mês completo,\ninforme a quantidade de dias aqui:");
		dias = ler.nextInt();
		
		
		calculo = (anos*365) + (meses*30) + dias;
		
		System.out.printf("Você tem " + calculo + " dias de vida.");
		
		System.out.println("Agora que você já sabe quantos dias de vida você tem, vamos tirar a prova real.\nInforme quantos dias de vida você possui no total:");
		diasCompletos = ler.nextInt();
		
		anosCompletos = diasCompletos / 365;
		
		mesesCompletos = ((diasCompletos % 365) / 30);
		
		diasRestantes = ((diasCompletos % 365) % 30);
		
		System.out.printf("Isso representa\n" + anosCompletos + "ano(s)\n" + mesesCompletos + "mês(es)\n" + diasRestantes + " dia(s)");
	
		ler.close();
	}

}
