programa
{
	inclua biblioteca Matematica --> mat
	
//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:

//R = (A+B)**2

//S = (B + C)**2

//D = (R + S) / 2
	
	funcao inicio()
	{
		
	inteiro a, b, c

	real d, r, s
	
		escreva("Digite o primeiro número (A) ")
		leia(a)
		escreva("Digite o segundo número (B) ")
		leia(b)
		escreva("Digite o terceiro número (C) ")
		leia(c)
		
		r = mat.potencia((a+b), 2)
		s = mat.potencia((b+c), 2) 
		d = (r + s) / 2

		escreva("Valor de R: ",r)
		escreva("\nValor de S: ",s)
		escreva("\nValor de D: ",d)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */