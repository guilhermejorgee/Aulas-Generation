package br.com.exerciciospoo;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
			
			cliente.setNome("Guilherme");
			cliente.setIdade(23);
			cliente.setPlano("Premium");
			
			System.out.println("O nome do cliente é: " + cliente.getNome() );;
			System.out.println("A idade do cliente é: " + cliente.getIdade() );;
			System.out.println("O plano do cliente é: " + cliente.getPlano() );;
			
		}
		
	}

