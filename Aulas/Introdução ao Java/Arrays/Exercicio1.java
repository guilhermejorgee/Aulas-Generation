package br.com.generation.arrays;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		int soma = A[0] + A[1] + A[5];
		
		System.out.println("A soma dos valores das posi��es 0,1 e 5 do vetor A �: "+ soma); 
		
		A[4] = 100;
		
		System.out.println();
		
		for(int i = 0; i<6; i++) {
			System.out.println("Valor da posi��o "+ i + " �: " + A[i]); 
			
			/*N�o coloquei o (i+1) porque na soma estava pedindo a posi��o de 0,
			 * ent�o achei que ia ficar estranho aqui contar a partir do 1, pq os valores
			 * ficariam diferentes 
			 */
			
		}
		
					

		
	}

}
