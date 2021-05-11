package br.com.exerciciospoo;

import java.util.Scanner;

public class Patinete {
	
	Scanner ler = new Scanner(System.in);
	
	String modelo;
	String cor;
	double velocidade;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getVelocidade() {
		return velocidade;
	}
	
	double iKilometros;
	
	void coletarInformacoes() {
		
		System.out.println("Informe o modelo do patinete");
		String iModelo = ler.nextLine();
		setModelo(iModelo);
		
		System.out.println("Informe a cor do patinete");
		String iCor = ler.nextLine();
		setCor(iCor);
		
		System.out.println("Informe a velocidade média do patinete(km/h)");
		double iVelocidade = ler.nextDouble();
		setVelocidade(iVelocidade);
		
		System.out.println("Informe a quantos kilometros terá a viagem");
		iKilometros = ler.nextDouble();
				
	}
	
	void mostrarInformacoes() {
		
		System.out.println("Modelo do patinete: " + getModelo());
		
		System.out.println("Cor do patinete: " + getCor());
		
		System.out.println("Velocidade média do patinete(km/h): " + getVelocidade());
		
		System.out.println("Quantos kilometros terá a viagem: " + iKilometros);
				
	}
	
	String kilometroViagem() {
		
		double viagem = iKilometros / this.velocidade;
		
		int hora = (int)viagem;
				
		double cMinuto = hora - viagem;
		
		if(cMinuto < 0) {
			cMinuto = cMinuto * -1;
		}
		
		int minuto = (int) (cMinuto * 60);
		
		String resultado = "Tempo de viagem será de " + hora +" hora(s) e "+ minuto + " minuto(s)";	
		
		return resultado;
	}
	

}
