programa
{

//3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	
	funcao inicio()                              // 4 = 2 -- 6 == 3
	{
		inteiro N1[2][3], N2 [2][3], l, c, M2[2][3]

		para(l=0; l<2; l++){
			para(c=0;c<3;c++){
			escreva("Escreva os dados da N1: ")
			leia(N1[l][c])	  
			}
		  escreva("\nPróxima linha\n\n")
		}
		
		para(l=0; l<2; l++){
			para(c=0;c<3;c++){
			escreva("Escreva os dados da N2: ")
			leia(N2[l][c])	  
			}
		  escreva("\nPróxima linha\n\n")
		}	
		escreva("\nM1:\n\n")	
		para(l=0; l<2; l++){
			para(c=0;c<3;c++){
				
			escreva("[",N1[l][c] + N2[l][c],"]")	  
			
			}
		  escreva("\n")
		
		}

		escreva("\nM2:\n\n")

		para(l=0; l<2; l++){
			para(c=0;c<3;c++){
				
			escreva("[",N1[l][c] - N2[l][c],"]")	  
			
			}
		  escreva("\n")
		
		}
		
		//para(l=0; l<2; l++){
		//	para(c=0;c<3;c++){
		//		
		//	se(N1[l][c] > N2[l][c]){
		//
		//	   escreva("[",N1[l][c] - N2[l][c],"]")
		//	}
		//	senao{
		//	   escreva("[",N2[l][c] - N1[l][c],"]")	
		//	}
		//	}
	//	escreva("\n")
	//	}

		



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 982; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M2, 11, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */