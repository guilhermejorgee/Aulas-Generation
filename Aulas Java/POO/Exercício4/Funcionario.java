package br.com.exerciciospoo;

import java.util.Scanner;

/*
4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as
informações deste objeto no console.
*/

public class Funcionario {
	
	Scanner ler = new Scanner(System.in);
	
	String nome;
	char departamento;
	char cargo;	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setDepartamento(char departamento) {
		this.departamento = departamento;
	}
	public char getDepartamento() {
		return departamento;
	}
	
	public void setCargo(char cargo) {
		this.cargo = cargo;
	}
	public char getCargo() {
		return cargo;
	}
	
	void tipoDepartamento() {
		
		System.out.println("Qual departamento deseja verificar?\n"
				+ "[1]Logístico [2]Administrativo ");
		
		char escolhaDepartamento = ler.next().charAt(0);
		setDepartamento(escolhaDepartamento);
		
		
		switch(this.departamento) {
		case '1':
			tipoCargo();
			break;
		case '2':
			tipoCargo();
			break;
		default:
			System.out.println("Departamento não encontrado");
		
		}
		
	}
	
	void tipoCargo() {
		
		
		
		if(this.departamento == '1') {
			
		System.out.println("\nQual cargo deseja verificar do departamento logístico?\n"
				+ "[1]Almoxorifado [2]Auxiliar de Expedição ");
		
		char escolhaCargo = ler.next().charAt(0);
		setCargo(escolhaCargo);
		
		
		switch(this.cargo) {
		case '1':
			System.out.println("\nAlmoxorifado\n");
			System.out.println("Função:\nAdministrar Estoque");
			break;
		case '2':
			System.out.println("\nAuxiliar de Expedição\n");
			System.out.println("Função:\nEmbalar Produtos");
			break;
		default:
			System.out.println("Cargo não encontrado");
		
			}
	
		}	
		
		else if(this.departamento == '2') {
			
			System.out.println("\nQual cargo deseja verificar do departamento Administrativo?\n"
					+ "[1]Contabilista [2]Analista de recursos humanos ");
			
			char escolhaCargo = ler.next().charAt(0);
			setCargo(escolhaCargo);
			
			
			switch(this.cargo) {
			case '1':
				System.out.println("\nContabilista\n");
				System.out.println("Função:\nPrestação de contas, Auditoria Fiscal, Registro de Transações");
				break;
			case '2':
				System.out.println("\nAnalista de recursos humanos\n");
				System.out.println("Função:\nProcesso de atração, Seleção, Entrevista e Contratação");
				break;
			default:
				System.out.println("Cargo não encontrado");
			
			}
		
		}	

		
	}
		
	
	

}
