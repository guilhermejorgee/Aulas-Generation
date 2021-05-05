programa
{
	inclua biblioteca Matematica

//3) Desenvolva um sistema em que:
//•Leia 4 (quatro) números;
//•Calcule o quadrado de cada um;
//•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//•Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	
	funcao inicio()
	{
		real A, B, C, D, E
	
		escreva("Digite o primeiro número: ")
		leia(A)
		escreva("Digite o segundo número: ")
		leia(B)
		escreva("Digite o terceiro número: ")
		leia(C)
		escreva("Digite o quarto número: ")
		leia(D)

		A = Matematica.potencia(A, 2)
		B = Matematica.potencia(B, 2)
		C = Matematica.potencia(C, 2)
		D = Matematica.potencia(D, 2)
		
		se(C>1000){
			escreva("\nResultado do terceiro número: ",C)
		}
		senao{
			escreva("\nResultado do primeiro número: ",A)
			escreva("\nResultado do segundo número: ",B)
			escreva("\nResultado do terceiro número: ",C)
			escreva("\nResultado do quarto número: ",D)
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 649; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */