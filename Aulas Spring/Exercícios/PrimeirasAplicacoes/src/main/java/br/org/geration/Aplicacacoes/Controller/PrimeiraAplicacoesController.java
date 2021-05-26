package br.org.geration.Aplicacacoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraAplicacoesController {
	
	@GetMapping("/aplicacaoum")	
	public String primeiraAplicacao() {
		
		
		
		String[][] matriz = new String[3][2];
		
		matriz[0][0] = "Mentalidade";
		matriz[0][1] = "Habilidades";
		
		matriz[1][0] = "Responsabilidade Social";
		matriz[1][1] = "Orientação ao Detalhe";
		matriz[2][0] = "Persistência";
		
		String cabecalho = matriz[0][0] + "             | " + matriz[0][1];
		
		String linha1 = matriz[1][0] + " | " + matriz[1][1];
		
		String linha2 = matriz[2][0] + "            | ";
		
		String resultado = cabecalho + "\r\n" + linha1 + "\r\n" + linha2;
		
		
		return resultado; //Eu vi que no navegador não funciona a quebra de linha pq ele só reconhece o <br/> do html
	}
	
	@GetMapping("/aplicacaodois")	
	public String segundaAplicacao() {
		
		
		
		String resultado = "Nessa semana meu objetivo é ser capaz de desenvolver o back-end de uma aplicação "
				+ "e fazer a comunicação dela com um banco de dados";
		
		
		return resultado;
	
	
	}
		
}
