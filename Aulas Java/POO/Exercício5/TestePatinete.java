package br.com.exerciciospoo;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete patinete = new Patinete();
		
		patinete.coletarInformacoes();
		
		patinete.mostrarInformacoes();
		
		System.out.println(patinete.kilometroViagem());
		

	}

}
