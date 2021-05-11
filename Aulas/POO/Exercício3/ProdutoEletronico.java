package br.com.exerciciospoo;

public class ProdutoEletronico {
	
	private String nome;
	private int modelo;

	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	public String getNome() {
		return nome;
	}
	
	
	void ligaProduto() {
		System.out.println("Ligando produto...");
	}
	
	void tipoModelo(int tipoModelo) throws InterruptedException {
		
		this.modelo = tipoModelo;
		
		if(this.modelo == 1) {
			
			System.out.println("Modelo Cyber1000");
			System.out.println("Iniciando operação...");
			int contagem = 5;
			for (int i = 1; i<5; i++) {
				contagem = contagem -1; 
				System.out.println(contagem);
				Thread.sleep(500);
			}
			System.out.println("Operação Concluída...");
		}
		else if(this.modelo == 2) {
			
			System.out.println("Modelo Hyper150");
			System.out.println("Iniciando operação...");
			int contagem = 5;
			for (int i = 1; i<5; i++) {
				contagem = contagem -1; 
				System.out.println(contagem);
				Thread.sleep(500);
			}
			System.out.println("Operação Concluída...");
		}
		else if(this.modelo == 3) {
			
			System.out.println("Modelo S300");
			System.out.println("Iniciando operação...");
			int contagem = 5;
			for (int i = 1; i<5; i++) {
				contagem = contagem -1; 
				System.out.println(contagem);
				Thread.sleep(500);
			}
			System.out.println("Operação Concluída...");
		}
		else {
			System.out.println("Modelo inválido, a operação não foi iniciada.");
		}
	}

}
