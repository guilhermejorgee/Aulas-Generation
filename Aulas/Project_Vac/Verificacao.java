package Project_Vac;

import java.util.*;

public class Verificacao {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		Especiais esp = new Especiais();
		Idade id = new Idade();		
		Pessoa pe = new Pessoa();
		Profissao prof = new Profissao();
		
		System.out.println("====================");
		System.out.println("     Sys - Vac");
		System.out.println("====================");
		
		// Inser��o de dados
		System.out.print("Nome: ");		
		pe.setNome(l.next()); //  nome
		//System.out.println(pe.getNome());
		
		System.out.print("Endere�o: "); // endere�o
		pe.setEndere�o(l.next());
		
		System.out.print("Idade: ");
		id.setIdade(l.nextInt());  //  idade
		
		System.out.println(id.getIdade());
		
		System.out.print("Prioridade: " + id.condicaoIdade(id.getIdade()));
		
		System.out.println("\nQual � sua profiss�o?");	
		System.out.println("[1]�rea da Sa�de\n[2]Motoristas/Cobrador\n[3]Profissional da Educa��o\n[4]Profissional da Seguran�a P�blica");
		prof.setProfissoes(l.nextInt());
		
		System.out.print("Prioridade: " + prof.condicaoProfissao(prof.getProfissoes()));
		
		System.out.println("\nPossui alguma doen�a?");	
		System.out.println("[1]Sindrome de Down\n[2]Problemas renais\n[3]Transplantados\n[4]Gr�vidas\n[5]BPC");
		esp.setEspeciais(l.nextInt());
		
		System.out.println(esp.condicaoEspeciais(esp.getEspeciais())); 
		
		
	}

}
