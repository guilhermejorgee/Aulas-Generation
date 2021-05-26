package br.com.exerciciospoo;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		
		System.out.println("Diga o nome do aparelho");
		String nome = ler.nextLine();
		produtoEletronico.setNome(nome);
		
		System.out.println("O nome do aparelho: "+ produtoEletronico.getNome());
		System.out.println("Qual é o modelo do seu aparelho?\n[1]Cyber1000\n[2]Hyper150\n[3]S300\n ");
		int modelo = ler.nextInt();
		produtoEletronico.tipoModelo(modelo);
		
		ler.close();
		
		
			


	}

}
