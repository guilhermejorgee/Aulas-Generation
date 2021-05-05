programa
{

//) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
//e se é positivo ou negativo.
	
	
	funcao inicio()
	{
		inteiro N

		escreva("Escreva um número: ")
		leia(N)

		se(N % 2 == 0){
			escreva("Você digitou um numero par")
		}
		senao{
			escreva("Você digitou um numero impar")
		}

		se(N < 0){
			escreva("\nÉ num número negativo")
		}
		senao{
			escreva("\nÉ um número positivo")
		}
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */