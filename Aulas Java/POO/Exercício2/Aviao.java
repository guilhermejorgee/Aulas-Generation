package br.com.exerciciospoo;

/*
Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

public class Aviao {
	
	private String nome;
	private String modelo;
	private String origem;
	private String destino;
	private int velocidade;
	private int tempoViagem;
	private int litros;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getTempoViagem() {
		return tempoViagem;
	}
	public void setTempoViagem(int tempoViagem) {
		this.tempoViagem = tempoViagem;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	public int getLitros() {
		return litros;
	}
	
	double litrosNecessarios() {
		double km = this.tempoViagem * this.velocidade;
		double qtdNecessaria = km / this.litros;
		return qtdNecessaria;
	}
	

}
