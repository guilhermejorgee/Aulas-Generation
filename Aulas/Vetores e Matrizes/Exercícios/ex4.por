programa
{

//4.	Crie um programa que receba valores do usuário para
//preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal
//principal.
	
	funcao inicio()
	{
		inteiro M1[3][3], l, c, diagonal = 0, soma = 0, slinha1 = 0, slinha2 = 0, slinha3 = 0

		para(l=0; l<3; l++){
			para(c=0;c<3;c++){
			escreva("Escreva os dados da M1: ")
			leia(M1[l][c])	 
			 
			}
			
		  escreva("\nPróxima linha\n\n")
		}

		para(l=0; l<3; l++){
			
			diagonal = diagonal + M1[l][l]

			slinha1 = slinha1 + M1[0][l]
			slinha2 = slinha2 + M1[1][l]
			slinha3 = slinha3 + M1[2][l]
			
		}

		escreva("\nValor da soma da diagonal: ",diagonal)
		escreva("\nValor da soma da matriz: ",slinha1 + slinha2 + slinha3)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 10, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */