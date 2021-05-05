package br.com.generation.introducao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, horas, minutos, segundosR;
		
		System.out.println("Informe quantos segundos a maquina Xrax11 levou\npara cortar os tecidos do setor de esportes:");
		segundos = ler.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundosR = ((segundos % 3600) % 60);
		
		System.out.println("Esse processo levará "+ horas +" hora(s) " + minutos + " minuto(s) "+ "e " + segundosR + " segundo(s).");
		
		ler.close();
	}

}
