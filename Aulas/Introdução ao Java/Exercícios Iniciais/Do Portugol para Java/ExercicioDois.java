package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioDois {


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, calculo;
		
		int diasCompletos, mesesCompletos, anosCompletos, diasRestantes;
		
		System.out.println("Digite quantos anos voc� tem");
		anos = ler.nextInt();
		
		System.out.println("Digite quantos meses completos ja se passou desde seu anivers�rio\\n(Contando a partir do dia do seu anivers�rio) ");
		meses = ler.nextInt();
		
		System.out.println("Caso tenha sobrado alguns dias posterior ao ultimo m�s completo,\ninforme a quantidade de dias aqui:");
		dias = ler.nextInt();
		
		
		calculo = (anos*365) + (meses*30) + dias;
		
		System.out.printf("Voc� tem " + calculo + " dias de vida.");
		
		System.out.println("Agora que voc� j� sabe quantos dias de vida voc� tem, vamos tirar a prova real.\nInforme quantos dias de vida voc� possui no total:");
		diasCompletos = ler.nextInt();
		
		anosCompletos = diasCompletos / 365;
		
		mesesCompletos = ((diasCompletos % 365) / 30);
		
		diasRestantes = ((diasCompletos % 365) % 30);
		
		System.out.printf("Isso representa\n" + anosCompletos + "ano(s)\n" + mesesCompletos + "m�s(es)\n" + diasRestantes + " dia(s)");
	
		ler.close();
	}

}
