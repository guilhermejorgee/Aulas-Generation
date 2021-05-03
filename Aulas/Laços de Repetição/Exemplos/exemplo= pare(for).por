programa
{
	
	funcao inicio()
	{
		inteiro num, contador, maior = 0

		para(contador=1;contador<=5;contador++){

		escreva("\nDigite um número: ")
		leia(num)

		se(num > maior){
			
			maior=num
		}
		escreva("O maior dos números lidos =", maior)

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = 11;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */