package br.com.exerciciospoo;

import java.util.Scanner;

/*
4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as
informa��es deste objeto no console.
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
				+ "[1]Log�stico [2]Administrativo ");
		
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
			System.out.println("Departamento n�o encontrado");
		
		}
		
	}
	
	void tipoCargo() {
		
		
		
		if(this.departamento == '1') {
			
		System.out.println("\nQual cargo deseja verificar do departamento log�stico?\n"
				+ "[1]Almoxorifado [2]Auxiliar de Expedi��o ");
		
		char escolhaCargo = ler.next().charAt(0);
		setCargo(escolhaCargo);
		
		
		switch(this.cargo) {
		case '1':
			System.out.println("\nAlmoxorifado\n");
			System.out.println("Fun��o:\nAdministrar Estoque");
			break;
		case '2':
			System.out.println("\nAuxiliar de Expedi��o\n");
			System.out.println("Fun��o:\nEmbalar Produtos");
			break;
		default:
			System.out.println("Cargo n�o encontrado");
		
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
				System.out.println("Fun��o:\nPresta��o de contas, Auditoria Fiscal, Registro de Transa��es");
				break;
			case '2':
				System.out.println("\nAnalista de recursos humanos\n");
				System.out.println("Fun��o:\nProcesso de atra��o, Sele��o, Entrevista e Contrata��o");
				break;
			default:
				System.out.println("Cargo n�o encontrado");
			
			}
		
		}	

		
	}
		
	
	

}
